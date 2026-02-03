package Day5;

import java.util.Arrays;

public class Java07_인자전달 {

	static void valueMethod(int x) { // non-static 사용불가
		x += 1; // x = x + 1;
	}

	public static void main(String[] args) {
		int a = 3;
		valueMethod(a); // x+=1의 값을 불러오고 싶으면 위에서 return 을 해줘야함
		System.out.println(a);

		int x = 10;
		int y = x;
		x = 15;
		System.out.println(y); // 10

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = arr1;
		arr1[0] = 10000;
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr2));
		//배열은 객체여서 값에 대한 주소값을 복사해서 보냄
		
	}

}
