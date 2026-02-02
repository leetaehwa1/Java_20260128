package Day4;

import java.util.Scanner;

public class Java01_복습 {

	public static void main(String[] args) {
		// String은 문자열, char는 문자(하나만)
		// char는 각각 고유의 숫자값이 있음.
//		
//		char txt = 'a';
//		System.out.println(txt);

		// a = b 는 오른쪽에 있는 것을 왼쪽에 대입.
		// 같은 것을 판별하는 것은 a == b
		// a = a + 5; => a += 5;

//		int sum = 0;
//		for (int i=0; i=<100;i++) {
//			sum = sum + i; => sum += i;
//			
//		}
//		if(true) {
//			//true 일 때 실행
//		}else {
//			//false일 때 실땡
//		}

//		int x = 10;
//		int y = 5;
//		int z;
//		z = x > y ? x : y;//삼항연산자 중요
//		if (x > y) {
//			z = x;
//		} else {
//			z = y;
//		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
					//한 줄만 있다면 중괄호가 생략될 수 있음. 되도록이면 사용
			
			sum = sum + i ;
		}System.out.println(sum);

	}
}
