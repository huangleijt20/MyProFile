package Jihe;

import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����4����������
		Dog dog1 = new Dog("ŷŷ", "ѩ����");
		Dog dog2 = new Dog("����", "��������");
		Dog dog3 = new Dog("�Ʒ�", "̩��");
		Dog dog4 = new Dog("����", "��ë");
		Dog dog5=new Dog("С��","�л���԰Ȯ");
		//����LinkedList����
		LinkedList dogs=new LinkedList();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.addFirst(dog5);//�ڼ��ϵ�һ��λ�ò���һ��Ԫ��
		dogs.get(2);//��ȡһ������
		System.out.println(dogs.get(2));
		dogs.remove(dog2);//ɾ��һ������
		
	}

}
