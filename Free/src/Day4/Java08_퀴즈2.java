package Day4;

import java.util.Arrays;
import java.util.Random;

public class Java08_퀴즈2 {

	public static void main(String[] args) {
		// 랜덤한 숫자 10개를 arr 배열에 넣기(Random())
		// 랜덤한 숫자의 범위는 1~20
		// 홀수와 짝수의 개수는 무조건 5개씩(if)
		Random ran = new Random();
		int arr[] = new int[10];// 배열생성
		int oddCnt = 0;// 홀수저장공간
		int evenCnt = 0;// 짝수저장공간
		for (int i = 0; i < arr.length; i++) {
			int random = ran.nextInt(20) + 1;
			if (random % 2 == 1) {
				if (oddCnt == 5) {
					i--;
					continue;
				}
				oddCnt++;
			} else {
				if (evenCnt == 5) {
					i--;
					continue;
				}
				evenCnt++;
			}
			arr[i] = random;
		}
		System.out.println("oddCnt =>" + oddCnt);
		System.out.println("evenCnt =>" + evenCnt);
		System.out.println(Arrays.toString(arr));

	}
}