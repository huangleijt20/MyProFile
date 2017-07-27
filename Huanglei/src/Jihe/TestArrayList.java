package Jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建4个狗狗对象
		Dog dog1=new Dog("欧欧","雪瑞纳");
		Dog dog2=new Dog("牙牙","拉布拉多");
		Dog dog3=new Dog("菲菲","泰迪");
		Dog dog4=new Dog("美美","金毛");
		//创建ArrayList集合储存狗狗对象
		List dogs=new ArrayList();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		System.out.println("共有"+dogs.size()+"只狗狗：");
		System.out.println("增强for遍历");
		//增强FOR循环遍历
		for (Object o:dogs) {
			Dog dog=(Dog)o;
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		System.out.println("迭代器遍历");
		//迭代器遍历
		Iterator iterator=dogs.iterator();
		while (iterator.hasNext()) {
			Dog dog = (Dog) iterator.next();
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		System.out.println("普通for循环");
		//普通FOR循环
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog=(Dog)dogs.get(i);
			System.out.println(dog.getName()+"\t"+(dog.getBreeds()));
			
		}
		
	}

}
