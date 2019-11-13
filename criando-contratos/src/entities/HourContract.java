// Classe que armazena as informações a respeito do contrato.s
package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valorPerHour;
	private int hours;
	
	// Constructor
	public HourContract(Date date, double valorPerHour, int hours) {
		this.date = date;
		this.valorPerHour = valorPerHour;
		this.hours = hours;
	}

	// Getters and Setters
	public Date getDate() {
		return date;
	}

	public double getValorPerHour() {
		return valorPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setValorPerHour(double valorPerHour) {
		this.valorPerHour = valorPerHour;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valorPerHour * hours;
	}
}
