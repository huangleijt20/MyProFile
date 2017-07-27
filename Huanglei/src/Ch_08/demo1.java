package Ch_08;

import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		int row=input.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
