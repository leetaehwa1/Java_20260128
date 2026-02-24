package test;

import java.util.Arrays;
import java.util.Random;

public class Test6 {
//	6. (10점) 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~20사이의 값을 20개의 공간에 모두 넣으시오.
//	단, 중복된 숫자는 최대 3개까지만 허용하며, 작업이 끝난 후 한번도 나오지 않는 숫자 목록을 출력할 것.
	public static void main(String[] args) {
		int arr[] = new int[20];
		int count[] = new int[11];

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
			count[arr[i]]++;
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 1; i <= 10; i++) {
			if (count[i] == 0) {
				System.out.println("안 나온 숫자 : " + i);
			}
		}
	}

}
