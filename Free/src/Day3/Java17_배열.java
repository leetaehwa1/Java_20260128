package Day3;

import java.util.Arrays;
import java.util.Random;

public class Java17_배열 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break; //상황에 따라 불필요한 계산을 줄일 수 있다
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
