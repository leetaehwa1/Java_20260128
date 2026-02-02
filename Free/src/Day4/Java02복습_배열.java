package Day4;

public class Java02복습_배열 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		// int arr[] = new int[5];
		// arr[0] = "문자열"; //int 형 데이터만 가능
		arr[0] = 10;

		String[] textArr = { "Java", "oracle", "javascript", "html"};
//	 	Object[] test = {"z",1,1.5,true};
//		for (int i=0;i<textArr.length;i++) {
//			System.out.println(textArr[i]);
//		}
		for(String txt : textArr) {
			System.out.println(txt.length());//.을 찍고 무엇인가 나오는 것은 객체라고 생각하면됨.
			//문자열도 숫자와 마찬가지로 글자수가 많은 것을 나타낼 수 있다.
			//length는 크기를 나타내는 메소드
			
		}
		
	}
}
