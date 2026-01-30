package Day3;
//복습하기
public class Java15_배열퀴즈 {

	public static void main(String[] args) {

		// 가장 작은 숫자의 위치 값(index) 찾기
		int[] arr = { 3, 5, 8, 4, 2 };
		int miniIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[miniIndex]) {
				miniIndex = i;
			}
		}
		System.out.println(miniIndex);
	}
}
