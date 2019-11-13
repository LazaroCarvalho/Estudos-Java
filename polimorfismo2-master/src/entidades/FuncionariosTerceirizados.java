// Classe cujos atributos e m�todos s�o referentes aos funcion�rios terceirizados.
package entidades;

public class FuncionariosTerceirizados extends Funcionarios{
	
	private Double despesaAdicional;

	// Construtor
	public FuncionariosTerceirizados(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	// Getters e Setters
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
}
