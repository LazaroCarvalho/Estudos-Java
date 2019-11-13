package org.com.fpoo.principal;

public class ImcCadastro {
	public static void main(String[] args) {
		/********************* OBJETO 1 ************************/
		ImcCliente pessoa = new ImcCliente("Dom Pedro II");
		pessoa.setPeso(80.4);
		pessoa.setAltura(1.79);
		pessoa.setSexo("Masculino");
		pessoa.exibir();
		
		/********************* OBJETO 2 ************************/
		ImcCliente pessoa2 = new ImcCliente("Pessoa II");
		pessoa2.setPeso(57.7);
		pessoa2.setAltura(1.78);
		pessoa.setSexo("Masculino");
		pessoa.exibir();
		
		/********************* OBJETO 3 ************************/
		ImcCliente pessoa3 = new ImcCliente("Pessoa III");
		pessoa3.setPeso(55.4);
		pessoa3.setAltura(1.77);
		pessoa.setSexo("Feminino");
		pessoa.exibir();
	}
}