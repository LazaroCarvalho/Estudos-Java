

import java.util.Scanner;

public class Moldura {
	
	static char bloco = '\u2588';
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("\n Escreva uma frase: ");
		String texto = ler.nextLine();
		moldura(texto);
		
	}
	
	public static void moldura(String frase) {
		int tamanho = frase.length();
		barra(tamanho + 4);
		System.out.println(bloco + " " + frase + " " + bloco);
		barra(tamanho + 4);
	}
	
	public static void barra(int quantidade) {
		for(int i=0 ; i<quantidade ; i++) {
			System.out.print(bloco);
		}
		System.out.println();
	}
}
