package Fengzhuang;

import java.util.Scanner;

public class BuyPet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ��������꣡");
		System.out.print("������Ҫ�������������:");
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�1.����		2.��죩:");
		int num=input.nextInt();
		switch (num) {
		case 1:
			Dog dog=new Dog();
			dog.setName(name);
			System.out.println("�����빷����Ʒ�֣�1.��ʿ��    2.̩�ϣ�:");
			int i=input.nextInt();
			if (i==1) {
				dog.setBreeds("��ʿ��");
			}else {
				dog.setBreeds("̩��");
			}
			System.out.print("�����빷���Ľ���ֵ��1~100����");
			dog.setHealth(input.nextInt());
			System.out.println("�����빷�������ܶȣ�1~100����");
			dog.setLove(input.nextInt());
			dog.show();
			break;
		case 2:
			Penguin penguin=new Penguin();
			penguin.setName(name);
			System.out.println("�����������Ա�1.Q��    " +
					"2.Q�ã�:");
			int j=input.nextInt();
			if (j==1) {
				penguin.setSex("Q��");
			}else {
				penguin.setSex("Q��");
			}
			System.out.print("���������Ľ���ֵ��1~100����");
			penguin.setHealth(input.nextInt());
			System.out.println("�������������ܶȣ�1~100����");
			penguin.setLove(input.nextInt());
			penguin.show();
			break;
		}
	}

}
