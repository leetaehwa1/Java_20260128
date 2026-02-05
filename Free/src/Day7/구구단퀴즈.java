package Day7;

import java.util.Random;
import java.util.Scanner;

public class 구구단퀴즈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			int count = 0;// 정답을 맞춘 수
			System.out.println("문제 수를 입력 : "); // 반복문 안에서
			int num = s.nextInt();
			
			for (int i = 0; i < num; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.println(x + " * " + y + " = ");
				int answer = s.nextInt();
				if (x * y == answer) {
					System.out.println("정답");
					count++;
				} else {
					System.out.println("오답. 정답은" + x * y + "입니다");
				}
			}
			System.out.println("총" + num + "문제 중에 " + count + "개 정답");
			System.out.println("계속은 0 아니면 다른 숫자 입력 : ");
			if (s.nextInt() != 0) {
				break;
			}
		}
		System.out.println("종료되었습니다.");

	}
//		Scanner s = new Scanner(System.in);
//		Random ran = new Random();
//		int count = 0;
//		
//		for (int i = 1; i <= 50; i++) {
//			int x = ran.nextInt(8) + 2; // 2~9
//			int y = ran.nextInt(9) + 1; // 1~9
//			System.out.print("[" + i + "번 문제] ");
//			System.out.print(x + " * " + y + " = ");
//			int answer = s.nextInt();
//			if ((x * y) == answer) {
//				System.out.println("정답");
//				count++;
//			} else {
//				System.out.println("오답. 정답은 " + x*y + "입니다.");
//			}
//		}
//		System.out.println("총" + count + "문제를 맞췄습니다.");
//	}

}
