package dididid;

import java.util.ArrayList;

public class mainexer {

	public static void main(String[] args) {
		
		
		ArrayList< Member01> members = new ArrayList<Member01>();
		
		members.add(new GeneralMember("홍길동"));
		members.add(new GeneralMember("김철수"));
		
		
		for(Member01 member:members) {
			member.introduce();
			member.useService();
		}
		

	}

}
