package Day3;

import java.util.Random;
import java.util.Scanner;

public class 다시풀어보기 {

	public static void main(String[] args) {
		// 사용자가 풀이하고 싶은 문제 수를 직접 정하도록(스캐너,
		// 문제풀이가 끝난 후 또 다시 풀이할지 말지 사용자가 결정하도록(조건문 사용)
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		System.out.print("===랜덤 구구단===");

		while (true) {
			System.out.print("[ (1) 구구단 시작 (2) 종료 ]");
			int menu = s.nextInt();
			if (menu == 1) {
				int count = 0;
				System.out.println("문제 수를 입력해주세요 : ");
				int num = s.nextInt();

				for (int i = 1; i <= num; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.println("[ " + i + "번 문제]");

					System.out.println(x + " * " + y + " = ");

					int answer = s.nextInt();
					if (x * y == answer) {
						System.out.println("정답");
						count++; // 정답일때만 맞춘 개수를 표현하기위해 증감.
					} else {
						System.out.println("오답");
					}
				}
				System.out.println("총" + count + "개의 문제를 맞췄습니다.");
				System.out.println(); // 줄바꿈용도.
			} else if (menu == 2) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1과 2사이의 숫자를 입력하세요");
			}
		}

	}

}
