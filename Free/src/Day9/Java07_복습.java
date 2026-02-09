package Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java07_복습 {
	static void test() {
	};

	static void test(int x) {
	};

	static int test(int x, int y) {
		System.out.println("매개 변수 2개!!");
		return x + y;
	};

	static void test(HashMap<String, Object> map) {
	};

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Class 만드는 거(변수 + 메소드) 생성자는 엄청 중요하지 않음.
		// 메소드 생성 및 호출.
		test(10);
		int a = test(5, 10);

		Scanner s = new Scanner(System.in);
		ArrayList<String> stringList = new ArrayList<>();
		// 스캐너로 값을 입력받아서 stringList 에 순서대로 넣기.
		// stop 이라고 입력하는 순간 더이상 입력 안받고 종료.
		while (true) {
			System.out.print("문자열 입력 : ");
			String text = s.next();

			if (text.toLowerCase().equals("stop")) {//대소문자 구분없이 사용하는 법
				System.out.println("종료");
				break;
			}
			stringList.add(text);

		}
		System.out.println(stringList);

	}

}
