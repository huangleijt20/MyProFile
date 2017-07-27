package Lei;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		Visitor v=new Visitor();
		do {
			System.out.print("请输入姓名：");
			v.name=input.next();
			if (v.name.equals("n")) {
				break;
			}
			System.out.print("请输入年龄：");
			v.age=input.nextInt();
			v.show();
		} while (true);
		System.out.println("程序结束！");
	}

}
