package day14;

import java.io.Serializable;

public class Phone implements Serializable{
	private static final long serialVersionUID = -8980992367841625644L;
	private String brand;
	private String type;
	private String content;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", type=" + type + ", content="
				+ content + "]";
	}
	
}
