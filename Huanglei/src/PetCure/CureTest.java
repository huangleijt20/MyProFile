package PetCure;

public class CureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.setName("���");
		dog.setBreeds("����");
		dog.setHealth(42);
		dog.setLove(95);
		Penguin penguin=new Penguin();
		penguin.setName("��Q");
		penguin.setHealth(54);
		penguin.setLove(80);
		Cat cat=new Cat();
		cat.setName("����");
		cat.setHealth(30);
		cat.setLove(75);
		Master master=new Master();
		master.cure(dog);
		master.cure(penguin);
		master.cure(cat);
		//����ת��
		Pet pet=new Dog();
		if (pet instanceof Dog) {
			Dog dog1=(Dog)pet; //ǿ��ת��
			dog1.setName("����");
			dog1.setHealth(100);
			dog1.setLove(100);
			dog.setBreeds("����");//ǿ��ת������Ե����������е�����
			dog.print();
			dog.jiefeipan();//ǿ��ת������Ե����������еķ���
			
		}
		Pet pet2=new Penguin();
		if (pet2 instanceof Penguin) {
			Penguin penguin1=(Penguin)pet2;
			penguin1.setName("С��");
			penguin1.setHealth(100);
			penguin1.setLove(65);
			penguin1.setSex("Q��");
			penguin1.print();
			penguin1.swimming();
		}
	}

}
