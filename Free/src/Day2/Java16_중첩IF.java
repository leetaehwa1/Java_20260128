package Day2;

import java.util.Scanner;

public class Java16_중첩IF {

	public static void main(String[] args) {
		//100 이상의 숫자만 홀수, 짝수 구분
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int num = s.nextInt();
		
		
		if(num >= 100) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		
	}

}
