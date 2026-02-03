package Day5;

import java.util.Arrays;

public class Java02_선택정렬 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 1, 4 };
		for (int j = 0; j < arr.length - 1; j++) {
			int minIndex = j;
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
// 1번 파일에서 작성한 코드의 규칙성을 찾아서 반복문으로 다시 작성해보기
//		int arr[] = { 2, 3, 5, 1, 4 };
//		int minIndex = 0;
//		for (int i = 1; i < arr.length; i++) {
//			for(int j = 1; j<=i;j++) {
//				int temp = arr[1];
//				arr[j] = arr[i];
//				arr[i] = temp;
//				System.out.println(Arrays.toString(arr));
//			}
//			if (arr[minIndex] > arr[i]) {
//				minIndex = i;
//			}
//		}
//		int temp = arr[0];
//		arr[0] = arr[minIndex];
//		arr[minIndex] = temp;
//		System.out.println(Arrays.toString(arr));
//	}
