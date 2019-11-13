// Classe que contém as informações de um produto usado.
package entities;

public class ProdutoImportado extends Produto {	

	private Double impostos;

	// Construtores
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double impostos) {
		super(nome, preco);
		this.impostos = impostos;
	}

	// Getters e Setters
	public Double getImpostos() {
		return impostos;
	}

	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}
	
	@Override
	public String precoEtiqueta() {
		return super.precoEtiqueta() + " (Custos de importação: $" + precoTotal() + " )";
	}
	
	public double precoTotal() {
		return getPreco() + impostos;
	}
}
