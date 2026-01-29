package Day2;

public class Java5_연산자 {

	public static void main(String[] args) {
		//대입 연산
		int a = 10;
		int b = 5;
		
//		a = a + b; // 15
		a += b; //a = a + b; a와 b를 더한 값을 a에 대입
		System.out.println(a);
		
		b -= 3; // b = b - 3;
		System.out.println(b);
		
		a *= 2;
		System.out.println(a); //값이 변화가 생겨서 30이란 값이 나옴
		
		a /= 2;
		System.out.println(a);
		
		
	}

}
