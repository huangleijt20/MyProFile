package Jihe;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Dog dog1 = new Dog("欧欧", "雪瑞纳");
		Dog dog2 = new Dog("牙牙", "拉布拉多");
		Dog dog3 = new Dog("菲菲", "泰迪");
		Dog dog4 = new Dog("美美", "金毛");
		Dog dog5=new Dog("小黑","中华田园犬");
		Dog dog6=new Dog("小黑","哈士奇");
		Set set=new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);
		set.add(dog5);
		set.add(dog6);
		System.out.println("集合的长度是:"+set.size());
		
	}
}
