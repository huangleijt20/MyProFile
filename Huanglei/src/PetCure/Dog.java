package PetCure;

public class Dog extends Pet{
	private String breeds;

	public String getBreeds() {
		return breeds;
	}

	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}
	public void print() {
		super.print();
		System.out.println("我的品种是："+breeds);
	}
	public void cure() {
		System.out.println("吃药，打针");
	}
	public void  jiefeipan() {
		System.out.println("我会接飞盘");
	}
}
