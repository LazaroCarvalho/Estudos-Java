/* Classe contendo os dados do trabalhador, bem como métodos que definem e recebem
 * Seu salário, seus contratos, nome e nível.
 */
package entities;

import java.util.ArrayList;
import java.util.Calendar;

import entities.num.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	// Objetos referentes as dependências da classe Worker.
	private ArrayList<HourContract> contracts = new ArrayList<>();
	private Departament departament;
	
	// Constructors
	public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	/* Método para adicionar contratos ao trabalhador, recebendo-os 
	 * da classe Program.
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// Método para remover os contratos do trabalhador.
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	/*Método para calcular a renda total de um trabalhador 
	 *em um respectivo mês informado.
	 */
	public double renda(int month, int year) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract x : contracts) {
			cal.setTime(x.getDate());
			int c_month = 1 + cal.get(Calendar.MONTH);
			int c_year = cal.get(Calendar.YEAR);
			if (month == c_month && year == c_year) {
				soma += x.totalValue();
			}
		}
		return soma;
	}
}
