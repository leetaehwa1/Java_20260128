package Day2;

import java.util.Scanner;

public class Java24_퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) { // ;;은 조건식 생략
			System.out.print("구구단 단수를 입력해주세요:");
			int num = s.nextInt();

			if (num >= 2 && num <= 9) { // 2~9의 조건(고정된 값)
				System.out.println("=====" + num + "단=====");
				for (int i = 1; i <= 9; i++) { // 순환되는 값
					System.out.println(num + " * " + i + " = " + (num * i));
				}
				break;
			} else {
				System.out.println("2~9사이의 값을 입력해주세요.");
			}
		}
		System.out.println("=== 프로그램이 종료되었습니다.");
	}

}
