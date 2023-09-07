package xxx;

public class HomeWork {
	public static void main(String[] args) {
		// 第一題
		int sum = 12 + 6;
		int multiplier = 12 * 6;
		System.out.println("和" + sum);
		System.out.println("積" + multiplier);

		// 第二題
		int aDozenEgg = 200 / 12;
		System.out.println(aDozenEgg + "打");

		// 第三題
		int sec = 1;
		int min = sec * 60;
		int hr = min * 60;
		int day = hr * 24;
		int totalSum = 256559;
		int totalDay = (totalSum / day);
		int totalHr = (totalSum % day) / hr;
		int totalMin = ((totalSum % day) % hr) / min;
		int totalSec = ((totalSum % day) % hr) % min;
		System.out.println(totalDay + "天");
		System.out.println(totalHr + "小時");
		System.out.println(totalMin + "分");
		System.out.println(totalSec + "秒");

		// 第四題
		final double pi = 3.1415;
		int radius = 5;
		double circleArea = pi * (Math.pow(radius, 2));
		double circumference = pi * (radius * 2);
		System.out.println("圓面積" + circleArea);
		System.out.printf("圓面積%.2f%n", circleArea);
		System.out.println("圓周長" + circumference);
		System.out.printf("圓周長%.2f%n", circumference);

		// 第五題
		// 本利和（終值）＝本金 ×（1＋年利率）^期間
		int principal = 150;
		double total;
		total = principal * (Math.pow((1 + 0.02), 10));
		System.out.println(total);
		System.out.printf("%.2f", total);

		// 第六題
//		5 + 5    10   數值相加
//		5 + "5" "55"  整數與字串相加，是文字串接
//		5 + '5'  58  chart型別,與int相加時，'5'在16進制規範下的Unicode表是35,但java是10進制所以會轉成53，才會得到53+5=58

	}
}
