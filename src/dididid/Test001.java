package dididid;

public class Test001 {
	
	int age;                  //매개변수들을 어떻게 하겠다는 것이 메서드 인것이야
	String name;
	int grade;
	double score;
	
	
	public void ageOutput() {  // 나이가 출력되는 메서드로 제작
		System.out.println(age);
	}
	
	public int ageReturn() {
		return age;
	}
	
	int sum1 = 0;
	double avg1 = 0.0;
	public void avgScorePrint(int score1, int score2) {//매개변수, parameter
		
		sum1 = score1 + score2;                        //매개변수 넣는 순간, 인수, argument 라고 한다
		 avg1 = (double)sum1 / 2;
		
		
		System.out.println("  두 점수: " + score1 + "  과  " + score2 +"의 평균:"+ avg1 );
		
	}
	
	
	int sum = 0;
	double avg = 0.0;
	
	public double avgScoreReturn(int score1, int score2) {
		 sum = score1 + score2;
		 avg = (double)sum / 2;
		
		  return avg;
		
	}
	
	
	
	
	
	
	
	
}
