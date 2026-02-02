package Day4;

public class Java06_Math클래스 {

	public static void main(String[] args) {

//		int max = Math.max(10, 20);//10 = int a; , 20 = int b;
//		System.out.println(max);
//		
//		int abs = Math.abs(-10);
//		System.out.println(abs);

		// 배열안에 있는 모든 숫자를 변경
		// 음수인 숫자들을 양수로
		// 모두 양수인 상태에서 가장 큰 값 찾기

		int arr[] = { 5, -3, 10, -15, 6 };
//		for (int i =0;i<arr.length;i++)
//			if(arr[i] < 0) {
//				arr[i] = -arr[i];
//			}
		int max = Math.abs(arr[0]);
		for (int i = 0; i < arr.length; i++)
//			arr[i] = Math.abs(arr[i]);
			if (Math.abs(arr[i]) > max) {
				max = Math.abs(arr[i]);
			}
		System.out.println(max);
	}

}
