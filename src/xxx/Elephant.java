package xxx;

public class Elephant extends Animal {
	private  String name ;
	public Elephant(int age, float weight,String name) {
		super(age,weight);
		this.name = name;
		
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("姓名是:"+name);
	}
	public static void main(String[] args) {
		Animal a1=new Animal(3,8.0F);
		a1.speak();
		Elephant e1=new Elephant(8,1200.0f,"大象");
		e1.speak();
		
	}
}
