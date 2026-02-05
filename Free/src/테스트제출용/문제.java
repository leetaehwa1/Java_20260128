package 테스트제출용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		// 1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
//		for(int i = 10;  i<=50;i++) {
//			if(i % 3 == 0) {
//				if(i % 2 == 0) {
//					System.out.println(i);
//				}
//			}
//		}
//	}

		// 2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
//		System.out.print("첫 번째 숫자 입력 :");
//		int num = s.nextInt();
//		System.out.print("두 번째 숫자 입력 :");
//		int sum = s.nextInt();
//
//		if (num + sum > 10) {
//			System.out.println(num + "+" + sum + " = " + (num + sum) + "큰 수");
//		} else {
//			System.out.println(num + "+" + sum + "=" + (num + sum) + " = 작은 수");
//		}

		// 3. 숫자를 하나 입력받고, 해당 숫자가 홀수인지 짝수인지 출력.
		// 단, 숫자가 1~30사이 값이 아닐 경우 다시 입력하도록 함
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//
//		if (input < 0 || input > 30) {
//			System.out.println("1~30 사이의 값을 출력하세요");
//		} else if (input % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//	4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//	큰 수 인지 아닌지 판별하기
//	(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 
//	  '입력한 수가 더 큽니다' 출력, 반대일 경우 '랜덤 숫자가 더 큽니다' 출력, 두 수가 같으면 '같습니다' 출력)
//		int x = ran.nextInt(100) + 1;
//		while (true) {
//			System.out.print("숫자 입력 :");
//			int input = s.nextInt();
//
//			if (input > x) {
//				System.out.println("랜덤 수:" + x);
//				System.out.println("입력한 수가 더 큽니다.");
//			} else if (input < x) {
//				System.out.println("랜덤 숫자가 더 큽니다.");
//			} else if (input == x) {
//				System.out.println("두 수가 같습니다.");
//				break;
//			}
//		}
//		5. 2단부터 9단까지 구구단 출력
//		단, 짝수(2,4,6,8)단만 출력
//		for (int i = 2; i <= 9; i++) {
//			if (i % 2 == 0) {
//
//				System.out.println("===" + i + "단===");
//				for (int j = 1; j <= 9; j++) {
//					System.out.println(i + "*" + j + " = " + (i * j));
//
//				}
//			}
//		}

//		6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
//			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
//		int[] arr = new int[5];
//		int index = 0;
//
//		for (;;) {
//			int num = s.nextInt();
//			System.out.print(num + "번째 숫자 입력 : ");
//			for (int i = 0; i < arr.length; i++) {
//				if (num < 0) {
//					System.out.println("0이하의 숫자를 입력했습니다. 다시 입력하세요.");
//				} else if (arr[i] == num) {
//					System.out.println("숫자가 중복됐습니다. 다시 입력하세요.");
//				}
//
//			}
//		}
//- 		메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료

		while (true) {
			int count = 0;
			System.out.print("1.구구단 풀기,  2.종료 :");
			int num = s.nextInt();
			for (int i = 0; i < num; i++) {
				int start = s.nextInt();
				if (start == 1) {
					System.out.println("1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)");
					int level = s.nextInt();
					if (1 <= level || level <= 3) {
					
					} else if (level == 1) {
						int x = ran.nextInt(3) + 2;
						int y = ran.nextInt(5) + 1;

					} else if (level == 2) {
						int x = ran.nextInt(6) + 2;
						int y = ran.nextInt(5) + 1;
						
					}	
					
					System.out.println("=== 문제풀이를 시작합니다(5문제)===");

					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.println(x + " * " + y + " = ");
					int answer = s.nextInt();
					if (x * y == answer) {
						System.out.println("정답입니다!");
						count++;
					} else {
						System.out.println("오답입니다. 정답은" + x * y + "입니다.");
					}

				}
			}
		}
	}
}
