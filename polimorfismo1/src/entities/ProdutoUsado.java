// Classe que contém as informações de um produto usado.
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {	

	private Date dataFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtores
	public ProdutoUsado() {
		super();
	}
	
	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	// Getters e Setters
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String precoEtiqueta() {
		return getNome() + " (usado) " + " $ " + getPreco() + " (Fabricação: " + sdf.format(dataFabricacao) + ")";
	}
}
