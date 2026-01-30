package Day3;

import java.util.Arrays;

public class Java18_배열 {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 2, 4, 1 };
		// {2, 5, 3, 4, 1}; 로 바꾸고 싶음.
		int temp = arr[0]; // {3, 5, 2, 4, 1}
		arr[0] = arr[2]; // {2, 5, 2, 4, 1}
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));

	}

}
