package Jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����4����������
		Dog dog1=new Dog("ŷŷ","ѩ����");
		Dog dog2=new Dog("����","��������");
		Dog dog3=new Dog("�Ʒ�","̩��");
		Dog dog4=new Dog("����","��ë");
		//����ArrayList���ϴ��湷������
		List dogs=new ArrayList();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		System.out.println("����"+dogs.size()+"ֻ������");
		System.out.println("��ǿfor����");
		//��ǿFORѭ������
		for (Object o:dogs) {
			Dog dog=(Dog)o;
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		System.out.println("����������");
		//����������
		Iterator iterator=dogs.iterator();
		while (iterator.hasNext()) {
			Dog dog = (Dog) iterator.next();
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		System.out.println("��ͨforѭ��");
		//��ͨFORѭ��
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog=(Dog)dogs.get(i);
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		
	}

}
