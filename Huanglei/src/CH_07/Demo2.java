package CH_07;

import java.util.Scanner;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]=new double[5];
		double total=0;
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		for(i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			arr[i]=input.nextDouble();
			total=total+arr[i];
		}
		System.out.println("���"+"\t\t\t"+"��Ԫ��");
		for(i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t\t"+arr[i]);
		}
		System.out.println("�ܽ��"+"\t\t\t"+total);
	}

}
