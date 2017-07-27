package PetCure;

public class CureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.setName("大黄");
		dog.setBreeds("土狗");
		dog.setHealth(42);
		dog.setLove(95);
		Penguin penguin=new Penguin();
		penguin.setName("阿Q");
		penguin.setHealth(54);
		penguin.setLove(80);
		Cat cat=new Cat();
		cat.setName("花花");
		cat.setHealth(30);
		cat.setLove(75);
		Master master=new Master();
		master.cure(dog);
		master.cure(penguin);
		master.cure(cat);
		//向下转型
		Pet pet=new Dog();
		if (pet instanceof Dog) {
			Dog dog1=(Dog)pet; //强制转换
			dog1.setName("旺财");
			dog1.setHealth(100);
			dog1.setLove(100);
			dog.setBreeds("土狗");//强制转化后可以调用子类特有的属性
			dog.print();
			dog.jiefeipan();//强制转化后可以调用子类特有的方法
			
		}
		Pet pet2=new Penguin();
		if (pet2 instanceof Penguin) {
			Penguin penguin1=(Penguin)pet2;
			penguin1.setName("小灰");
			penguin1.setHealth(100);
			penguin1.setLove(65);
			penguin1.setSex("Q仔");
			penguin1.print();
			penguin1.swimming();
		}
	}

}
