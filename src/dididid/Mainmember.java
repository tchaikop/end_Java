package dididid;

public class Mainmember {

	public static void main(String[] args) {
		
		Member member1 = new Member("tiger","12345","홍길동",27,"hong@abdc.com");
		
		
		Member member2 = new Member();
		
		member2.setID("lion");
		member2.setPW("54321");
		member2.setName("이순신");
		member2.setAge(62);
		member2.setMail("lee@abc.com");
		
		
		System.out.println(member1.getName()+ "  "+ member1.getID());
		System.out.println(member2.getName() + "  " +  member2.getID());
		

	}

}
