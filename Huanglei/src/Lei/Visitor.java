package Lei;

public class Visitor {
	String name;
	int age;
	public void show() {
		if (age>=18) {
			System.out.println(name+"的年龄为："+age+"，门票为20元");
			
		}else {
			System.out.println(name+"的年龄为："+age+"，门票免费");
		}
	}
}
