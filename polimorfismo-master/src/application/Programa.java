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

		List<Contribuinte> contribuinte = new ArrayList<>(); // Lista que armazenará todas as informações dos
																// Contribuintes

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte " + i);
			System.out.print("Funcionário ou companhia? (f/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (ch == 'f') { // If que verifíca se o contribuinte é pessoa física ou jurídica
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				contribuinte.add(new PessoaFisica(nome, renda, gastosSaude));
				System.out.println();
			} else {
				System.out.print("Quantidade de Funcionários: ");
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
