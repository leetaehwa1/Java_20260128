package Day8;

import java.util.Random;
import java.util.Scanner;

public class Java98_문제풀이 {

	public static void main(String[] args) {
		// - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.print("[1. 구구단 풀기, 2.종료 ]: ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 구구단 풀기
				while (true) { // while 무한루프 안에서 다시 무한루프를 해주는 방식.
					System.out.print("[1. 쉬움(2~5단), 2.보통(5~9단), 3.어려움(12~19단)] : ");
					menu = s.nextInt();
					if (menu >= 1 && menu <= 3) {
						// 구구단 시작
						int count = 0;// 맞춘 개수의 변수 선언
						for (int i = 1; i <= 5; i++) {
							int x; // 메뉴 선택에 따라 달라짐 2~5, 5~9,12~19
							if (menu == 1) {
								x = ran.nextInt(4) + 2;// 2~5
							} else if (menu == 2) {
								x = ran.nextInt(4) + 6;// 6~9
							} else {
								x = ran.nextInt(8) + 12; // 0~7 =>12~19
							}
							int y = ran.nextInt(9) + 1;
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int answer = s.nextInt();
							if (answer == x * y) {
								System.out.println("정답");
								count++;
							} else {
								System.out.println("오답입니다. 정답은 " + (x * y) + " 입니다.");
							}
						}
						System.out.println("총 " + count + "개 맞췄습니다.");
						break;
					} else {
						System.out.println("1~3중에 선택하세요.");
					}
				}
			} else if (menu == 2) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				// 다시 입력
				System.out.println("1~2중에 선택하세요.");
			}

		}

	}

}
