package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos contribuintes? ");
		int n = sc.nextInt();

		List<Contribuinte> contribuinte = new ArrayList<>(); // Lista que armazenar� todas as informa��es dos
																// Contribuintes

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte " + i);
			System.out.print("Funcion�rio ou companhia? (f/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (ch == 'f') { // If que verif�ca se o contribuinte � pessoa f�sica ou jur�dica
				System.out.print("Gastos com sa�de: ");
				double gastosSaude = sc.nextDouble();
				contribuinte.add(new PessoaFisica(nome, renda, gastosSaude));
				System.out.println();
			} else {
				System.out.print("Quantidade de Funcion�rios: ");
				int numeroFuncionarios = sc.nextInt();
				contribuinte.add(new PessoaJuridica(nome, renda, numeroFuncionarios));
				System.out.println();
			}
		}

		System.out.println("Impostos pagos: ");
		double soma = 0;
		for (Contribuinte x : contribuinte) { // Mostrando os nomes e impostos de cada contribuinte, e somando os
			System.out.printf(x.getNome() + " - R$%.2f%n", x.impostos()); // valores de todos os impostos
			soma += x.impostos();
		}

		System.out.println("\nTotal de impostos arrecadado: " + soma);	

		sc.close();
	}

}
