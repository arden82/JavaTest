package xxx;

import java.util.Arrays;

public class HomeWork5method {
	public static int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if (max <= 0) {
				max = x[i][x[i].length - 1];
			}
			for (int k = 0; k < x[i].length; k++) {
				if (max < x[i][k]) {
					max = x[i][k];
				}
			}
		}
		return max;
	}
	public static double maxElement(double x[][]) {
		double  max = 0.0;
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if (max <= 0.0) {
				max = x[i][x[i].length - 1];
			}
			for (int k = 0; k < x[i].length; k++) {
				if (max < x[i][k]) {
					max = x[i][k];
				}
			}
		}
		return max;
	}
}
