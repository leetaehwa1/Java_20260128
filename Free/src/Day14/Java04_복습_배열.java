package Day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Java04_복습_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복된 숫자는 2개까지만 허용.

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= 10; i++) {
			map.put(i, 0);
		}

		Random ran = new Random();
		int arr[] = new int[15];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
			if (map.get(arr[i]) < 2) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				i--;
			}
		}

		System.out.println(Arrays.toString(arr));

		System.out.println(map);
	}
}
