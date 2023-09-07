package xxx;

public class Animal {
	private int age;
	private float weight;

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	public void speak() {
		System.out.println("年紀 "+age+"歲");
		System.out.println("體重 "+weight+"公斤");
	}

	public int setAge(int age) {
		this.age=age;
		return age;
	}
	public float setWeight(float weight) {
		this.weight = weight;
		return weight;
	}
}
