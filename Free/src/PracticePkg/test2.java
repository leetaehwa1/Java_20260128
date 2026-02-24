package PracticePkg;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		 - 조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		 - 조건2. 5의 배수는 넣지 말 것.
		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			int num = s.nextInt();
			if (num > 0 && num < 101 && !(num % 5 == 0)) {
				arr[i] = num;
				System.out.println(Arrays.toString(arr));
			}else {
				System.out.println("조건에 맞는 숫자를 입력하세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
