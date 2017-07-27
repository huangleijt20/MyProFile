package PetCure;

public class Cat extends Pet {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void print(){
		super.print();
		System.out.println("我的颜色是："+color);
	}
	public void cure(){
		System.out.println("疗养，吃药");
	}
}
