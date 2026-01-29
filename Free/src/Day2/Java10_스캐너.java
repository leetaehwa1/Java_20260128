package Day2;

//복습하기
import java.util.Scanner;

public class Java10_스캐너 {

	public static void main(String[] args) {

		// import 자동 => Ctrl + Shift + o(알파벳)
		// 값을 입력받기 위한 용도로 스캐너 사용

		Scanner s = new Scanner(System.in);
		// 스캐너를 사용하면 그 부분에서 코드가 종료됨.
		System.out.print("숫자를 입력해주세요 : ");
//		System.out.println(); 
		int input = s.nextInt();
		System.out.println(input >= 10);

		System.out.println("==프로그램 종료==");

//		System.out.println(); //ln은 한 줄씩 밑으로 내림(줄바꿈)

//		s.next(); => 문자를 입력받는 기능
//		s.nextInt(); => 숫자(정수)를 입력받는 기능

	}

}
