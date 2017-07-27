package Fulei;

public class PetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog= new Dog();
		dog.setName("Ð¡ºÚ");
		dog.setHealth(99);
		dog.setLove(100);
		dog.setBreeds("ÖÐ»ªÌïÔ°È®");
		dog.print();
		System.out.println("---------------------");
		Penguin penguin=new Penguin();
		penguin.setName("»Ò»Ò");
		penguin.setHealth(100);
		penguin.setLove(80);
		penguin.setSex("Q×Ð");
		penguin.print();
	}

}
