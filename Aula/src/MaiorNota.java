import java.util.Scanner;
public class MaiorNota {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double notas[] = new double[4];
		
		double valorMinimo = 999999999;			// Variáveis que serão submetidas à comparação.
		double valorMaximo = 0;
		
		for (int i = 0; i < notas.length; i++) { 		// Armazenando os valores inseridos pelo usuário nas variáveis do VETOR notas[].
			System.out.print("Nota do " + (i+1) + "º Bimestre: ");
			notas[i] = ler.nextDouble();
			if (notas[i] > valorMaximo) {				// Verificando qual o maior e o menor valor inserido pelo usuário.
				valorMaximo = notas[i];
			}
			if (notas[i] < valorMinimo) {
				valorMinimo = notas[i];
			}
		}
		
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {		// Somando os valores
			soma = soma + notas[i];
		}
		double media = soma / notas.length;			// Calculando média / Mostrando a média ao usuário.
		
		if (media > 6.9) {
			System.out.println("Média: " + media + "\nMaior nota: " + valorMaximo + "\nMenor nota: " + valorMinimo + "\nALUNO APROVADO!");
		}
		else if (media >= 5 && media <= 6.9) {
			System.out.println("Média: " + media + "\nMaior nota: " + valorMaximo + "\nMenor nota: " + valorMinimo + "\nALUNO ESTÁ DE RECUPERAÇÃO!");
		}
		else {
			System.out.println("Média: " + media + "\nMaior nota: " + valorMaximo + "\nMenor nota: " + valorMinimo + "\nALUNO REPROVADO KKKKKKKKKK!");
		}
	}
}


















