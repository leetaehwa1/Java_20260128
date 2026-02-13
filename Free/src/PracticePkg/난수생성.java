package PracticePkg;

import java.util.Arrays;
import java.util.Random;

public class 난수생성 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[15];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(50) + 1;
		}
		System.out.println("원본 배열 : " + Arrays.toString(arr));// 난수 생성과정

		int halfUp = 0;
		int halfDown = 0;

		for (int i = 0; i < arr.length; i++) {// 개수 세기과정
			if (i >= 25) {
				halfUp++;
			} else {
				halfDown++;
			}

		}
		int[] halfUpArr = new int[halfUp];
		int[] halfDownArr = new int[halfDown];

		int halfUpIdx = 0;
		int halfDownIdx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i >= 25) {
				halfUpArr[halfUpIdx++] = arr[i];
			} else {
				halfDownArr[halfDownIdx++] = arr[i];
			}
		}

		System.out.println(Arrays.toString(halfUpArr));
		System.out.println(Arrays.toString(halfDownArr));
	}

}
