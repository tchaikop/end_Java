package dididid;

public class Member {

		private String ID;
		private String PW;
		private String Name;
		private int age;
		private String Mail;
		
		
		public Member() {
			
		}
		public Member(String iD, String pW, String name, int age, String mail) {
			
			ID = iD;
			PW = pW;
			Name = name;
			this.age = age;
			Mail = mail;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getPW() {
			return PW;
		}
		public void setPW(String pW) {
			PW = pW;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getMail() {
			return Mail;
		}
		public void setMail(String mail) {
			Mail = mail;
		}
		
		
		
		
}
