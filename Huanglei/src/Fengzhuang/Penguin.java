package Fengzhuang;

public class Penguin {
	private int health;
	private int love;
	private String name;
	private String sex;	
	
	
	
	public  int getHealth() {
		return health;
	}
	public void setHealth(int num){
		if(num<0||num>100){
			System.out.println("����ֵӦ����1~100֮�䣬Ĭ��ֵΪ60");
			this.health=60;
		}else {
			this.health=num;
		}
		
		
	}
	public  int getLove() {
		return love;
	}
	public void setLove(int num){
		if(num<0||num>100){
			System.out.println("����ֵӦ����1~100֮�䣬Ĭ��ֵΪ60");
			this.love=60;
		}else {
			this.love=num;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String breeds) {
		this.sex = breeds;
	}
	public void show(){
		System.out.println("�ҵ����ֽУ�"+name+",����ֵ�ǣ�"+health+"�����˵����ܶ��ǣ�"+love+",�ҵ��Ա��ǣ�"+sex);
	}
}
