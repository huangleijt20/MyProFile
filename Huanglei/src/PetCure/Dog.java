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
		System.out.println("�ҵ�Ʒ���ǣ�"+breeds);
	}
	public void cure() {
		System.out.println("��ҩ������");
	}
	public void  jiefeipan() {
		System.out.println("�һ�ӷ���");
	}
}
