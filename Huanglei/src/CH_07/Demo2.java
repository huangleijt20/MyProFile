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
		System.out.println("请输入会员本月的消费记录");
		for(i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			arr[i]=input.nextDouble();
			total=total+arr[i];
		}
		System.out.println("序号"+"\t\t\t"+"金额（元）");
		for(i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t\t\t"+arr[i]);
		}
		System.out.println("总金额"+"\t\t\t"+total);
	}

}
