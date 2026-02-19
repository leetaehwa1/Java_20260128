package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Function {
	Function() {
		System.out.println("Function 객체를 생성했습니다.");
	}

	static void sort(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				list.add(arr[i]);
				arr[i] = -arr[i];
			}
//			arr[i] = arr[i] > 0 ? -arr[i] : arr[i];
//			arr[i] = -Math.abs(arr[i]);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.contains(-arr[i]) ? -arr[i] : arr[i];
		}
	}

//	static int sort(int arr[]) {
//		// 음수, 양수 상관없이 내림차순.
//		// {10, -9, 5 ,-4, 3}
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < arr[max]) {
//				max = i;
//			}
//
//		}
//
////		int max = 0;
////		for (int i = 1; i < arr.length; i++) {
////			if (arr[i] > max) {
////				max = arr[i];
////			}
////		}
//		return max;
//	}

	static int sum(int arr[]) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		return sum;
	}

	static int random(int x) {
		Random ran = new Random();
		return ran.nextInt(x) + 1;
	}

	static int max(int x, int y) {
//		int z = x > y ? x : y;
//		return z;
		return x > y ? x : y;
	}

	int min(int x, int y) {// 객체를 통한 것은 non-static 으로
		return x < y ? x : y;
	}
}
