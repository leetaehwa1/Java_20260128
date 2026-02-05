package Day2;

//복습하기
import java.util.Scanner;

public class Java14_조건문퀴즈 {

	public static void main(String[] args) {
		// 숫자를 1개 입력 받아서 ->Scanner 사용
		// 홀수면 '홀수 입니다.', 짝수면 '짝수 입니다' 출력 나머지 연산자(% 2 == 0)
		// 다만, 1~100사이 값이 아니면 -> or연산자(||)사용
		// '1부터 100사이의 값을 입력해주세요' 출력

		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int number = s.nextInt();

		if (number < 1 || number > 100) {
			System.out.println("1부터 100사이의 값을 입력해주세요.");
		} else if (number % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			
			System.out.println("홀수 입니다.");
		}

	}

}
