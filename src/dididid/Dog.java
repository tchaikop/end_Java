package dididid;

public class Dog extends Animal{
	
	
	String nickname;
	int grade;
	
	

	public Dog(String name, int age, String nickname, int grade) {
		super(name, age);
		this.nickname = nickname;
		this.grade = grade;
	}



	@Override
	public void bark(String sound) {
		// TODO Auto-generated method stub
		super.bark(sound);
	}
	
	
	
	
	}
	
	
	
	
	
	


