package dididid;

public abstract class Member01 {
	
	String name;

	public Member01() {
		
	}

	public Member01(String name) {
		super();
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("회원이름:  "  + name);
	}
	
	
	public abstract void useService();

	public void usePoint() {
		// TODO Auto-generated method stub
		
	}
}
