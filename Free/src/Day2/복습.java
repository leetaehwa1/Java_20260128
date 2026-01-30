package Day2;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			System.out.print("구구단 단수를 입력하세요 : ");
			int num = s.nextInt();

			if (num >= 2 && num <= 9) {
				System.out.println("----" + num + " 단---- ");
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
				}
				break;
			} else {
				System.out.println("2~9 사이의 숫자를 입력하세요");
			}
		}
		System.out.println("===프로그램을 종료합니다.===");
	}
}