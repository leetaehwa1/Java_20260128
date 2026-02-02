package Day4;

public class Java05_메소드 {

	static void/* 리턴값없음 */ method1() { // 메소드를 만든 것.
		// 리턴이 없는 메소드(메소드는 단순히 호출하고 끝나는 형태)
		System.out.println("첫 번째 메소드 호출!!");
	}

	static int method2() {
		// 리턴이 있는 메소드(결과를 되돌려주는 형태)
		return 100;
	}

	static int sum(int a, int b) {//언제든 필요할 때마다 사용가능함.
//		int c = a + b;
//		return c;

		return a + b;
	}

	public static void main(String[] args) {

		// 메소드는 단순히 호출하고 끝나는 형대
		// 결과를 되돌려주는 형태

		method1();// method1 호출
		int value = method2();// 100을 되돌려 받는다.
		System.out.println(value);

		int result = sum(3, 5);// 괄호 안에 있는 2개 숫자를 더해서 리턴받고 싶음.
		System.out.println(result);// 
		
		int result2 = sum(100,200);
		System.out.println(result2);
	}

}
