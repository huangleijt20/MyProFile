package Ch_08;

import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double prise;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�������" + (i + 1) + "�����������������Ʒ�ļ۸�");
			sum=0;
			for (int j = 0; j < 3; j++) {
				 prise= input.nextDouble();
				if (prise > 300) {
					sum++;

				}
			}
			System.out.println("��" + (i + 1) + "���˹���" + sum + "����Ʒ����8���Żݣ�");
		}
	}

}
