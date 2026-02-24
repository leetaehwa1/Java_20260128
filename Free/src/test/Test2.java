package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 (20점) 1부터 스캐너로 입력받은 숫자까지의 합을 구하시오. 
//		   단, 스캐너로 입력받은 숫자가 2~1000사이의 숫자가 아니거나 짝수일 경우
//		   '계산할 수 없습니다' 출력 후 프로그램을 종료하시오.
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int sum = 0;
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % 2 == 0 || num < 2 || num > 1000) {
				System.out.println("계산할 수 없습니다.");
				break;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
