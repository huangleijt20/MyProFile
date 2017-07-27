package Ch_05;

import java.util.Scanner;

public class kehou1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int max;//记录最大值
		int min;//记录最小值
		int num;
		//循环
		System.out.print("请输入一整个整数（输入0结束）：");
		num=input.nextInt();
		max=num;
		min=max;
		do{
			System.out.print("请输入一整个整数（输入0结束）：");
			num=input.nextInt();		
			if(num>max){
				max=num;
			}else if(num>0&&num<min){
				min=num;
			}
		}while(num!=0);
		System.out.print("最大值是："+max+"\t最小值是："+min);
	}

}
