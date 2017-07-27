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
			throw new MyException("���ֳ��Ȳ��ܳ���6���ַ�");
		}
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if ("��".equals(sex)&&"Ů".equals(sex)) {
			this.sex=sex;
		}else {
			throw new RuntimeException("�Ա�ֻ�����л�Ů");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if (age<1||age>100) {
			throw new Exception("����ֵ���Ϸ�");
		}
		this.age = age;
	}
	//����throw throws
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("С��12313131");
		student.setSex("��");
		try {
			student.setAge(104);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
