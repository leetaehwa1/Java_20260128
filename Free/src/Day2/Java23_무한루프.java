package Day2;

import java.util.Scanner;

public class Java23_무한루프 {

	public static void main(String[] args) {
		// for문 무한루프는 세미콜론 두 개를 사용함.
//		

		Scanner s = new Scanner(System.in);

		for (;;) {
			System.out.print("숫자를 입력하세요: ");

			int num = s.nextInt();

			if (num < 1 || num > 100) {
				System.out.println("1부터 100사이의 값을 입력해주세요.");
			} else if (num % 2 == 0) {
				System.out.println("짝수 입니다.");
				break;
			} else {
				System.out.println("홀수 입니다.");
				break;
			}
		}

	}
}
