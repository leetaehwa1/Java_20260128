package Day7;

import java.util.Arrays;
//일반 데이터 타입은 객체랑 다름.
public class Java03_toString {

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 30);
		Person hong2 = new Person("홍길동", 30); // 독립적인 사람들 => 주소값이 다름.

		String a = new String("test");
		String b = new String("test");

		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(hong == hong2);
		System.out.println(hong.equals(hong2));

		System.out.println(hong.toString());// toString 의 장점은 생략가능. to
		System.out.println(hong);

		String str = new String("zz");
		System.out.println(str);// ()안에 toString 생략
	}

}
