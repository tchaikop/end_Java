package dididid;

public class Animal {

	
	String name;
	int age;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void bark(String sound) {
		System.out.println("소리");
	}
}
