package day12;

public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account(10000);
		Thread t=new Thread(new myThread(account));
		Thread t1=new Thread(new myThread(account));
		t.start();
		t1.start();
		
		
	}
	static class myThread implements Runnable{
		private Account account;
		public myThread (Account account) {
			this.account=account;
		}

		@Override
		public void run() {
			account.subMoney(1000);
			
		}
		
	}

}
