package Ch_08;

import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("������ֱ�������ε�������");
		int row=input.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
