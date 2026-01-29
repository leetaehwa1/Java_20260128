package Day2;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		//if-else if-else문으로 입장료 계산하기
		//100~90은 A, 89~80은 B, 79~70은 C,69~60은 D, 나머지는 F
		//스캐너로 점수입력하도록.
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = s.nextInt();
		
		if(num >= 90) {
			System.out.println("A학점");
		} else if (num >=80) {
			System.out.println("B학점");
		} else if (num >= 70) {
			System.out.println("C학점");
		} else if (num >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
	}

}
