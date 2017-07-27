package PetCure;

public class Master {
	public void cure(Dog dog) {
		if (dog.getHealth()<60) {
			dog.cure();
			dog.setHealth(90);
		}
	}
	public void cure(Penguin penguin){
		if (penguin.getHealth()<60) {
			penguin.cure();
			penguin.setHealth(90);
		}
	}
	public void cure(Cat cat){
		if (cat.getHealth()<50) {
			cat.cure();
			cat.setHealth(100);
		}
	}
}
