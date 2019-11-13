// Classe cujos atributos e métodos são referentes aos funcionários da empresas
package entidades;

public class Funcionarios {
	
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	// Construtor
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	// Método que retorna o valor do pagamento.
	public double pagamento() {
		return horas * valorPorHora;
	}

}
