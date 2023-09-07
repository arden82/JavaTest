package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {

		////// 第一題
//		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int avg = 0;
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			avg += arr[i];
//		}
//		avg /= (arr.length);
//		System.out.println("平均值"+avg);
//		System.out.print("大於平均值:");
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > avg) {
//				System.out.print(arr[i] + " ");
//			}
//		}

//////
//////
//////
		////// 第二題
//		String s="Hello World";
//		int sNum=s.length();
//		for(int i=0;i<sNum;i++) {
//			System.out.print(s.charAt((sNum-1)-i));
//		}

//////
//////
//////
		////// 第三題
//		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		String[] vowel = { "a", "e", "i", "o", "u" };
//		int sum=0;
//		String str;
//		String strValue;
//		for (int j = 0; j < vowel.length; j++) {
//	
//			for (int i = 0; i < planet.length; i++) {
//				str=planet[i];
//				int strNum=str.length();
//				for(int k=0;k<strNum;k++) {
//					 strValue=String.valueOf(str.charAt(k));
//					if(vowel[j].compareTo(strValue)==0){
//						sum++;
//					}
//					
//				}
//			}
//		}
//		System.out.println("總個"+sum+"母音");
//////
//////
//////
		////// 第四題
//		int[][] money = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		String str = " ";
//		int sum = 0;
//
//		while (sum == 0) {
//			for (int i = 0; i < money.length; i++) {
//				if (money[i][1] >= value) {
//					str += money[i][0] + " ";
//					sum++;
//				}
//			}
//			System.out.print("有錢可借的員工編號: " + str + "總共" + sum + "人");
//		    System.out.println();
//			value = sc.nextInt();
//			sum=0;
//			str=" ";
//		}

//////
//////
//////
		////// 第五題
		System.out.println("請輸入的日期:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int daySum = 0;
		int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		while (daySum == 0) {
			if ((year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) && day <= 29 && month == 2) {
				for (int i = 0; i < month - 1; i++) {
					daySum += monthDay[i];
				}
				daySum += day;
			} else if (month >= 13 || month <= 0 || day == 0 || (day > monthDay[month - 1])) {
				System.out.println("輸入的日期有誤");
				System.out.println("請重新輸入");
				System.out.println();
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
				continue;
			} else {
				for (int i = 0; i < month - 1; i++) {
					daySum += monthDay[i];
				}
				daySum += day;
				if ((year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0)&&month>2) {
					daySum++;
				}
			}
			System.out.print("輸入的日期為該年第" + daySum + "天");
			System.out.println();
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
			daySum = 0;

		}

//////
//////
//////
		////// 第六題
//		int[][] testWrap = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
//				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
//				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }
//
//		};
//		int[] student = new int[8];
//		for (int i = 0; i < testWrap.length; i++) {
//			int[] sortArr=Arrays.copyOf(testWrap[i],testWrap[i].length);
//			Arrays.sort(sortArr);
//			for (int j = 0; j < testWrap[i].length; j++) {
//				if(sortArr[testWrap[i].length-1]==testWrap[i][j]) {
//					 student[j]+=1;
//				}
//				
//			}
//			
//		}
//		for (int i = 0; i <student.length; i++) {
//			System.out.println(i+1+"號 考最高次數:"+student[i]);
//			
//		}
	}
}
