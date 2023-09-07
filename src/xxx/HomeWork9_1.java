package xxx;

public class HomeWork9_1 implements Runnable {
	private String name;
	int count = 0;
	int random;

	public HomeWork9_1() {
		// TODO Auto-generated constructor stub
	}

	public HomeWork9_1(String name) {
		this.name = name;
	}

	public void run() {
		while (count <= 10) {
			System.out.println(name + "吃第" + count + "碗了");
			count++;
		}
		if (count > 10) {
			System.out.println(name + "吃完了");
		}
		try {
			random = (int) (Math.random() * 1000);
			Thread.sleep(random);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		HomeWork9_1 p1 = new HomeWork9_1("查克");
		Thread t1 = new Thread(p1);
		HomeWork9_1 p2 = new HomeWork9_1("寇弟");
		Thread t2 = new Thread(p2);
		System.out.println("=================大胃王比賽開始=================");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			System.out.println("=================大胃王比賽結束=================");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
