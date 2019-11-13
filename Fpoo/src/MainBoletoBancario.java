
public class MainBoletoBancario {
	public static void main(String[] args) {
		BoletoBancario boleto = new BoletoBancario();
		
		boleto.setCodigoDeBarras("62390001172100004802134013763767978900000044361");
		
		String banco = boleto.getBanco();
		System.out.println("Banco: " + boleto.getBanco());
		
		String data = boleto.getDataDeVencimento();
		System.out.println("Data: " + boleto.getDataDeVencimento());
		
		Double valor = boleto.getValor();
		System.out.println("Valor do boleto: R$" + valor);
		
		
	}
}
