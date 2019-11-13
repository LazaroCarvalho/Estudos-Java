import java.util.Scanner;

public class MainData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Data data = new Data("07/10/1997");
		
		String datasMenos = "";
		String datas = "";
		char resposta = 'N';
		while (true) {
			System.out.print("DATA BASE: " + data.getdataBase() + "\nDESEJA SOMAR QUANTOS DIAS? ");
			datas = data.somarDias(sc.nextInt());
			System.out.println("\nDATA: " + datas);
			
			System.out.println("Deseja subtrair quantos dias");
			datasMenos = data.subtrairDias(sc.nextInt());
			System.out.println("Data: " + datasMenos);
			
			System.out.println("\nDeseja somar novamente?");
			resposta = sc.next().charAt(0);
			System.out.println();
			
			if (resposta == 'n' || resposta == 'N') {
				sc.close();
				System.out.println("FECHANDO O PROGRAMA...\n");
				System.exit(0);
			}
		}
	}
}
