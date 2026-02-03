package Day2;

public class Java01_복습 {

	public static void main(String[] args) {
//		System.out.println("주석은 실행에 영향을 주지 않는다.");

		System.out.println("Test");

		String name = "홍길동";
		System.out.println(name); // 홍길동 출력
		System.out.println("name"); // name 출력

		int age = 30;
		System.out.println(age);
		
		double height = 170.5;
		System.out.println(height);
		
		boolean isMarried = true; // true or false

		// String, int, double, boolean 정도만 일단 숙지
		// 노란색은 만들어놓고 사용하지 않는 것에 대한 경고.
		
		String gender;
		gender = "남자";
		//상황에 따라서는 변수 선언과 초기화를 따로하는 경우도 있음.
		System.out.println(gender);
//		int age; 값은 바꿀 수 있지만 한 번 선언한 변수는 다시 선언 할 수 없다.
		age = 31; 
		System.out.println(age);

	}

}
