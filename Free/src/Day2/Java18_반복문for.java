package Day2;

import java.util.Scanner;

public class Java18_반복문for {

	public static void main(String[] args) {
		// for, while, do while
		// for(선언부;조건식;증감식) 세미콜론 두 개.
		//
//		Scanner s = new Scanner(System.in);
		
//		System.out.println("숫자를 입력해주세요 :");
//		int input = s.nextInt();
		
//		int sum = 0;
//		for(int i=1; i<=input; i++) {
//			sum = sum + i; 
//				System.out.println("1부터" + input + "까지의 합은" + i);
//		}
		int sum = 0;
		for(int i=1; i<=10; i++) {//물어봐야댐
			sum = sum + i; //오른쪽 값이 왼쪽의 값이 됨.
		}
		System.out.println(sum); //결과물은 밖에다가 만들어놔야함.
		
	}

}
