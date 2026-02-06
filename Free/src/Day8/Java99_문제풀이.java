package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Java99_문제풀이 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
//			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번 째 숫자 입력 : ");
			arr[i] = s.nextInt();
			// 0 이하의 숫자인지 체크
			if (arr[i] < 1) {
				System.out.println("1 이상의 숫자를 입력하세요.");
				i--;// 다시 입력하도록
				continue;// 증감으로 다시 돌아가는 명령어
			}
			// 중복값 여부 체크
			// {1,2,3,0,0} 가정
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("중복된 값이 있습니다. 다시 입력하세요.");
					i--;
					break;// j 의 반복문을 빠져나가기 위한 break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		// 7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들의 합의 차이 구하기
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("홀수 합 :" + oddSum);
		System.out.println("짝수 합 :" + evenSum);
		System.out.println("차이 값 :" + Math.abs(oddSum-evenSum));
	}
	

	
	
	
}