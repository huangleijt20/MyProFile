package day03;

class Person {
	String name="李光";// 姓名 //4
	public Person() { //3
		// super();//写不写该语句，效果一样
		System.out.println("execute Person()");//5
	}
	public Person(String name) {
		this.name = name;
		System.out.println("execute Person(name)");
	}
}

class Student extends Person {
	String school="北大青鸟";// 学校 //6
	public Student() { //2
		// super();//写不写该语句，效果一样
		System.out.println("execute Student() ");//7
	}
	public Student(String name, String school) {
		super(name); // 显示调用了父类有参构造方法，将不执行无参构造方法
		this.school = school;
		System.out.println("execute Student(name,school)");
	}
}

class PostGraduate extends Student {
	String guide;// 导师
	public PostGraduate() {  //1
		// super();//写不写该语句，效果一样
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
		pgdt=new PostGraduate("刘致同","北京大学","王老师");
	}
}
