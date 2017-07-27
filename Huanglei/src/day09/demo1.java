package day09;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
	  Scanner input =new Scanner(System.in);
	  System.out.print("请输入一个字符串：");
	  String str=input.next();
	  System.out.print("请输入要查找的字符：");
	  String str1=input.next();
	  String[] str3=str.split("");
	  int count=0;
	  for (String s : str3) {
		if (str1.equals(s)) {
			count++;
		}
	}
		
	  System.out.println("“"+str+"”中包含"+count+"个"+str1);
	}

}
