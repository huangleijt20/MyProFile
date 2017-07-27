package Fulei;

public class Dog extends Pet{
	private String breeds;
	
	public String getBreeds() {
		return breeds;
	}

	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}
	public void print() {
		System.out.println("我的名字叫："+getName());
		System.out.println("我的健康值为："+getHealth());
		System.out.println("和主人的亲密度是："+getLove());
		System.out.println("我的品种是："+breeds);
	}
	
}
