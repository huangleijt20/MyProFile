package Phone;

public abstract class Handset {
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public abstract void tax();
	public abstract void call();
	public abstract void music();
	public void show() {
		System.out.println("这是一款型号为"+type+"的"+name+"手机：");
	}
}
