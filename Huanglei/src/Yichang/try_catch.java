package Yichang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入被除数：");
		try{
		int num1 = input.nextInt();
		System.out.print("请输入除数：");
		
		int num2 = input.nextInt();
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		}catch(InputMismatchException e){
			System.err.println("出现错误：被除数和除数必须是整数 ");
			e.printStackTrace();
		}catch (ArithmeticException f) {
			System.out.println("除数不能为0。");
			f.printStackTrace();
		}
	}

}
