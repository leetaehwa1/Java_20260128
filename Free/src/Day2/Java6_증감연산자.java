package Day2;

public class Java6_증감연산자 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
//		a++; = a+1
		//증감 연산자가 뒤에 있으면 "먼저 값(10)을 넣고" 증감이 된다.
		int c = a++;
		System.out.println(c); //10
		
		int d = ++b; //6
		//증감 연산자가 앞에 있으면 "증감을 먼저 하고" 값을 넣는다.
		System.out.println(d);
		
		int e = b--;
		System.out.println(e);
		System.out.println(b);
		
	}

}
