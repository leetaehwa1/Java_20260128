package Day3;

import java.util.Arrays;

public class Java11_배열 {

	public static void main(String[] args) {
		//배열
		// 선언 먼저 한 후 나중에 값을 넣기
		//배열은 고정 크기를 지정해줘야 한다.
		int[] arr = new int[5]; //정해져있는 문법 5개의 공간을 가지고 있는 배열  int[] arr = {0,0,0,0,0}
//		arr[0] = 10; //  = {10,0,0,0,0}
//		arr[3] = 50; //  = {10,0,0,50,0}
		for (int i=0; i<arr.length;i++ ) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
