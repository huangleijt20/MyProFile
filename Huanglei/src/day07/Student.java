package day07;


public class Student implements Comparable<Student>{
	private String engName;
	private String name;
	private String sex;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Student(String engName, String name, String sex,int age) {
		super();
		this.engName = engName;
		this.name = name;
		this.sex = sex;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Student [engName=" + engName + ", name=" + name + ", sex="
				+ sex + ", age=" + age + "]";
	}
	//重写compare类进行排序
	public int compareTo(Student o) {
		if (this.getAge()>o.getAge()) {
			return 1;
		}else if (this.getAge()<o.getAge()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
