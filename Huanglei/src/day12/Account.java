package day12;

public class Account {
	private double money;
	private int id;
	
	public Account(double money) {
		this.money = money;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//ȡǮ�ķ���
	public /*synchronized*/ void subMoney(double money) {
		synchronized (this) {
			double temp=this.money-money;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.money=temp;
			System.out.println("ȡ��ɹ������Ϊ��"+this.money);
			
		}
		
	}
}
