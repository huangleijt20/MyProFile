package Jihe;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Dog dog1 = new Dog("ŷŷ", "ѩ����");
		Dog dog2 = new Dog("����", "��������");
		Dog dog3 = new Dog("�Ʒ�", "̩��");
		Dog dog4 = new Dog("����", "��ë");
		Dog dog5=new Dog("С��","�л���԰Ȯ");
		Dog dog6=new Dog("С��","��ʿ��");
		Set set=new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);
		set.add(dog5);
		set.add(dog6);
		System.out.println("���ϵĳ�����:"+set.size());
		
	}
}
