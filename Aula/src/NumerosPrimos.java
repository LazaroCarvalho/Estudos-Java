
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor = 0;
		
		ArrayList<Integer> divisiveis = new ArrayList<>();
		
		while (true) {
			System.out.println("Digite um numero > 1");
			valor = ler.nextInt();
			
			if (valor > 1) {
				break;
			}
		}
		
		
		boolean ref = true;
		for (int i = 2; i <= valor / 2; i++) {
			if (valor % i == 0) {
				divisiveis.add(i);
				ref = false;
			}
		}
		
		if (ref) {
			System.out.println("O número " + valor + " é primo!");
		}
		else {
			System.out.println("O numero " + valor + " não é primo! É divisível por: \n");
			for (int i = 0; i < divisiveis.size(); i++) {
				System.out.print(divisiveis.get(i) + " ");
			}
		}
	}
}
