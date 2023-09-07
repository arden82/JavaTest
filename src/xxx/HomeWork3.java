package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {

//////////////////第一題進階混和

//		System.out.println("請輸入三個數字");
//		Scanner sc = new Scanner(System.in);
//		int[] i = new int[3];
//		for (int k = 0; k < i.length; k++) {
//			i[k] = sc.nextInt();
//		}
//		Arrays.sort(i);
//		int line1 = i[0];
//		int line2 = i[1];
//		int line3 = i[2];
//		int[] linePowArr = new int[3];
//		for (int k = 0; k < i.length; k++) {
//			linePowArr[k] = (int) (Math.pow(i[k], 2));
//		}
//		int linePow12 = linePowArr[0] + linePowArr[1];
//		int linePow3 = linePowArr[2];
//		if ((line3 >= line1 + line2) || line1 == 0) {
//			System.out.println("不是三角形");
//		} else if (linePow12 == linePow3) {
//			System.out.println("直角三角形");
//		} else if (line1 == line2 && line2 == line3) {
//			System.out.println("正三角形");
//		} else if (line1 == line2 || line2 == line3) {
//			System.out.println("等腰三角形");
//		} else {
//			System.out.println("其他三角形");
//		}

////////////////第二題

//		System.out.println("0~9的數字");
//		int correct = (int) (Math.random() * 10 + 1);
//		Scanner sc = new Scanner(System.in);
//		int ans = sc.nextInt();
//		while (ans != correct) {
//			System.out.println("猜錯囉");
//			ans = sc.nextInt();
//		}
//		System.out.println("答對了! 答案就是" + correct);
	

////////////////第二題進階	

//		System.out.println("0~100的數字");
//		int correct = (int) (Math.random() * 101 + 1);
//		Scanner sc = new Scanner(System.in);
//		int ans = sc.nextInt();
//		while (ans != correct) {
//			System.out.println("猜錯囉");
//			if(ans>correct) {
//				System.out.println("你的答案大於正確答案");
//			}else {
//				System.out.println("你的答案小於正確答案");
//			}
//			ans = sc.nextInt();
//		}
//		System.out.println("答對了! 答案就是" + correct);

////////////////第三題

//		System.out.println("阿文...請輸入你討厭那些數字");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int count = 0;
//		while (num <= 0||num>9) {
//			System.out.println("超過範圍請重新輸入");
//				num = sc.nextInt();
//		}
//		for (int n = 1; n <= 49; n++) {
//			if (n / 10 == num || n % 10 == num) {
//				continue;
//			}
//			if (count % 6 == 0 && count != 0) {
//				System.out.println(n);
//			} else {
//				System.out.print(n + " ");
//			}
//			count++;
//
//		}
//		System.out.println();
//		System.out.println("總共有" + count + "數字可以選");

////////////////第三題進階

		System.out.println("阿文...請輸入你討厭那些數字");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int index = 0;
		while (num <= 0||num>9) {
			System.out.println("超過範圍請重新輸入");
			num = sc.nextInt();
		}
		for (int n = 1; n <= 49; n++) {
			if (n / 10 == num || n % 10 == num) {
				continue;
			}
			count++;
		}
		System.out.println("總共有多少數字可以做電腦選號" + count + "個");
		int[][] numArr = new int[1][count];
		for (int n = 1; n <= 49; n++) {
			if (n / 10 == num || n % 10 == num) {
				continue;
			}
			numArr[0][index] = n;
			if (index % 6 == 0 && index != 0) {
				System.out.println(numArr[0][index]);
			} else {
				System.out.print(numArr[0][index] + " ");
			}

			index++;
		}
		System.out.println();
		System.out.println("==============================");
		int randomNum;
		int[][] randomWrap = new int[1][6];
		for (int n = 0; n < 6; n++) {
			randomNum = (int) (Math.random() * count);
			Arrays.sort(randomWrap[0]);
			while (Arrays.binarySearch(randomWrap[0], numArr[0][randomNum]) >= 0) {
//				System.out.println("==============while亂數重複重製內部================");
//				System.out.println("numArr[0]["+randomNum+"]"+numArr[0][randomNum]);
				randomNum = (int) (Math.random() * count);
//				System.out.println("重製後numArr[0]["+randomNum+"]"+numArr[0][randomNum]);
//				System.out.println("==============while亂數重複重製結束================");
			}
			randomWrap[0][5 - n] = numArr[0][randomNum];
//			System.out.println("numArr[0]["+randomNum+"]"+numArr[0][randomNum]);
		}

		Arrays.sort(randomWrap[0]);
		for (int n = 0; n < randomWrap[0].length; n++) {
			System.out.print(randomWrap[0][n] + " ");
		}

	}
}
