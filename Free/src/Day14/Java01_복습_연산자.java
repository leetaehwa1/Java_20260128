package Day14;

public class Java01_복습_연산자 {
	public static boolean test(int a) {
		// 함수가 들어가지 않는 이상 &&는 꼭 두 개 사용.
		if (a % 2 == 0) {
			System.out.println("두 번째 숫자는 짝수다");
		} else {
			System.out.println("두 번째 숫자는 홀수다");
		}
		return a >= 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and, or

		int a = 10;
		int b = 5;

		if (a >= 20 & test(5)) {
			System.out.println(true);
		}
	}

}
