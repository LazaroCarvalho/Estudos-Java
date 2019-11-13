
public class MatrizesSoma {
	public static void main(String[] args) {
		int m1[][] = new int[][] {{5,8}, {2,0,4}};
		int m2[][] = new int[][] {{1,4}, {3,6}};
		int m3[][] = new int[2][2];
		
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[0].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
	}
}
