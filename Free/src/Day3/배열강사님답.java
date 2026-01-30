package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class 배열강사님답 {

	public static void main(String[] args) {
		// 1. 5개의 공간을 가지는 배열을 선언
		// 2.해당 배열에 숫자를 입력받아서 넣기
		// 3.1미만(0이하)의 숫자는 입력하면 배열에 넣지말고 다시 입력하도록 (배열에는 양수만 입력하도록 하는 것.)
//무한루프 사용*
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		int index = 0; // 변수 선언
		while (true) {
			System.out.println((index + 1) + "번째 숫자 입력 : ");
			arr[index] = s.nextInt();
			// arr[index] 값이 0이하인지 체크해야됨.
			if (arr[index] < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				// continue;//밑에 코드 실행안하고 위로 돌아감
				
				
			} else {
				index++;//

			}
			if (index == arr.length) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
