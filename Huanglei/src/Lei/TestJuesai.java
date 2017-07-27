package Lei;

import java.util.Scanner;

public class TestJuesai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stuScore=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入5名参赛者的成绩:");
		for (int i = 0; i < stuScore.length; i++) {
			
			stuScore[i]=input.nextInt();
		}

	}

}
