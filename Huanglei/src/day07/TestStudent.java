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
		Student s1=new Student("jack","����","��",20);
		Student s2=new Student("rose","���","Ů",25);
		Student s3=new Student("jim","�Ż�","��",19);
		Student s4=new Student("Lucy","����","Ů",18);
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
//			System.out.println(key+"����Ӧ��ѧԱ��������"+s.getName()+",�Ա�:"+s.getSex());
//		}
		System.out.println("����ǰ��ѧԱ˳��");
		for (Student student : list) {
			System.out.println(student);
		}
		Collections.sort(list);
		System.out.println("������˳���ǣ�");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
