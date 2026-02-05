package Day7;

import java.util.Arrays;

public class ArrayFunc {
	static void sort(int[] arr) { // 이 배열의 주소와 호출할 때 의 주소(int arr[])과 같음.배열 또한 객체

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
		}

	}
//	static int[] sort(int[] arr) { //이 배열의 주소와 호출할 때 의 주소(int arr[])과 같음.배열 또한 객체
//
//		for (int j = 0; j < arr.length - 1; j++) {
//			int minIndex = j;
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[minIndex] > arr[i]) {
//					minIndex = i;
//				}
//			}
//			int temp = arr[j];
//			arr[j] = arr[minIndex];
//			arr[minIndex] = temp;
//		}
//
//		return arr;
//	}
}
