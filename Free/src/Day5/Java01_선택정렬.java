package Day5;

import java.util.Arrays;

public class Java01_선택정렬 {

	public static void main(String[] args) {
		// 선택정렬
		// 배열의 값들 중 가장 작은 수를 찾아서
		// 맨 앞의 값과 위치 변경
		// 1회차 {2, 3, 5, 1, 4}->{1, 3, 5, 2, 4}
		int arr[] = { 2, 3, 5, 1, 4 };
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));

		minIndex = 1;
		for (int i = 2; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		minIndex = 2;
		for (int i = 3; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		minIndex = 3;
		for (int i = 4; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[3];
		arr[3] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
	}
	

}
