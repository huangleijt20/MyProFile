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
			System.out.println("健康值应该在1~100之间，默认值为60");
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
			System.out.println("健康值应该在1~100之间，默认值为60");
			this.love=60;
		}else {
			this.health=health;
		}
	}
	public void print() {
		System.out.println("我的名字叫："+name+",我的健康值为："+health+",和主人的亲密度是："+love);
	}
	
}
