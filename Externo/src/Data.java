public class Data {
	private String dataBase;
	
	/***** CONSTRUTOR *****/	
	public Data(String dataBase) {
		this.dataBase = dataBase;
	}

	/***** GETTERS E SETTERS *****/
	public void setdataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public String getdataBase() {
		return dataBase;
	}

	/***** MÉTODOS *****/
	public String somarDias(int incrementoDeDias) {
		String datasArray[] = dataBase.split("/");	//Este array receberá os valores da dataBase (Dia/Mês/Ano) de tipo String.
		int dias = Integer.parseInt(datasArray[0]);	// Estas variáveis receberão os valores String da dataBase convertidos para inteiros.
		int meses = Integer.parseInt(datasArray[1]);	// Separando dia, mês e ano.
		int anos = Integer.parseInt(datasArray[2]);	//
		for(int x = anos; incrementoDeDias > 0; x++) {
			for (int i = meses; i <= 12 && incrementoDeDias > 0; i++) {
				switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					for (int j = dias + 1; j <= 31 && incrementoDeDias > 0; j++, incrementoDeDias--) {
						datasArray[0] = String.valueOf(j);	
						datasArray[1] = String.valueOf(i);
						datasArray[2] = String.valueOf(x);
					}
					dias = 0;
					break;
				case 2:
					if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) { // SE O ANO FOR BISSEXTO, ESTE LAÇO SERÁ EXECUTADO!
						for (int j = dias + 1; j <= 29 && incrementoDeDias > 0; j++, incrementoDeDias--) {
							datasArray[0] = String.valueOf(j);
							datasArray[1] = String.valueOf(i);
							datasArray[2] = String.valueOf(x);
						}
						dias = 0;
						break;
					}
					else {
						for (int j = dias + 1; j <= 28 && incrementoDeDias > 0; j++, incrementoDeDias--) { // SE O ANO NÃO FOR BISSEXTO, ESTE 
							datasArray[0] = String.valueOf(j);
							datasArray[1] = String.valueOf(i);
							datasArray[2] = String.valueOf(x);
						}
						dias = 0;
						break;
					}
				case 4: case 6: case 9: case 11:
					for (int j = dias + 1; j <= 30 && incrementoDeDias > 0; j++, incrementoDeDias--) {
						datasArray[0] = String.valueOf(j);	
						datasArray[1] = String.valueOf(i);
						datasArray[2] = String.valueOf(x);
					}
				}
			}
			meses = 1;
		}
		return datasArray[0] + "/" + datasArray[1] + "/" + datasArray[2];
	}
	
	public String subtrairDias(int incrementoDeDias) {
		String datasArray[] = dataBase.split("/");	//Este array receberá os valores da dataBase (Dia/Mês/Ano) de tipo String.
		int dias = Integer.parseInt(datasArray[0]);	// Estas variáveis receberão os valores String da dataBase convertidos para inteiros.
		int meses = Integer.parseInt(datasArray[1]);	// Separando dia, mês e ano.
		int anos = Integer.parseInt(datasArray[2]);	//
		for(int x = anos; incrementoDeDias > 0; x--) {
			for (int i = meses; i >= 1 && incrementoDeDias > 0; i--) {
				switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					for (int j = dias; j >= 1 && incrementoDeDias > 0; j--, incrementoDeDias--) {
						datasArray[0] = String.valueOf(j);	
						datasArray[1] = String.valueOf(i);
						datasArray[2] = String.valueOf(x);
					}
					dias = 31;
					break;
				case 2:
					if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) { // SE O ANO FOR BISSEXTO, ESTE LAÇO SERÁ EXECUTADO!
						for (int j = dias + 1; j >= 29 && incrementoDeDias > 0; j--, incrementoDeDias--) {
							datasArray[0] = String.valueOf(j);
							datasArray[1] = String.valueOf(i);
							datasArray[2] = String.valueOf(x);
						}
						dias = 29;
						break;
					}
					else {
						for (int j = dias; j >= 1 && incrementoDeDias > 0; j--, incrementoDeDias--) { // SE O ANO NÃO FOR BISSEXTO, ESTE 
							datasArray[0] = String.valueOf(j);
							datasArray[1] = String.valueOf(i);
							datasArray[2] = String.valueOf(x);
						}
						dias = 28;
						break;
					}
				case 4: case 6: case 9: case 11:
					for (int j = dias; j >= 1 && incrementoDeDias > 0; j--, incrementoDeDias--) {
						datasArray[0] = String.valueOf(j);	
						datasArray[1] = String.valueOf(i);
						datasArray[2] = String.valueOf(x);
					}
					dias = 30;
				}
			}
			meses = 12;
		}
		return datasArray[0] + "/" + datasArray[1] + "/" + datasArray[2];
	}
}