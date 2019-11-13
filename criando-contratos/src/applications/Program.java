/* Classe que pede as informações referentes ao trabalhador, armazenando-as
 * Nas classes HourContract, Worker e Departament.
 */
package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.num.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdfContract = new SimpleDateFormat("dd/MM/yyyy");
		
		/* Pedindo informações referente ao funcionário. 
		 * Guardando-as em um objeto worker
		 */
		System.out.print("Nome do departamento: ");
		String departamentWorker = sc.next();
		
		System.out.println("Informações do Funcionário: ");
		System.out.print("Nome: ");
		String nameWorker = sc.next();
		System.out.print("Level: ");
		String levelWorker = sc.next();
		System.out.print("Salário bruto: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker), baseSalary, new Departament(departamentWorker));
		
		System.out.print("Quantos contratos deseja adicionar ao funcionário? ");
		int quantidadeContratos = sc.nextInt();
		
		/* Pedindo as informações referentes ao contrato do funcionário.
		 * Serão feitos a quantidade de contratos requeridos pelo usuário.
		 */
		for (int i = 1; i <= quantidadeContratos; i++) {
			System.out.println();
			System.out.println("Contrato #" + i);
			System.out.print("Data: ");
			Date dateContract = sdfContract.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPerHour = sc.nextDouble();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(dateContract, valorPerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("Deseja ver a renda total de qual mês e ano? ");
		String month_year = sc.next();
		String[] list = month_year.split("/");
		int month = Integer.parseInt(list[0]);
		int year = Integer.parseInt(list[1]);
		double renda = worker.renda(month, year);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament());
		System.out.println("Renda em " + month_year + ": " + renda);
		
		sc.close();
	}
}
