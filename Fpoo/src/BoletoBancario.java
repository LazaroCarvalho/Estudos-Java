import java.text.SimpleDateFormat;
import java.util.Date;
		
public class BoletoBancario {
	public String codigoDeBarras;

	/***** GETTERS AND SETTERS *****/
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	/***** METHODS *****/
	
	/***** getBanco, retorna o nome do banco ao qual pertece o boleto. *****/
	public String getBanco() {
		String banco = "";
		for (int i = 0; i < 3; i++) {
			banco = banco + codigoDeBarras.charAt(i);
		}
		switch(banco) {
			case "479":
				return "Banco ITAU";
			case "001":
				return "Banco do Brasil";
			case "033":
				return "Santander";
			case "237":
				return "Bradesco";
			case "623":
				return "BANCO PAN";
			default:
				return "Banco não cadastrado!";
		}
	}

	// Retorna a data de vencimento do boleto 
	public String getDataDeVencimento() {
		String banco = "";
		for (int i = 31; i < 35; i++) {
			banco = banco + codigoDeBarras.charAt(i);	// Retira da String os valores que correspondem a data de vencimento do boleto
		}
		Date base = new Date("7/10/1997");	//7/10/1997 é a data base para o calculo da data de vencimento do boleto.
		base.setDate(base.getDate() + Integer.parseInt(banco));	// Soma a data base o valor da variável banco, convertido para Int, que corresponde a data de vencimento.
		String formato = "dd/MM/yyyy";
		SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);
		return dataFormatada.format(base);
	}

	// Retorna o valor em reais do boleto.
	public double getValor() {
		String banco = "";
		for (int i = 37; i < 47; i++) {
			banco = banco + codigoDeBarras.charAt(i);	//
		}
		return Double.parseDouble(banco)/100;
	}

}
