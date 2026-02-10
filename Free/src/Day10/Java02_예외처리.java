package Day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java02_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = 10;
		try {
			System.out.print("나누는 수를 입력 : ");
			int divisor = s.nextInt();
			System.out.println(number / divisor);
			// 두 번째 방법
			// Exception 은 모든 종류의 Exception 의 부모 클래스여서 편리하게 사용할 수 있지만, 명확하게 구분을 하지 못함.
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나누지 마셈");
			System.out.println(e.getMessage());
		}
	}
//		try {
//			System.out.print("나누는 수를 입력 : ");
//			int divisor = s.nextInt();
//			System.out.println(number / divisor);
//			//첫번째방법 catch 여러 개 쓰기
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("0으로 나누지 마셈");
//			System.out.println(e.getMessage());
//		} catch (InputMismatchException e) {
//			System.out.println("숫자를 입력해라");
//		}
//	}

}
