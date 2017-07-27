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
			System.out.println("健康值应该在1~100之间，默认值为60");
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
			System.out.println("亲密值应该在1~100之间，默认值为60");
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
		System.out.println("我的名字叫："+name+",健康值是："+health+"和主人的亲密度是："+love+",我的性别是："+sex);
	}
}
