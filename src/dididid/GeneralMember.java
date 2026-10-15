package dididid;

public class GeneralMember extends Member01 implements Pointuser {

	
	
	
	
	public GeneralMember(String name) {
		super(name);
	}

	public void usePoint() {
	System.out.println(name + ":  초인트를 사용합니다.");
		
	}



	@Override
	public void useService() {
		System.out.println(name + ":  일반 서비스를 이용합니다");
		
	}

	
	
	

}
