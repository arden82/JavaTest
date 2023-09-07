package xxx;

public class Homework2 {
	public static void main(String[] args) {
		int sumTotal = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;
			}
			// System.out.println(i);
			sumTotal += i;
		}
		System.out.println("偶數和 " + sumTotal);

		int multipTotal = 1;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(multipTotal*=i);
			multipTotal *= i;
		}
		System.out.println("for迴圈連乘積 " + multipTotal);

		multipTotal = 1;
		int k = 1;
		while (k <= 10) {
			multipTotal *= k;
			k++;
		}
		System.out.println("while迴圈連乘積 " + multipTotal);

		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}

		System.out.println();
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i / 10 == 4) {
				continue;
			}
			count++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("數量 " + count);

		int num = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(j + " ");
			}
			num--;
			System.out.println();
		}

		System.out.println();

		for (char i = 'A'; i <= 'F'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}
}