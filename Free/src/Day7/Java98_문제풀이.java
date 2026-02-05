package Day7;

import java.util.Arrays;
import java.util.Random;

public class Java98_문제풀이 {

	public static void main(String[] args) {
		// 1~30 사이 숫자를 10개의 공간을 가지는 배열에 넣기
		Random ran = new Random();
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;

		}
		System.out.println("원본 배열 :" + Arrays.toString(arr));

		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		int[] oddArr = new int[oddCount];// 배열 생성
		int[] evenArr = new int[evenCount];

		int oddIdx = 0;
		int evenIdx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[evenIdx++] = arr[i];
			} else {
				oddArr[oddIdx++] = arr[i];
			}
		}
		System.out.println("홀수 배열: " + Arrays.toString(oddArr));
		System.out.println("짝수 배열: " + Arrays.toString(evenArr));
	}

	int oddArr[]; // 홀수들
	int evenArr[];// 짝수들

}
