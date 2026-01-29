package Day2;

public class Java7_증감연산자 {
//복습하기
	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		int c = ++a;
		int d = c--;
		int e = --a;
		b++;
		int f = b++;
		System.out.println(a); //8
		System.out.println(b); //4
		System.out.println(c); //8
		System.out.println(d); //
		System.out.println(e);
		System.out.println(f);
	}

}
