package Jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//使用HashMap存储学员英文名(key)和学员信息(value)
		Map map=new HashMap();
		map.put("Jack", "黎明，男");
		map.put("Rose", "张丽，女");
		map.put("David", "罗凯，男");
		map.put("Peter", "王深，男");
		Set keys=map.keySet();//获得key的set集合
		//增强for方法
		System.out.println("增强for方法");
		for (Object o:keys) {
			String key=(String)o;
			String val=(String)map.get(key);
			System.out.println(key+"所对应的学员信息是："+val);
		}
		//iterator方法
		System.out.println("Iterator方法");
		Iterator iterator=keys.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String val=(String)map.get(key);
			System.out.println(key+"所对应的学员信息是："+val);
		}
	}
}
