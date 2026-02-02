package Day4.classEx;

public class Class실습1 {

	public static void main(String[] args) {

		int a = 10;
		// hong 객체
		Human hong/* 객체 이름 */ = new Human();// Human으로 선언하면 new Human이 되야함.
		hong.name = "홍길동";
		System.out.println(hong.name);
		hong.age = 30;
		System.out.println(hong.age);// 아무것도 넣지 않으면 0이 Default
		hong.eat();
		String txt = hong.intro();// 문자열이여서 String으로 식 표현
		System.out.println(txt);
		// kim 객체
		Human kim = new Human();// human이라는 클래스 안에서 있기 때문에 변수만 변경하면 됨.

		kim.name = "김철수";
		System.out.println(kim.name);
		kim.age = 5;
		System.out.println(kim.age);
		kim.eat();
		String text = kim.intro();
	}

}
