package Yichang;

import java.util.Scanner;

public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入课程代号（1~3的数字）:");
		try {
			int i =input.nextInt();
			switch (i) {
			case 1:
				System.out.println("语文");
				break;
			case 2:
				System.out.println("数学");
				break;
			case 3:
				System.out.println("英语");
				break;
			}
		} catch (Exception e) {
			System.out.println("输入错误");
		}finally{
			System.out.println("欢迎提出建议");
		}
		
		

	}

}
