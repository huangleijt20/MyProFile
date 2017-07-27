package Ch_08;

import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double prise;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) + "个人所购买的三件商品的价格：");
			sum=0;
			for (int j = 0; j < 3; j++) {
				 prise= input.nextDouble();
				if (prise > 300) {
					sum++;

				}
			}
			System.out.println("第" + (i + 1) + "个人共有" + sum + "件商品享受8折优惠！");
		}
	}

}
