// Classe que adiciona valores aos atributos da classe ImcPessoa2.
// Mostra o imc do usuário.
package org.com.fpoo.principal;

import java.text.DecimalFormat;

public class MainImcPessoa2 {
	public static void main(String[] args) {
		ImcPessoa2 pessoa = new ImcPessoa2("Maria");
		DecimalFormat formatar = new DecimalFormat("#00.00");
		
		pessoa.setPeso(85.4);
		pessoa.setAltura(1.66);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Imc: " + formatar.format(pessoa.calculaImc()));
		
		String estado = " ";
		if (pessoa.estadoPessoa()) {
			estado = "Is good!";
		}
		else {
			estado = "Is not good!";
		}
		
		System.out.println("Situação: " + estado);
	}
}
