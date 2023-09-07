package xxx;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork10 {

	public HomeWork10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 第一題呼叫
//		prime();
		// 第二題呼叫
		mathFormat();
		// 第三題呼叫
//		dateFormat();

	}

//=======第一題============

	public static void prime() {
		int random;
		int count = 0;
		A: while (count < 5) {
			random = (int) (Math.random() * 100) + 1;
			for (int i = 1; i < random - 1; i++) {
				if ((random % i == 0) && i != 1) {
					System.out.println(random + "不是質數");
					count++;
					continue A;
				}
			}
			System.out.println(random + "是質數");
			count++;

		}
	}

//=======第二題============
	public static void mathFormat() {
		Scanner sc = new Scanner(System.in);
		Double value = 0.0;
		int format;
		while (true) {
			System.out.println("請輸入數字:");
			try {
				value = sc.nextDouble();
				System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
				format = sc.nextInt();
				while (format > 3 || format == 0) {
					try {
						System.out.println("格式選擇輸入不正確，請再輸入一次!");
						System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
						format = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("格式選擇輸入不正確，請再輸入一次!");
						System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
						sc.next();
					}
				}
				switch (format) {
				case 1:
					Format dfm1 = new DecimalFormat("#,###");
					System.out.println(dfm1.format(value));
					break;
				case 2:
					Format dfm2 = new DecimalFormat("##%");
					System.out.println(dfm2.format(value));
					break;
				default:
					Format dfm3 = new DecimalFormat("###E0");
					System.out.println(dfm3.format(value));
				}
				sc.close();
				break;
			} catch (InputMismatchException e) {
				System.out.println("數字格式不正確，請再輸入一次!");
				sc.next();
			}

		}

	}

//=======第三題============
	public static void dateFormat() {
		String reg = "^((((19|20)\\d{2})(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|(((19|20)\\d{2})(0[469]|11)(0[1-9]|[12]\\d|30))|(((19|20)\\d{2})02(0?[1-9]|1\\d|2[0-8])))$";
		int format;
		System.out.println("請輸入日期(年月日，例如20110131):");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		while (true) {
			while (!date.matches(reg)) {
				System.out.println("日期格式不正確，請再輸入一次!");
				System.out.println("請輸入日期(年月日，例如20110131):");
				date = sc.nextLine();
			}
			try {
				Date dateParse = dateFormat.parse(date);
				System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
				format = sc.nextInt();
				A: while (true) {
					switch (format) {
					case 1:
						DateFormat dfm1 = new SimpleDateFormat("yyyy/MM/dd");
						System.out.println(dfm1.format(dateParse));
						break;
					case 2:
						DateFormat dfm2 = new SimpleDateFormat("MM/dd/yyyy");
						System.out.println(dfm2.format(dateParse));
						break;
					case 3:
						DateFormat dfm3 = new SimpleDateFormat("dd/MM/yyyy");
						System.out.println(dfm3.format(dateParse));
						break;
					default:
						System.out.println("格式選擇輸入不正確，請再輸入一次!");
						format = sc.nextInt();
						continue A;
					}
					break;
				}
				sc.close();
				break;
			} catch (ParseException e) {
				e.printStackTrace();

			}
		}

	}
}
