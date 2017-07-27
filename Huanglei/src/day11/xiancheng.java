package day11;

public class xiancheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myThread m=new myThread();
		m.setName("t1");
		m.start();
		Thread t=new Thread(new myThread1());
		t.setName("t2");
		t.start();

	}
	

}
 
//重写thread方法
class myThread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
	}
	
}
//实现Runnable接口
class myThread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
	}
	
}