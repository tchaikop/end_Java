package dididid;

public class Maintest {

	public static void main(String[] args) {
		
		Test001 stu1 = new Test001();
		
		stu1.age = 27;
		
		stu1.ageOutput();
		System.out.println("=====");
		
		stu1.ageReturn();
		int age = stu1.ageReturn();
		System.out.println(age);
		
		
		System.out.println("=====");
		
		stu1.avgScorePrint(80, 90);
		
		System.out.println("=====");
		
		stu1.avgScoreReturn(60,80);
		double dou = stu1.avgScoreReturn(60,80);
		System.out.println("평균:  "  +  dou);
		
		

	}

}
