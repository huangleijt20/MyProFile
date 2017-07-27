import java.util.Scanner;


public class lainxi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//输入积分
		System.out.print("请输入会员积分：");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		double zhekou;
		//判断积分折扣范围
		if(x<2000){
			zhekou=0.9;
		}else if(x<4000){
			zhekou=0.8;
		}else if(x<8000){
			zhekou=0.7;
		}else{
			zhekou=0.6;
		}
		System.out.println("该会员享受的折扣是："+zhekou);
	}

}
