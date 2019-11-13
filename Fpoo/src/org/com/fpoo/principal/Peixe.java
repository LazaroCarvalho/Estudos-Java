package org.com.fpoo.principal;

public class Peixe extends Animal {
	protected String tipoHabitat;

	/********** GETTERS AND SETTERS **********/
	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\nINFORMAÇÕES DO PEIXE: ");
		System.out.println("Nome: " + nome + "\nPeso: " + peso + "\nHabitat: " + tipoHabitat);
	}
}
