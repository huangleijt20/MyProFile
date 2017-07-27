package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//out();
		in();

	}
	public static void out(){
		Student student=new Student("¿ÓŒ∞",26,3019);
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("D:/obj"));
			oos.writeObject(student);
			oos.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void in() {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("D:/obj"));
			Object object=ois.readObject();
			if (object instanceof Student) {
				Student s=(Student)object;
				System.out.println(s);
			}else{
				System.out.println("∂¡»° ß∞‹£°");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
