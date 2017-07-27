package Ch_06;

import java.util.Scanner;

public class lianxi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		int VIPNo=0;
		String birth;
		int points;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入第"+(i+1)+"会员号<4位整数>：");
			VIPNo=input.nextInt();
			System.out.println("请输入会员生日<月/日>：");
			birth=input.next();
			System.out.println("请输入会员积分：");
			points=input.nextInt();
			if(VIPNo<1000||VIPNo>9999){
				System.out.println("会员号"+VIPNo+"无效");
				System.out.println("录入信息失败");
				continue;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(VIPNo+"\t"+birth+"\t"+points);
		}
		System.out.println("程序结束！");
	}

}
