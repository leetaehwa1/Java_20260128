package Day3;

public class Java3_문제 {

	public static void main(String[] args) {
		//구구단을 역순으로 출력.
		for(int i=9;i>=1;i--) {
			System.out.println("===" + i + "단 ===");
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + " = " + (i*j));
			}
		}
		

	}

}
