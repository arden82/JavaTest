package xxx;

public class ThreeXthree {
	public static void main(String[] args) {
		// random = (int)(Math.random()*(MAX-min+1)) + min
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				y[i][j] = (int) (Math.random() * 31);
				z[i][j] = x[i][j] + y[i][j];
				System.out.println(x[i][j]+"+" +y[i][j]+"="+z[i][j]);
				
			}
		}

//		System.out.println(x[0][1]);
//		System.out.println(y[0][1]);
//		System.out.println(z[0][1]);
	}
}
