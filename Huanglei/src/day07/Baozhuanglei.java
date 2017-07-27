package day07;

import java.util.ArrayList;
import java.util.List;

public class Baozhuanglei {

	/**
	 * 包装类的常用方法
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i=new Integer(100);//等同于 int i =100;
		Integer i1=100; //上面方法的简写
		Boolean bool=new Boolean("true");
		Boolean bool1=new Boolean("false");
		Boolean bool2=new Boolean("dadsd");//只要值不是true，全部返回false
		Character character=new Character('a');//Character没有以字符串为参数的构造方法，因为char只能接收一个字符，字符串不能转化为char
		int n=i1.intValue();//把包装类i1（Integer）转化成基本数据int类型
		int n1=i1;//上面方法的简写
		//xxxValue();包装类转成基本数据类型的方法，常用于大的包装类转为小的基本数据类型
		byte b=i.byteValue();
		//toString();包装类转字符串
		String s=i.toString();
		Double d=new Double(22.5);
		String s1=d.toString();
		//parseXXX();把字符串转化为对应包装类的方法
		Byte b1=Byte.parseByte("224");
		//valueOf();把基本数据类型转化成包装类
		int i2=300;
		Integer i3=Integer.valueOf(i2);
		/*
		 * 装箱：基本类型转换为包装类的对象  
		         拆箱：包装类对象转换为基本类型的值
		 * */
		List<Integer> list=new ArrayList<Integer>();
		int i4=131;
		list.add(i4);//自动装箱
		Integer i5=54554;
		int i6=i5;//自动拆箱
		int i7=i5/i4;//JDK1.5之后才有的功能 包装类可以直接和基本数据类型运算
		//int i8=null; 基本数据类型不能为空
		Integer i9=null; //包装类可以为空
	}

}
