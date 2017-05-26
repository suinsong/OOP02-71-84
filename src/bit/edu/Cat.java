package bit.edu;

public class Cat extends Animal {

	private String part;
	
	public Cat() {
	}
	
	public Cat(String name, int age, String part) {
		super(name, age);
		this.part = part;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

}
