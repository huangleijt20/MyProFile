package Fulei;

public class PetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog= new Dog();
		dog.setName("С��");
		dog.setHealth(99);
		dog.setLove(100);
		dog.setBreeds("�л���԰Ȯ");
		dog.print();
		System.out.println("---------------------");
		Penguin penguin=new Penguin();
		penguin.setName("�һ�");
		penguin.setHealth(100);
		penguin.setLove(80);
		penguin.setSex("Q��");
		penguin.print();
	}

}
