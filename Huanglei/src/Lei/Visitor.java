package Lei;

public class Visitor {
	String name;
	int age;
	public void show() {
		if (age>=18) {
			System.out.println(name+"������Ϊ��"+age+"����ƱΪ20Ԫ");
			
		}else {
			System.out.println(name+"������Ϊ��"+age+"����Ʊ���");
		}
	}
}
