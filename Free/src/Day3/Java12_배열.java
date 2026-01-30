package Day3;

//복습하기
import java.util.Arrays;
import java.util.Scanner;

public class Java12_배열 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));// 값을 입력한 것에 대해 모두 나타냄.

		// ===== 입력받은 5개의 숫자의 평균을 구하기.
		// (배열안에 있는 모든 값의 평균)
		int sum = 0; // 변수 선언하고 값 누적시키기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균 값 : " + ((double) sum / arr.length));
	}

}
