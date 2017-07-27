package Lei;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//引用类
		Administrator admin= new Administrator();
		//给新对象赋值
		admin.name="admin";
		admin.password="123456";
		//接受用户输入
		System.out.print("请输入用户名：");
		String nameInput=input.next();
		System.out.print("请输入旧密码：");
		String passwordInput=input.next();
		for (int i =0; i <3; i++) {
			
			if (admin.name.equals(nameInput)&&admin.password.equals(passwordInput)) {
				System.out.print("请输入新密码：");
				admin.password=input.next();
				System.out.println("修改密码成功！您的新密码为："+admin.password);
				break;	
			}else if(2-i==0){
				 System.out.println("3次输入错误，修改失败！");
				 break;
			}
			else {
				System.out.println("输入错误，请重新输入，您还有"+(3-(i+1))+"次机会！");
				System.out.print("用户名：");
				 nameInput=input.next();
				System.out.print("旧密码：");
				 passwordInput=input.next();
				 
			}
		}//for
		
	}
}
