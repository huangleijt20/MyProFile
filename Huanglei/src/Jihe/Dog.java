package Jihe;

public class Dog {

	private String name;
	private String breeds;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreeds() {
		return breeds;
	}
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}
	public  Dog() {
		
	}
	public  Dog(String name,String breeds) {
		this.name=name;
		this.breeds=breeds;
	}
	
	public String toString() {
		return "Dog [name=" + name + ", breeds=" + breeds + "]";
	}
	//重写equals方法和hashCode方法
	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof Dog) {
			Dog dog=(Dog)obj;
			if (dog.name==this.name) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	

}
