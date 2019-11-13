
public class MatrizSoma2 {
	public static void main(String[] args) {
		int mA[][] = new int[][] {{0,-3,5}, {2,-8,4}, {7,-3,2}};
		int mB[][] = new int[][] {{2,1,-4}, {3,8,-10}, {9,4,8}};
		
		int mC[][] = new int[3][3];
		
		for (int linhas = 0; linhas < mA.length; linhas++) {
			for (int colunas = 0; colunas < mA[linhas].length; colunas++) {
				mC[linhas][colunas] = mA[linhas][colunas] + mB[linhas][colunas]; 
			}
		}
		
		for (int linhas = 0; linhas < mA.length; linhas++) {
			for (int colunas = 0; colunas < mA[linhas].length; colunas++) {
				System.out.print(mC[linhas][colunas] + "  ");
			}
			System.out.println();
		}
	}
}
