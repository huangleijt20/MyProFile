package day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("jack","黎明","男",20);
		Student s2=new Student("rose","李彩","女",25);
		Student s3=new Student("jim","张虎","男",19);
		Student s4=new Student("Lucy","刘娜","女",18);
//		Map<String, Student> map=new HashMap<String, Student>();
//		map.put("jack", s1);
//		map.put("rose", s2);
//		map.put("jim", s3);
//		map.put("Lucy", s4);
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
//		Set<String> keys=map.keySet();
//		for (String key : keys) {
//			Student s=map.get(key);
//			System.out.println(key+"所对应的学员中文名："+s.getName()+",性别:"+s.getSex());
//		}
		System.out.println("排序前的学员顺序：");
		for (Student student : list) {
			System.out.println(student);
		}
		Collections.sort(list);
		System.out.println("排序后的顺序是：");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
