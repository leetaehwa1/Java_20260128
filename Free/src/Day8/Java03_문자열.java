package Day8;

import java.util.Scanner;

public class Java03_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		System.out.println(a == b);

		String c = "안녕?";
		String d = "안녕?";
		String e = new String("안녕?"); // 객체로 저장
		System.out.println(c == d); // true
		System.out.println(d == e); // false
		System.out.println(d.equals(e));// true

		Scanner s = new Scanner(System.in);
		String f = s.next();
		System.out.println(c == f);
		System.out.println(c.equals(f));
		//스트링에서는 equals를 써라.
	}

}
