package ExercicioUm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		// Objetos para data.
		Calendar inicioLocacao = Calendar.getInstance();
		Calendar fimLocacao = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date dataInicio = new Date();
		Date dataFinal = new Date();
		
		// Pedindo as informações quanto a locação.
		System.out.println("Informações da Locação");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.next();
		sc.nextLine();
		
		System.out.print("Entrega: ");
		dataInicio = sdf.parse(sc.nextLine());
		
		System.out.print("Retorno: ");
		dataFinal = sdf.parse(sc.nextLine());
		
		System.out.print("Preço por hora: ");
		double precoHora = sc.nextDouble();
		
		System.out.print("Preço por dia: ");
		double precoDia = sc.nextDouble();
		
		Locacao locacao = new Locacao();
		
		// Preenchendo os atributos do objeto.
		locacao.setValorHora(precoHora);
		locacao.setValorDia(precoDia);
		locacao.setModeloVeiculo(modeloCarro);
		locacao.setInicioLocacao(dataInicio);
		locacao.setFimLocacao(dataFinal);
		
		// mostrando os dados
		System.out.println("Resultados: ");
		
		System.out.println("Pagamento inicial: " + locacao.valorLocacao());
		
		System.out.println("Imposto: " + locacao.valorImposto());
		
		System.out.println("Pagamento total: " + locacao.valorTotal());	
		
	}
	
}
