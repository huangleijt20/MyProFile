package day09;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»´®Êý×Ö:");
		
		String str=input.next();
		StringBuffer strb= new StringBuffer(str);
		for (int i =  strb.length()-3; i >0; i=i-3) {
			strb.insert(i,",");
		}
		
		System.out.println(strb.toString());
	}

}
