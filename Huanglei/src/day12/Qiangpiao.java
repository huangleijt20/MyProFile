package day12;

public class Qiangpiao {
	public static void main(String[] args) {
		myThread mThread=new myThread();
		Thread t=new Thread(mThread,"������");
		Thread t1=new Thread(mThread,"��ţ��");
		Thread t2=new Thread(mThread,"��ƱƱ");
		t.start();
		t1.start();
		t2.start();
	}
	static class myThread implements Runnable{
		private int ticket=10;//��Ʊ��
		private int num=0;//����Ʊ��
		
		@Override
		public void run() {
			while(num<10&&ticket>=0){
				synchronized (this) {
					num++;
					ticket--;
					System.out.println(Thread.currentThread().getName()+"�����˵�"+num+"��Ʊ����ʣ"+ticket+"�ţ�");
					
				}
				
			}
			
		}
		
	}

}
