import java.util.Scanner;


public class lianxi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int random=(int) (Math.random()*10);//生成随机数
		System.out.println("欢迎参加我行我素幸运抽奖环节");
		System.out.print("请输入4位数会员卡号：");
			int VIP=input.nextInt();//获取键盘输入
			int num=VIP/100%10;//分解百位数值
			//判断是否中奖
			if(num==random){
			System.out.print("恭喜你中奖了！");
			
			}else{
			System.out.print("感谢参与！");
			}
	}
}
