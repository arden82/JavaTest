package xxx;

public class Student {
	int score = 60;

	public void play(int hours) {
		score -= hours;
//		System.out.println(score);

	}

	public void study(int hours) {
		score += hours;
//		System.out.println(score);
	}

	public static void main(String[] args) {
		Student tom = new Student();
		Student jack = new Student();
		tom.play(5);
		jack.study(3);
		tom.study(3);
		

	}
}
