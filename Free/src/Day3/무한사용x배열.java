package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class 무한사용x배열 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();//입력받는 것
			if(arr[i] < 1 ) {
				System.out.println("1이상의 숫자를 입력해주세요");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
