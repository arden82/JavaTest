package xxx;

//子類別呼叫setPrice()不在建構子
//在getPrice()呼叫
public abstract class Pen_2 {
	private String brand;
	private int price;

	public Pen_2(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public void getBrand() {
		System.out.println("品牌名:" + brand);

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void getPrice() {
		setPrice(price);
		System.out.println("售價:" + price);

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public abstract void write();

	public static void main(String[] args) {
		Pen_2[] p = new Pen_2[2];
		p[0] = new Pencil_2("Pencil", 100);
		p[1] = new InkBrush_2("InkBrush", 100);
		for (int i = 0; i < p.length; i++) {
			p[i].getBrand();
			p[i].write();
			p[i].getPrice();
			System.out.println();
		}
	}
}

class Pencil_2 extends Pen_2 {
	public Pencil_2(String brand, int price) {
		super(brand, price);
	}

	public void setPrice(int price) {
		price = (int) (price * 0.8);
		super.setPrice(price);
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}

class InkBrush_2 extends Pen_2 {
	public InkBrush_2(String brand, int price) {
		super(brand, price);

	}

	public void setPrice(int price) {
		price = (int) (price * 0.9);
		super.setPrice(price);
	}

	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
