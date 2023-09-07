package xxx;

import java.util.Scanner;

public class CalTest_2 {
	public static void main(String[] args) {
		int close = 0;
		//如果把Scanner放入迴圈中，又沒有關閉，會一直產生Scanner物件
		Scanner sc = new Scanner(System.in);
		while (close == 0) {
			try {
				System.out.println("請輸入x值:");
				int x = sc.nextInt();
				System.out.println("請輸入y值:");
				int y = sc.nextInt();
				Calculator_2 c1 = new Calculator_2();
				System.out.println(x + "的" + y + "次方等於" + c1.powerXY(x, y));
				close++;
			} catch (CalException e) {
				System.out.println(e.getMessage());

			} catch (Exception e) {
				System.out.println("輸入格式不正確");
				sc.next();
				//跳脫格式不正確的enter
				
			}

		}

	}

}
