import java.util.Scanner;


public class lianxi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("我行我素购物管理系统>客户信息管理>添加客户信息\r\r");
		System.out.print("请输入会员号（<4位整数>）：");//获取键盘输入
		Scanner input=new Scanner(System.in);
		int custNo=input.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");//获取键盘输入
		String custBirth=input.next();
		System.out.print("请输入积分：");//获取键盘输入
		int custScore=input.nextInt();
		//判断会员卡号是否合法
		if(custNo<10000&&custNo>999){
			System.out.print("已录入的信息是：\n"+custNo+"\t"+custBirth+"\t"+custScore);
		}else {
			System.out.print("信息录入失败，请输入正确的会员卡号");
		}
		
		
		
		
		
		
	}

}
