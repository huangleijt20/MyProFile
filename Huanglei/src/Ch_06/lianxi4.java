package Ch_06;

import java.util.Scanner;

public class lianxi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String name="";
		int password;
		int i=0;
		for(i=0;i<3;i++){
			System.out.println("请输入用户名：");
			name=input.next();
			System.out.println("请输入密码：");
			password=input.nextInt();
			if(name.equals("jim")||password==123456){		
				break;
			}else if(i<3){
				System.out.println("输入错误！您还有"+(3-(i+1))+"次机会");
				continue;
			}else if(i>=3){
				System.out.println("对不起！您3次均输入错误！");
				break;
			}
			
			
		}System.out.println("欢迎登陆MyShopping系统！");
		
	}
}
