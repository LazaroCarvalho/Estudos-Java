package org.com.fpoo.principal;

public class Cachorro extends Animal {
	protected String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\nINFORMAÇÕES DO CACHORRO: \n");
		System.out.println("Nome: " + nome + "\nPeso: " + peso + "\nRaca: " + raca);
	}
}
