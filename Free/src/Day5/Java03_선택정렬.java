package Day5;

import java.util.Arrays;

public class Java03_선택정렬 {

	public static void main(String[] args) {
		// 내림차순으로
		int arr[] = { 2, 3, 5, 1, 4 };
		for (int j = 0; j < arr.length - 1; j++) {//전체횟수가 n이면 n-1의 범위로.
			int maxIndex = j;
			for (int i = j + 1; i < arr.length; i++) {//전체횟수가 n이면 n-1의 범위로.
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}

				int temp = arr[j];
				arr[j] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
