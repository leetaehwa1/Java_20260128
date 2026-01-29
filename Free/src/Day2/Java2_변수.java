package Day2;

public class Java2_변수 {

	public static void main(String[] args) {
		double height = 170.5;
		height = 170.5; // 값 뒤에 사칙연산도 가능.
		// 변수는 언제든 값이 변경될 수 있다.

		// final 키워드를 붙이면 값을 변경할 수 없다.
		// final 변수는 모두 대문자로 사용, "상수"라고 표현
		final double PI = 3.14;
//		pi = 3.141592; final 이므로 수정할 수 없다.

		int number = 50;
		int number2 = number + 10;
		// 오른쪽에 있는 값을 왼쪽에 대입하는 것

		int weight = 50; // = 50.0이므로 double 데이터에 대입가능.
		double weight2 = weight + 0.7;

		double weight3 = 50.5;
		int weight4 = (int) weight3; // 강제형 변환
		System.out.println(weight4);
		// int = double은 가능하지만 double = int 는 불가능
		// double이 더 큰 개념이므로 int에 담는 것은 원래는 불가능
		// 다만, 강제형 변환을 통해서 가능하게 할 수 있음.
		// 이때, 값의 손실이 발생한다.
		
		
	}

}
