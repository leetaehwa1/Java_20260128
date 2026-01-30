package Day3;

import java.util.Scanner;

public class Java02_복습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
