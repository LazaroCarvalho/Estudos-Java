// Classe que recebe as informações quanto aos produtos vendidos.
package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class VendaProdutos {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Deseja vender quantos produtos? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // Pedindo informações quanto ao produto a ser vendido.
			System.out.println("Produto #" + i);
			System.out.print("Produto comum, usado ou importado? (c/u/i): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();

			if (ch == 'c') { // Se o produto for comum, executa-se este IF (ch == 'c')
				System.out.println();
				produtos.add(new Produto(nome, preco));
			} else if (ch == 'u') { // Executa-se caso produto seja usado (ch == 'u')
				System.out.print("Data de fabricação (DIA/MÊS/ANO): ");
				String data = sc.next();
				System.out.println();
				produtos.add(new ProdutoUsado(nome, preco, sdf.parse(data)));
			} else { // Executa-se caso produto seja importado (ch == 'i')
				System.out.print("Valor de importação: ");
				double importacao = sc.nextDouble();
				System.out.println();
				produtos.add(new ProdutoImportado(nome, preco, importacao));
			}
		}
		
		// Mostrando as etiquetas dos produtos.
		for (Produto x : produtos) {
			System.out.println(x.precoEtiqueta());
		}
		
		sc.close();
	}
}
