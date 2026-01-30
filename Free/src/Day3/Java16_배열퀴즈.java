package Day3;

import java.util.Scanner;

public class Java16_배열퀴즈 {

	public static void main(String[] args) {

		// 1. 5개의 공간을 가지는 배열을 선언
		// 2.해당 배열에 숫자를 입력받아서 넣기
		// 3.1미만(0이하)의 숫자는 입력하면 배열에 넣지말고 다시 입력하도록 (배열에는 양수만 입력하도록 하는 것.)
		Scanner s = new Scanner(System.in);

		int[] arr = new int[5];
		int index = 0;

		for (;;) {
			int num = s.nextInt();
			System.out.println("숫자 입력 : ");
			for (int i = 1; i < arr.length; i++) {
				if (num > 0) {
					arr[i] = num;
				} else {
					System.out.println("1이상의 숫자만 입력하세요");
				}
			
			}break;

		}

	}

}
