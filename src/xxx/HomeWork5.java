package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
///////// 第一題呼叫
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);

///////// 第二題呼叫
		randAvg();

///////// 第三題呼叫
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		HomeWork5method h5 = new HomeWork5method();
		System.out.println("(寫在同個類別)int最大值:" + maxElement(intArray));
		System.out.println("(寫在不同類別)int最大值:" + h5.maxElement(intArray));
		System.out.println("(寫在同個類別)double最大值:" + maxElement(doubleArray));
		System.out.println("(寫在不同類別)double最大值:" + h5.maxElement(doubleArray));

///////// 第五題呼叫		
		genAuthCode();

	}

///////// 第一題
	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int k = 1; k <= width; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

///////// 第二題	
	public static void randAvg() {
		System.out.println("本次亂數結果:");
		String str = "";
		int sum = 0;
		int randomNum = (int) (Math.random() * 101);
		for (int i = 0; i < 10; i++) {
			str += randomNum + " ";
			sum += randomNum;
			randomNum = (int) (Math.random() * 101);
		}
		sum /= 10;
		System.out.println(str);
		System.out.print("平均值: " + sum + "\n");

	}

///////// 第三題	
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
		double max = 0.0;
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
///////// 第五題	

//Unicode 表測試
//	char A=65;
//	char Z=90;
//	char a=97;
//	char z=122;
//char zero=48;
//char nine=57;

	public static void genAuthCode() {
		System.out.println("本次隨機產生驗證碼為:");
		String str = "";
		int randomNum = (int) (Math.random() * 61);
		char zero = 48;
		char[] bigWrap = new char[62];
		bigWrap[0] = zero;
		for (int k = 1; k < bigWrap.length; k++) {
			if (zero == 57) {
				zero = 65;
				bigWrap[k] = 65;
				continue;
			}
			if (zero == 90) {
				zero = 97;
				bigWrap[k] = 97;
				continue;
			}
			zero += 1;
			bigWrap[k] = zero;
		}

		for (int i = 0; i < 8; i++) {
			str += bigWrap[randomNum];
			randomNum = (int) (Math.random() * 62);
		}
		System.out.println(str);

//		測試bigWrap開始
//			for (int k = 0; k < bigWrap.length; k++) {
//				System.out.print(bigWrap[k] + " ");
//			}
//			System.out.println();
//		測試bigWrap結束
	}

}
