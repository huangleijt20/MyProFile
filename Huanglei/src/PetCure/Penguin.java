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
		System.out.println("�ҵ��Ա��ǣ�"+sex);
	}
	public void cure() {
		System.out.println("���룬����");
	}
	public void swimming() {
		System.out.println("�һ���Ӿ");
	}

}
