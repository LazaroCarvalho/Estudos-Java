import java.util.Random;
public class NumerosAleatorios {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int dimensoes = 50;
		int matriz[][] = new int[dimensoes][dimensoes];
		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				matriz[linhas][colunas] = aleatorio.nextInt(51); 
			}
		}
		
		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				System.out.print(matriz[linhas][colunas] + " ");
			}
			System.out.println();
		}
	}
}
