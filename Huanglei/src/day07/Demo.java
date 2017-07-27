package day07;

import java.util.Scanner;

public class Demo {

	/**
	 * 常用类equals
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String password;
		String password2;
		Boolean boolean1=false;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("请输入用户名：");
			String username = input.next();
			System.out.print("请输入密码：");
			password = input.next();
			if (password.length()<6||username.length()<3) {
				boolean1=true;
				System.out.println("用户名长度不能小于3位，密码长度不能小于6位！");
			}else{
				System.out.print("请再次输入密码：");
				password2 = input.next();
				if (password.equals(password2)) {
					System.out.println("注册成功！请牢记用户名和密码！");
					boolean1=false;
				} else {
					System.out.println("两次输入密码不相同！");
					boolean1=true;
				}
			}
		} while (boolean1);
	}

}
