import java.util.Scanner;

public class MediaMatematica {
	public static void main(String[] args) {
		double nota[] = new double[4];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < nota.length; i++) {			// Armazenando valores inseridos pelo usuário no Vetor nota[].
			System.out.print("Nota do " + (i+1) + "º Bimestre: ");
			nota[i] = ler.nextDouble();
		}
		
		double soma = 0;
		
		for (int i = 0; i < nota.length; i++) {			// Somando as notas.
			soma += nota[i];
		}
		double media = soma / nota.length;				// Calculando a média das notas / Exibindo na tela.
		System.out.println("A média final é: " + media);
	}
}
