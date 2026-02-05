package Day7;

import java.util.Arrays;

public class Java02_레퍼런스 {
	static void varMethod(int x) {
		x += 10000;
	}

	static void refMethod(Person p) { // 문자열이면 String, 숫자형이면 int 객체받고싶으면 객체명
		p.setPhone("1234-5678");
	}

	public static void main(String[] args) {
		int a = 10;
		varMethod(a);
		System.out.println(a);

		int b = 30;
		int c = b;
		b = 10000;
		System.out.println(c);// c 값을 복사해서 보내는 것이여서 c 에는 변화 없음

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = arr1;
		arr1[0] = 10000;
		System.out.println(arr2[0]); // arr1[0]의 주소값을 복사한 것이라 arr2[0]에도 10000이 됨.

		Person p = new Person("홍길동", 30);
		refMethod(p);
		System.out.println(p.getPhone());

		int arr[] = { 3, 2, 5, 9, 6 };
		ArrayFunc.sort(arr);
		System.out.println(Arrays.toString(arr));
//		int arr[] = { 3, 2, 5, 9, 6 };
//		int list[] = ArrayFunc.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		p = null; //p 가 메모리에는 남아있지만 다시 사용 할 수 없음 =>가비지
//		자바에서는 자바 가상 머신이 알아서 처리해줌.
	}

}
