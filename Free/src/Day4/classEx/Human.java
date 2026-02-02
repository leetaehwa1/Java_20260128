package Day4.classEx;

public class Human {
	//변수 (필드) 영역
	String name;
	int age;
	double height;
	boolean isMarried;
	
	//생성자
	//따로 선언 안하면 기본으로 하나 만들어 짐.
	//클래스 이름과 동일한 이름의 메소드
	//생성자는 무조건 리턴 없음.(리턴 타입x)
	//객체 만들 때 꼭 한 번 실행 된다.
	//객체를 초기화하는 용도로 사용한다.
	Human(){}//for 문과 마찬가지로 ()안에 선언된 변수는 밖에서 사용 못하기 때문에 this를 사용함.
	Human(String name, int age, double height, boolean isMarried){
		this.name = name;
		this.age = age;
		this.height = height;
		this.isMarried = isMarried;
		System.out.println("생성자 호출!");
	}
//	Human(){}//오버로딩
//	Human(String a, int b, double c, boolean d){
//		name = a;
//		age = b;
//		height = c;
//		isMarried = d;
//		System.out.println("생성자 호출!");
//	}
	
	
	//메소드 영역
	void eat() {
		System.out.println("밥먹었다!");
	}
	void speak() {
		System.out.println("말했다! 안녕?");
	}
	String intro() {
		return "이름은 " +  name + " 나이는 " + age;
	}
}
