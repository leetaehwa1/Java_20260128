package Day2;

public class Java07_증감연산자 {
//복습하기
	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		int c = ++b;
		int d = c++;
		int e = a++;
		e--;
		int f = a++;
		System.out.println(a); //10
		System.out.println(b); //10
		System.out.println(c); //11
		System.out.println(d); //10
		System.out.println(e); //
		System.out.println(f); //9
	}

}
