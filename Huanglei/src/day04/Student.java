package day04;

public class Student {
	private String name;
	private int ID;
	private String sex;
	private int age;
	//ππ‘Ï
	public Student(String name,int ID,String sex,int age){
		this.name=name;
		this.ID=ID;
		this.sex=sex;
		this.age=age;
	}
	//get  set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student student=(Student)obj;
			if (student.getName().equals(this.name)&&student.getID()==this.ID) {
				return true;
			}
		}
		return false;
	}
	
	
}
