package Day2;

public class Java04_연산자 {

	public static void main(String[] args) {
		//코딩에서는 사칙연산 외에도 나머지 연산(%)이 많이 활용된다.
		int a = 11;
		int b = a % 3; //몫은 버리고 나머지 값만 구함.
		System.out.println(a = b);
		
		String name = "홍길동";
		int age = 30;
		//문자와 다른 데이터 타입을 더하면 결과는 이어 붙이는 형태
		System.out.println(name + age);
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
		System.out.println(name + "의 나이는 " + age + 1 +"살 입니다.");
		System.out.println(name + "의 나이는 " + (age + 1) +"살 입니다."); //()안에 있는 것부터 계산함.
		
		
		//= 하나는 오른쪽 값을 왼쪽으로 대입.
		
	}

}
