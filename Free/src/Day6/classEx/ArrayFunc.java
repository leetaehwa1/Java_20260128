package Day6.classEx;

import java.util.Random;
import java.util.Scanner;

public class ArrayFunc {
	public int max(int[] arr) {

		int max = arr[0];
		// {3,10,5,9,2}
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;

	}// max값

	public int arrSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}// sum값

	public int[] createRanArr(int size, int first, int last) {
		int arr[] = new int[size];
//		{0,0,0,0,0} 
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(last - first + 1) + first;
		}

		return arr;

	}

	public int[] createArr(int size) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println((i + 1) + " 번째 숫자 입력: ");
			arr[i] = s.nextInt();
			if (arr[i] < 1 || arr[i] > 30) {
				System.out.println("1부터 30사이를 입력하세요");
				i--;
			}
		}

		return arr;
	}

//	public int[] createPositiveArr(int[] arr) {
//		int size = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 0) {
//				size++;
//			}
//			size = arr[i] > 0 ? ++size : size;
//		}
//
//		int newArr[] = new int[size];
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 0) {
//				newArr[j++] = arr[i];
//			}
//
//			return newArr;
//		}
////밑에 거 깃허브보고 해야됨
//	public int[] createPositiveArr(int[] list) {
//		int list[] = new int[arr];
//		for (int i = 0; i<list.length;i++) {
//			
//			if(list[i]> 0) {
//				size++;
//			}
//		}return list;
//	}
//		Scanner s = new Scanner(System.in);
//		int value = s.nextInt();
//		System.out.println("배열의 값을 입력하세요 : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			int minIndex = 0;
//			arr[i] = s.nextInt(i);
//
//			if (value < 0 || value > 30) {
//				if(arr[i])
//				arr[i] = arr[minIndex];
//				minIndex = i;
//				
//			}System.out.println("1~30사이의 숫자를 입력하세요");
//			
//			int temp = arr[0];
//			arr[0] = arr[minIndex];
//			arr[minIndex] = temp;
//
//		}
//
//	}

	public int[] createOddArr(int[] arr) {
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				size++; //3 mod 2 => 1
			}
		}

		int oddArr[] = new int[size];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddArr[j++] = arr[i];
			}

		}

		return oddArr;
	}
}
