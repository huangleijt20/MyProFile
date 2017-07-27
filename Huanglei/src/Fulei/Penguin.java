package Fulei;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print(){
		System.out.println("我的名字叫："+getName());
		System.out.println("我的健康值为："+getHealth());
		System.out.println("和主人的亲密度是："+getLove());
		System.out.println("我的性别是："+sex);
	}
}
