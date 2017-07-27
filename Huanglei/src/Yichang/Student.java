package Yichang;

public class Student {
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length()>6) {
			throw new MyException("名字长度不能超过6个字符");
		}
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if ("男".equals(sex)&&"女".equals(sex)) {
			this.sex=sex;
		}else {
			throw new RuntimeException("性别只能是男或女");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if (age<1||age>100) {
			throw new Exception("年龄值不合法");
		}
		this.age = age;
	}
	//测试throw throws
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("小明12313131");
		student.setSex("公");
		try {
			student.setAge(104);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
