package day03;

class Person {
	String name="���";// ���� //4
	public Person() { //3
		// super();//д��д����䣬Ч��һ��
		System.out.println("execute Person()");//5
	}
	public Person(String name) {
		this.name = name;
		System.out.println("execute Person(name)");
	}
}

class Student extends Person {
	String school="��������";// ѧУ //6
	public Student() { //2
		// super();//д��д����䣬Ч��һ��
		System.out.println("execute Student() ");//7
	}
	public Student(String name, String school) {
		super(name); // ��ʾ�����˸����вι��췽��������ִ���޲ι��췽��
		this.school = school;
		System.out.println("execute Student(name,school)");
	}
}

class PostGraduate extends Student {
	String guide;// ��ʦ
	public PostGraduate() {  //1
		// super();//д��д����䣬Ч��һ��
		System.out.println("execute PostGraduate()");//8
	}
	public PostGraduate(String name, String school, String guide) {
		super(name, school);
		this.guide = guide;
		System.out.println("execute PostGraduate(name, school, guide)");
	}
}

class TestInherit {
	public static void main(String[] args) {
		PostGraduate pgdt=null;
		pgdt = new PostGraduate();
		System.out.println();
		pgdt=new PostGraduate("����ͬ","������ѧ","����ʦ");
	}
}
