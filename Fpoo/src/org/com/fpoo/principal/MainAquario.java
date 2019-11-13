package org.com.fpoo.principal;

import java.util.Scanner;

public class MainAquario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal animal = new Animal();
		Peixe peixe = new Peixe();
		Cachorro cachorro = new Cachorro();
		
		/********** PEIXES **********/
		System.out.print("Nome de um peixe: ");
		peixe.setNome(sc.next());
		
		System.out.print("Seu peso: ");
		peixe.setPeso(sc.nextDouble());
		
		System.out.print("Habitat: ");
		peixe.setTipoHabitat(sc.next());
		
		/********** CACHORROS **********/
		
		System.out.print("\nNome de um cachorro: ");
		cachorro.setNome(sc.next());
		
		System.out.print("Seu peso: ");
		cachorro.setPeso(sc.nextDouble());
		
		System.out.print("Raça: ");
		cachorro.setRaca(sc.next());
		
		/********** ENVIANDO PARA TELA **********/
		peixe.imprimir();
		cachorro.imprimir();
		
		sc.close();
	}
}
