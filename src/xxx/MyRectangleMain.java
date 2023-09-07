package xxx;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle m2 =new MyRectangle();
		m2.setWidth(10);
		m2.setDepth(20);
		System.out.println(m2.getArea());
		MyRectangle m1 =new MyRectangle(10,20);
		System.out.println(m1.getArea());
	}
}
