// Classe referente aos contribuintes que são Pessoas Físicas.
package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosSaude;
	
	// Construtores
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}
	
	// Getters e Setters
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double impostos() { // Método para calculo do imposto.
		if (getRenda() < 20000) {
			return getRenda() * 0.15 - gastosSaude * 0.5;
		}
		else {
			return getRenda() * 0.25 - gastosSaude * 0.5;
		}
	}

}
