package Yichang;

import java.util.Scanner;

public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������γ̴��ţ�1~3�����֣�:");
		try {
			int i =input.nextInt();
			switch (i) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("��ѧ");
				break;
			case 3:
				System.out.println("Ӣ��");
				break;
			}
		} catch (Exception e) {
			System.out.println("�������");
		}finally{
			System.out.println("��ӭ�������");
		}
		
		

	}

}
