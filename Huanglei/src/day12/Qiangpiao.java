package day12;

public class Qiangpiao {
	public static void main(String[] args) {
		myThread mThread=new myThread();
		Thread t=new Thread(mThread,"桃跑跑");
		Thread t1=new Thread(mThread,"黄牛党");
		Thread t2=new Thread(mThread,"张票票");
		t.start();
		t1.start();
		t2.start();
	}
	static class myThread implements Runnable{
		private int ticket=10;//总票数
		private int num=0;//已售票数
		
		@Override
		public void run() {
			while(num<10&&ticket>=0){
				synchronized (this) {
					num++;
					ticket--;
					System.out.println(Thread.currentThread().getName()+"抢到了第"+num+"张票，还剩"+ticket+"张！");
					
				}
				
			}
			
		}
		
	}

}
