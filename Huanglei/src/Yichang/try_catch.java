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
		System.out.print("�����뱻������");
		try{
		int num1 = input.nextInt();
		System.out.print("�����������");
		
		int num2 = input.nextInt();
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		}catch(InputMismatchException e){
			System.err.println("���ִ��󣺱������ͳ������������� ");
			e.printStackTrace();
		}catch (ArithmeticException f) {
			System.out.println("��������Ϊ0��");
			f.printStackTrace();
		}
	}

}
