package day09;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
	  Scanner input =new Scanner(System.in);
	  System.out.print("������һ���ַ�����");
	  String str=input.next();
	  System.out.print("������Ҫ���ҵ��ַ���");
	  String str1=input.next();
	  String[] str3=str.split("");
	  int count=0;
	  for (String s : str3) {
		if (str1.equals(s)) {
			count++;
		}
	}
		
	  System.out.println("��"+str+"���а���"+count+"��"+str1);
	}

}
