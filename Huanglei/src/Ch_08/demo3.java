package Ch_08;

import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("��������������ε�������");
		int row=input.nextInt();
		for(int i=1;i<=row;i++){
			//��ӡ�ո����������ݼ�
			for(int j=row;j>=i;j--){
				System.out.print(" ");
			}
			//��ӡ*����������������Ϊ����
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
