package 개인연습용패키지;

public class 반복문퀴즈복습 {
	public static void main(String[] args) {

		// 3. 1부터 100까지의 숫자 중
		// 홀수들의 합과 짝수들의 합
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1부터 100까지 짝수들의 합:" + sum);

		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				num = num + i;
			}

		}

		System.out.println("1부터 100까지 홀수들의 합:" + num);
		// 2번 문제 10부터 1까지 (역순)숫자 출력
//		for (int i=10; i>=1;i--) {
//			System.out.println(i);
//		}

		// for + if 퀴즈
		// 1부터 100까지 숫자 중 3의 배수만 출력.
//		for (int i = 3; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//
//			}
//		}
	}

}
