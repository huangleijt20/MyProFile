package day07;

import java.util.ArrayList;
import java.util.List;

public class Baozhuanglei {

	/**
	 * ��װ��ĳ��÷���
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i=new Integer(100);//��ͬ�� int i =100;
		Integer i1=100; //���淽���ļ�д
		Boolean bool=new Boolean("true");
		Boolean bool1=new Boolean("false");
		Boolean bool2=new Boolean("dadsd");//ֻҪֵ����true��ȫ������false
		Character character=new Character('a');//Characterû�����ַ���Ϊ�����Ĺ��췽������Ϊcharֻ�ܽ���һ���ַ����ַ�������ת��Ϊchar
		int n=i1.intValue();//�Ѱ�װ��i1��Integer��ת���ɻ�������int����
		int n1=i1;//���淽���ļ�д
		//xxxValue();��װ��ת�ɻ����������͵ķ����������ڴ�İ�װ��תΪС�Ļ�����������
		byte b=i.byteValue();
		//toString();��װ��ת�ַ���
		String s=i.toString();
		Double d=new Double(22.5);
		String s1=d.toString();
		//parseXXX();���ַ���ת��Ϊ��Ӧ��װ��ķ���
		Byte b1=Byte.parseByte("224");
		//valueOf();�ѻ�����������ת���ɰ�װ��
		int i2=300;
		Integer i3=Integer.valueOf(i2);
		/*
		 * װ�䣺��������ת��Ϊ��װ��Ķ���  
		         ���䣺��װ�����ת��Ϊ�������͵�ֵ
		 * */
		List<Integer> list=new ArrayList<Integer>();
		int i4=131;
		list.add(i4);//�Զ�װ��
		Integer i5=54554;
		int i6=i5;//�Զ�����
		int i7=i5/i4;//JDK1.5֮����еĹ��� ��װ�����ֱ�Ӻͻ���������������
		//int i8=null; �����������Ͳ���Ϊ��
		Integer i9=null; //��װ�����Ϊ��
	}

}
