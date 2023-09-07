package xxx;

public class HomeWork9_2 {

	public HomeWork9_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Account account = new Account();
		Mon mon = new Mon(account);
		Son son = new Son(account);
		mon.start();
		son.start();
	}
}

class Account {
	Boolean open = true;
	private int account = 0;

	synchronized public void deposit(int mon) {
		if (open) {
			while (account >= 3000) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while (account < 3000) {
				if (account == 0) {
					System.out.println("媽媽被熊大要求匯款");
				}
				account += mon;
				System.out.println("老媽存了" + mon + "帳戶總共有:" + account);
			}
			notify();
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
		}
	}

	synchronized public void withdraw(int mon) {
		if (open) {
			while (account == 0) {
				try {
					System.out.println("熊大看到帳戶沒錢，暫停提款");
					wait();
					if (account > 0) {
						System.out.println("熊大被告知帳戶已經有錢");
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			account -= mon;
			System.out.println("熊大領了1000，帳戶共有" + account);
			if (account <= 2000 && account > 0) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
				notify();
			}

		}
	}

}

class Mon extends Thread {
	Account account;

	public Mon(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(2000);
			if (i == 10) {
				account.open = false;
			}
		}

	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000);
			if (i == 10) {
				account.open = false;
			}
		}

	}
}