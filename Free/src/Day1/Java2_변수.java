package Day1;

public class Java2_변수 {
	public static void main(String[] args) {

		// 변수는 정보를 담는 공간
//		이름 : 홍길동 => 문자열은 String, 값을 담을 때는 equal(=)을 사용
		String name = "홍길동";
		System.out.println("이름"); // "이름" 출력
		System.out.println(name); // "홍길동" 출력

//		나이 : 30 => 정수는 Int로 표현
		int age = 30;
// 		정수는 int or long(4byte), int는 -21억~ 21억 까지만 표현 2의32승 개	
		System.out.println(age);

//		성별 : 남자
		String gender = "남자";
		System.out.println(gender);

//		결혼여부 : true or false
		boolean isMarried = true;// true or false 만 들어갈 수 있다.
		System.out.println(isMarried);

//		키 : 170.5 => 실수(소수점 있는 숫자)는 double 
		double height = 170.5;
		System.out.println(height);

		// 변수는 변수이름 앞에 데이터의 타입이 붙어야 함.
		// [문자 : String], [정수: int,long], [실수: double], [참, 거짓: boolean]

		// char,byte,float 등은 나중에.
		// 변수 이름은 영어로 직관적이게 표현
//		String name = "홍길동";
//		int age = 30;
//		double height = 170.5;
//		boolean isMarried = false;
//
//		
//		String gender;  // 변수 선언
//		gender = "남자";  // 값 초기화
		
		String gender2 = "여자"; //변수 선언과 동시에 초기화
		
		// 변수안에 들어간 값은 언제든 변경가능
		
		
		// 변수 이름은 첫글자는 소문자, 카멜(camel) 표기법 권장
		// 카멜 표기법은 2개 이상의 단어가 조합되었을 때, 두 번째 단어부터 첫 글자를 대문자로 한다.
		// ex) 학번(student + number) => studentNumber or stuNumber or stuNum

	} // main

}
