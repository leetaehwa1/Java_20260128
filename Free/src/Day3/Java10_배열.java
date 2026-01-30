package Day3;

public class Java10_배열 {

	public static void main(String[] args) {

		//배열(array)도 선언과 동시에 초기화 가능.
//		int  a;(선언)
//		a = 10(초기화)
		
		int[] arr = {3,5,2,4,1,}; // int arr[] =과 같음, 
		arr[3] = 1;
		for (int i=0;i<arr.length;i++) {//length만 사용하면 값이 몇개인지 알 수 있음.
			System.out.println(arr[3]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
	}

}
