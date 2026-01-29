package Day2;

public class Java03_연산자 {

	public static void main(String[] args) {
		// 수학에서 사용하는 사칙연산 (+,-,*,/) 사용
		int a = 10;
		int b = 5;
		int c = 13;
		System.out.println(a + b); // 15
		System.out.println(c - b); // 8
		System.out.println(a * c); // 130
		
		//int + int 의 계산이므로 결과도 int (나머지 값 사라짐)
		System.out.println(c / b); // 2라는 몫만 나오고 나머지 값은 나오지 않음.
		
		double d = 13;
		System.out.println(d / b); 
		// int 와 double의 계산이므로 결과가 double
		
		
		System.out.println((double)c / b); //강제형 변환 (가끔씩 사용)
		
		
		// 사칙연산의 결과는 더 큰 데이터 타입(double > int)을 따른다.

	}

}
