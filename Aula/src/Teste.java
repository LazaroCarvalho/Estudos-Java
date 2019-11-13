
public class Teste {
	public static void main(String[] args) {
		double soma = 0;
		
		try {
			for (int i = 0; i < args.length; i++) {
				soma = soma + Double.parseDouble(args[i]);
			}
			System.out.println(soma);
		}
		catch (NumberFormatException erro) {
			System.out.println("\nSomente numeros sao aceitos!");
		}
		catch (Exception erro) {
			System.out.println("Erro inesperado!");
		}
	}
}
