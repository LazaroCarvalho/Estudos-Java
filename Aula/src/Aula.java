
public class Aula {
	public static void main(String [] args) {
		double numero1 = 4.7;
		double numero2 = 0;
		double resultadoSoma = soma(numero1, numero2);
		System.out.println(numero1 +  " + " + numero2 + " = " + resultadoSoma);
		
		double resultadoSubtracao = subtracao(numero1, numero2);
		System.out.println(numero1 +  " - " + numero2 + " = " + resultadoSubtracao);
		
		double resultadoMultiplicacao = multiplicacao(numero1, numero2);
		System.out.println(numero1 +  " * " + numero2 + " = " + resultadoMultiplicacao);
		
		if(numero2 != 0) {
			double resultadoDivisao = divisao(numero1, numero2);
			System.out.println(numero1 +  " / " + numero2 + " = " + resultadoDivisao);
		}
		else {
			System.out.println("Não há divisões por zero!");
		}
	}
	
	
	public static double soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
	
	
	public static double subtracao(double numero1, double numero2 ) {
		double resultado = numero1 - numero2;
		return resultado;
	}
	
	
	public static double multiplicacao(double numero1, double numero2 ) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	
	public static double divisao(double numero1, double numero2 ) {
		double resultado = numero1 / numero2;
		return resultado;
	}
}
