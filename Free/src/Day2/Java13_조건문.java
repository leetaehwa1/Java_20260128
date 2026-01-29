package Day2;

import java.util.Scanner;

public class Java13_조건문 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = s.nextInt(); //s.nextInt();는 한 번만.
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
	}

}
