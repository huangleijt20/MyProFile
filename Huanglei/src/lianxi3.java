import java.util.Scanner;


public class lianxi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//接收键盘输入
		System.out.println("请输入是否是会员（y）/否（其他字符）");
		Scanner input=new Scanner(System.in);
		char VIP=input.next().charAt(0);
		//判断是否会员
		if(VIP=='y'){
			//会员
			System.out.println("请输入购物金额：");
			double money=input.nextDouble();
			if(money>=200){
				//购满200打7.5折
				System.out.println("实际支付："+money*0.75);
			}else {
				//未满200打8折
				System.out.println("实际支付："+money*0.8);
			}
		}else{
			//非会员
			System.out.println("请输入购物金额：");
			double money2=input.nextDouble();
			if(money2>=100){
				//购满100打9折
				System.out.println("实际支付："+money2*0.9);
			}else{
				//未满100不打折
				System.out.println("实际支付："+money2);
			}
		}
	}

}
