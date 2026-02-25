package Day17;

import java.util.Arrays;
import java.util.Random;

public class 다차원배열퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[][] = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10) + 1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		//
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
