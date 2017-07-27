package Ch_08;

import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数：");
		int row=input.nextInt();
		for(int i=1;i<=row;i++){
			//打印空格随着行数递减
			for(int j=row;j>=i;j--){
				System.out.print(" ");
			}
			//打印*随着行数递增，且为奇数
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
