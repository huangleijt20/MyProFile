package day04;

public class StudentTest {

	public static void main(String[] args) {
		Student student=new Student("�ŷ�", 2001, "��", 40);
		Student student1=new Student("�ŷ�", 2001, "��", 40);
		System.out.println(student==student1);
		System.out.println(student.equals(student1));
	}

}
