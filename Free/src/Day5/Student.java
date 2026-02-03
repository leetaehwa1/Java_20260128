package Day5;

public class Student extends Human{ //자식클래스로 객체를 만들면 본인생성자 말고도 
									//부모의 생성자도 생성.(기본생성자)그래서 부모 클래스에서 
															//생성자를 초기화해놔야함											
	String stuNo;
	Student (String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(this.name + "이(가)"
				+ " 공부를 합니다");
	}
}
