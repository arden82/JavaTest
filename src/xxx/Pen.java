package xxx;

public abstract class Pen {
	private String brand;
	private int price;
	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public void getBrand() {
		System.out.println("品牌名:"+brand);

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void getPrice() {
		System.out.println("售價:"+ price);
		
	}

	public void setPrice(int price) {
		this.price = price;
//		System.out.println(" Pen setPrice");
	}

	public abstract void write();
}

class Pencil extends Pen {
	public Pencil(String brand, int price) {
		super(brand, price);
		setPrice(price);
	
	}

	public void setPrice(int price) {
		price = (int) (price * 0.8);
		super.setPrice(price);
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}

class InkBrush extends Pen {
	public InkBrush(String brand, int price) {
		super(brand, price);
		setPrice(price);

	}

	public void setPrice(int price) {
	price =  (int) (price * 0.9);
	super.setPrice(price);
 
	}

	public void write() {
		System.out.println("沾墨汁再寫");
	}


}
