package Ch_05;

import java.util.Scanner;

public class kehou1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int max;//��¼���ֵ
		int min;//��¼��Сֵ
		int num;
		//ѭ��
		System.out.print("������һ��������������0��������");
		num=input.nextInt();
		max=num;
		min=max;
		do{
			System.out.print("������һ��������������0��������");
			num=input.nextInt();		
			if(num>max){
				max=num;
			}else if(num>0&&num<min){
				min=num;
			}
		}while(num!=0);
		System.out.print("���ֵ�ǣ�"+max+"\t��Сֵ�ǣ�"+min);
	}

}
