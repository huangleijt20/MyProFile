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
		System.out.println("�ҵ����ֽУ�"+getName());
		System.out.println("�ҵĽ���ֵΪ��"+getHealth());
		System.out.println("�����˵����ܶ��ǣ�"+getLove());
		System.out.println("�ҵ��Ա��ǣ�"+sex);
	}
}
