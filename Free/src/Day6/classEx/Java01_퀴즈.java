package Day6.classEx;//복습 ArrayFunc

import java.util.Arrays;

public class Java01_퀴즈 {

	public static void main(String[] args) {
		int arr[] = { 3, 10, 5, 9, 2 };
		ArrayFunc func = new ArrayFunc();

		// 큰 값 찾아내기
		int max = func.max(arr);
		System.out.println(max); // 10

		// 배열의 모든 수의 합
//		int sum = func.arrSum(arr);
//		System.out.println(sum);

		// 5개의 공간을 가지는 배열 생성 후
		// 랜덤한 숫자(1~20)5개 넣기
		
//		int ranArr[] = func.createRanArr(5, 1, 20);
//		System.out.println(Arrays.toString(ranArr));
		
		// 5개의 공간을 가지는 배열을 리턴
		// 배열의 값들은 사용자가 직접 입력해서 넣도록
		// ex)공간이 5면 5개 입력받아서 순서대로 넣기
		// 1~30사이 숫자는 다시 입력하도록
		
//		int newArr[] = func.createArr(5);
//		System.out.println(Arrays.toString(newArr));
		
		//양수들만 담긴 배열 리턴
		//{3,5,6}
		
//		int list[] = { 3, 5, -4, -2, 6, -8 };
//		int positiveArr[] = func.createPositiveArr(list);
//		System.out.println(Arrays.toString(positiveArr));
		
		
		//int arr[]={3,10,5,9,2};
		//홀수들의 배열로 리턴
		//{3,5,9}
		int oddArr[]=func.createOddArr(arr);
		System.out.println(Arrays.toString(oddArr));
	}

}
