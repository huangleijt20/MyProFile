package Fulei;

public class Pet {
	private String name;
	private int love;
	private int health;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("����ֵӦ����1~100֮�䣬Ĭ��ֵΪ60");
			this.love=60;
		}else {
			this.love=love;
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("����ֵӦ����1~100֮�䣬Ĭ��ֵΪ60");
			this.love=60;
		}else {
			this.health=health;
		}
	}
	public void print() {
		System.out.println("�ҵ����ֽУ�"+name+",�ҵĽ���ֵΪ��"+health+",�����˵����ܶ��ǣ�"+love);
	}
	
}
