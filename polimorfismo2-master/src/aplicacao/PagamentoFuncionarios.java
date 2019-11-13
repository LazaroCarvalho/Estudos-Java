// Classe que pede as informa��es dos funcion�rios, como o sal�rio, nome e etc.
package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.FuncionariosTerceirizados;

public class PagamentoFuncionarios {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> funcionario = new ArrayList<>();
		
		System.out.print("N�mero de funcion�rios: ");
		int numeroDeFuncionarios = sc.nextInt();
		
		for (int i = 1; i <= numeroDeFuncionarios; i++) {	// La�o que pedir� as informa��es do funcion�rio
			System.out.println("Funcion�rio " + i);
			System.out.print("Terceirizado? (s/n): ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (resposta == 's' || resposta == 'S') {	// Se o funcion�rio for terceirizado (resposta = 'S'), executa-se o IF.
				System.out.print("Dispesa adicional: ");
				double dispesaAdicional = sc.nextDouble();
				System.out.println();	
				funcionario.add(new FuncionariosTerceirizados(nome, horas, valorPorHora, dispesaAdicional));
			} else {	// Se o funcion�rio N�O for terceirizado (resposta == 'N'), executa este else.
				System.out.println();
				funcionario.add(new Funcionarios(nome, horas, valorPorHora));
			}
		}
		
		for (Funcionarios x : funcionario) {	// Percorrendo a lista e exibindo algumas informa��es do funcion�rio
			System.out.println(x.getNome() + " - " + x.pagamento());
		}
	}
}
