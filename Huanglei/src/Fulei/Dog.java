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
		System.out.println("�ҵ����ֽУ�"+getName());
		System.out.println("�ҵĽ���ֵΪ��"+getHealth());
		System.out.println("�����˵����ܶ��ǣ�"+getLove());
		System.out.println("�ҵ�Ʒ���ǣ�"+breeds);
	}
	
}
