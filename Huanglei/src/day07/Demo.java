package day07;

import java.util.Scanner;

public class Demo {

	/**
	 * ������equals
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String password;
		String password2;
		Boolean boolean1=false;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("�������û�����");
			String username = input.next();
			System.out.print("���������룺");
			password = input.next();
			if (password.length()<6||username.length()<3) {
				boolean1=true;
				System.out.println("�û������Ȳ���С��3λ�����볤�Ȳ���С��6λ��");
			}else{
				System.out.print("���ٴ��������룺");
				password2 = input.next();
				if (password.equals(password2)) {
					System.out.println("ע��ɹ������μ��û��������룡");
					boolean1=false;
				} else {
					System.out.println("�����������벻��ͬ��");
					boolean1=true;
				}
			}
		} while (boolean1);
	}

}
