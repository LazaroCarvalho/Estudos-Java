//Classe referente aos contribuintes que são Pessoas Jurídicas.
package entities;

public class PessoaJuridica extends Contribuinte{

	private Integer funcionarios;
	
	// Construtores
	public PessoaJuridica() {

	}
	
	public PessoaJuridica(String nome, Double renda, Integer funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}
	
	// Getters e Setters
	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double impostos() { // Método para calculo do imposto.
		if (funcionarios <= 10) {
			return getRenda() * 0.16;
		}
		else {
			return getRenda() * 0.14;
		}
	}
}
