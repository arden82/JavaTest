package xxx;

public class TestBMI {
	public static void main(String[] args) {
		double weight = 60;
		double height = 1.62;
		double bmi = weight / (height * height);
		System.out.printf("BMI=%.2f%n", bmi);

//      三元練習
//		String str;
//		str=(bmi<18.5)?"過瘦":((18.5<=bmi && bmi<24)?"正常":(str="過胖"));
//		System.out.println(str);

		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi < 24) {
			System.out.println("正常");
		} else {
			System.out.println("過胖");
		}

	}
};