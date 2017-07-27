package PetCure;

public class Penguin extends Pet{
	private String sex;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print() {
		super.print();
		System.out.println("我的性别是："+sex);
	}
	public void cure() {
		System.out.println("打针，疗养");
	}
	public void swimming() {
		System.out.println("我会游泳");
	}

}
