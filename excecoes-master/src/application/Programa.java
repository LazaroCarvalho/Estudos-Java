package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Poupanca;
import model.exceptions.SaqueException;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("INSIRA OS DADOS DA CONTA!");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Titular: ");
			String titular = sc.next();
			System.out.print("Balanço inicial: ");
			double balanco = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			Poupanca poupanca = new Poupanca(numero, titular, balanco, limiteSaque);
			
			System.out.print("Valor a ser sacado: ");
			poupanca.saque(sc.nextDouble());
			System.out.println("Balanço atualizado: " + poupanca.getBalanco());
		}
		catch(InputMismatchException e) {
			System.out.println("O valor inserido é inválido!");
		}
		catch(SaqueException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Um erro inesperado ocorreu!");
		}
		finally{
			sc.close();
		}
	}
}
