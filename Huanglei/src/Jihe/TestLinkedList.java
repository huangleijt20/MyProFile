package Jihe;

import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建4个狗狗对象
		Dog dog1 = new Dog("欧欧", "雪瑞纳");
		Dog dog2 = new Dog("牙牙", "拉布拉多");
		Dog dog3 = new Dog("菲菲", "泰迪");
		Dog dog4 = new Dog("美美", "金毛");
		Dog dog5=new Dog("小黑","中华田园犬");
		//创建LinkedList集合
		LinkedList dogs=new LinkedList();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.addFirst(dog5);//在集合第一个位置插入一个元素
		dogs.get(2);//获取一个对象
		System.out.println(dogs.get(2));
		dogs.remove(dog2);//删除一个对象
		
	}

}
