package Jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//ʹ��HashMap�洢ѧԱӢ����(key)��ѧԱ��Ϣ(value)
		Map map=new HashMap();
		map.put("Jack", "��������");
		map.put("Rose", "������Ů");
		map.put("David", "�޿�����");
		map.put("Peter", "�����");
		Set keys=map.keySet();//���key��set����
		//��ǿfor����
		System.out.println("��ǿfor����");
		for (Object o:keys) {
			String key=(String)o;
			String val=(String)map.get(key);
			System.out.println(key+"����Ӧ��ѧԱ��Ϣ�ǣ�"+val);
		}
		//iterator����
		System.out.println("Iterator����");
		Iterator iterator=keys.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String val=(String)map.get(key);
			System.out.println(key+"����Ӧ��ѧԱ��Ϣ�ǣ�"+val);
		}
	}
}
