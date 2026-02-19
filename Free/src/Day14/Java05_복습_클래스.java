package Day14;

import java.util.Arrays;
import java.util.Random;

public class Java05_복습_클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫 번째
		int max = Function.max(3, 5); // max 는 static 으로 선언되어있음.
		System.out.println(max); // 5출력

		Function func = new Function(); // 'Function 객체를 생성했습니다' 출력.
		int min = func.min(3, 5);
		System.out.println(min); // 3

		int ran = Function.random(10);
		System.out.println(ran); // 1부터 10사이의 랜덤값.

		int arr[] = { 3, 5, -4, 10, -9 };
		int sum = Function.sum(arr);
		System.out.println(sum); // 배열안에 있는 모든 숫자의 합.

		// 음수, 양수 상관없이 내림차순.
		// {10, -9, 5 ,-4, 3}
		Function.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
