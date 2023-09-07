package xxx;

public class TestNineNine {
	public static void main(String[] args) {
		int i = 1, k = 1;

//while for 
//		while(i<=9) {
//			for(k=1;k<=9;k++) {
//				System.out.print(i+"*"+k+"="+i*k+" ");
//			}
//			System.out.println();
//			i++;
//		};

		System.out.println("for + while ");
		System.out.println();
		for (k = 1; k <= 9; k++) {
			while (i <= 9) {
				System.out.print(k + "*" + i + "=" + k * i + " ");
				i++;
			}
			i = 1;
			System.out.println();
		}
		System.out.println();

//do while for 
//		do{
//			for(k=1;k<=9;k++) {
//				System.out.println(i+"*"+k+"="+i*k);
//			}
//			i++;
//		}while(i<10);

		System.out.println("for + do while ");
		System.out.println();
		for (k = 1; k <= 9; k++) {
			do {
				System.out.print(k + "*" + i + "=" + k * i + " ");
				i++;
			} while (i <= 9);
			i = 1;
			System.out.println();
		}
		System.out.println();

//do while  while
//		do {
//			k=1;
//			while(k<10) {
//				System.out.println(i+"*"+k+"="+i*k);
//				k++;
//			}
//		}while(i++<9);

		System.out.println("while + do while ");
		System.out.println();
		i = 1;
		k = 1;
		while (k <= 9) {
			do {
				System.out.print(k + "*" + i + "=" + k * i + " ");
				i++;
			} while (i <= 9);
			k++;
			i = 1;
			System.out.println();
		}

	}
}
