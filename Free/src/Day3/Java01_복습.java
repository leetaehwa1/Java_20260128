package Day3;

public class Java01_복습 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		System.out.println(a / b); //복습
		
		double c = 3;
		System.out.println(a / c);
		System.out.println((double)a / b);//강제형 변환
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
		
		int num = 10;
//		num = num + 3;
		num += 3; //이런 식의 코드를 자주 사용.
		
		int x = 10;
		int y = a++;
		int z = --a; //x = 10, y = 10, z= 10
		
		System.out.println(x > y); //false
		System.out.println(x >= y); //true
		System.out.println(z > 5); //true
		
		System.out.println(x == z); //true
		System.out.println(x != z); //false
		
		System.out.println(x > 5 && y > 8); //true
		System.out.println(x > 15 || y > 8); //true
		
		
	}

}
