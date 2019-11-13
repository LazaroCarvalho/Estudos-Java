package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

public class CadastroPedidos {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as informa��es do cliente: "); // Pedindo informa��es ao usu�rio
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nascimento (DIA/MES/ANO): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDeNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataDeNascimento);

		System.out.print("\nStatus do pedido: "); // Status do pedido ser� um tipo enumarado.
		String status = sc.next();
		Date momento = new Date(); // Armazenando o hor�rio em que o pedido foi feito.
		Pedido pedido = new Pedido(momento, StatusPedido.valueOf(status));
		
		System.out.print("\nDeseja adicionar quantos itens ao pedido? ");
		int quantidadeDeItens = sc.nextInt();


		for (int i = 1; i <= quantidadeDeItens; i++) { // La�o que pedir� as do item do pedido. Repetira pelo n�mero de
			System.out.println();					   // pedidos.
			System.out.println("Informa��es do " + i + " item: ");
			System.out.print("Nome do Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Pre�o do Produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();

			ItemPedido item = new ItemPedido(quantidadeProduto, precoProduto, new Produto(nomeProduto, precoProduto));
			pedido.addItem(item);
		}

		System.out.println("\nSum�rio do Pedido: ");	// Mostrando as informa��es do pedido e do cliente

		SimpleDateFormat sdfMomento = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Momento do pedido: " + sdfMomento.format(pedido.getMomento()));
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Cliente: " + cliente);
		System.out.println("\nItens do Pedido: ");
		
		for (ItemPedido x : pedido.getItensDePedido()) {
			System.out.println(x);
		}
		
		System.out.println("Pre�o total: " + pedido.total());
		sc.close();
	}
}
