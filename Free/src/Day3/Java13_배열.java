package Day3;

public class Java13_배열 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 8, 4, 2 };
		int max = arr[0]; // 큰 숫자 백업시키는 용도 보통 첫 번째 숫자를 배열의 0번째 값으로 넣는다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);// 프린트문은 for문 밖에서
	}

}
