package Day8;

public class Java02_Wrapper클래스 {

	public static void main(String[] args) {
		Integer i = 10; // 박싱
		int n = i;// 언박싱
//		int a = i.parseInt("10");//parseInt 는 static 으로 선언되어있음.
		System.out.println(i + 50);
		String num = "1234";
		System.out.println(Integer.parseInt(num) + 10);
//		int a = i;
	}

}
