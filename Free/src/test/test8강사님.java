package test;

import java.util.Arrays;

public class test8강사님 {
	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {
		// 구현
		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}

		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 2, 3 };
		int arr2[] = { 3, 2, 1, 2 };
		boolean result = sameNumberCounts(arr1, arr2);
		System.out.println(result);
	}

}
