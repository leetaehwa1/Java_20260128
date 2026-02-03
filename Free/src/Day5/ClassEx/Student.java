package Day5.ClassEx;

public class Student {

	String name;
	int age;
	private String stuNo; //이 변수들을 직접적으로 접근을 지양해야함.
	int money; //개인의 돈
	static int money_708 = 200000;//708호 회비
	
	Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
		
	}
		void study (){
			System.out.println(this.name+"가(이)" +" 공부한다");
	}
		void study (String subject) {
			System.out.println(subject + "를 공부한다");
		}
		public String getStuNo() {
			return this.stuNo;
		}
//		static int staticMethod() {
//			return this.stuNo;
//		}불가능한 로직
}
