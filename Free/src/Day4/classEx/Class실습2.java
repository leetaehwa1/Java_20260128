package Day4.classEx;

public class Class실습2 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30, 170.5, true);// 클래스
		System.out.println(hong.name);
		String intro = hong.intro();
		System.out.println(intro);

		Human kim = new Human("김철수", 5, 130.7, false);
		System.out.println(kim.name);
		System.out.println(kim.age);
		String in = kim.intro();
		System.out.println(in);

		Human park = new Human("박영희", 26, 160.7, false);
		System.out.println(park.name);
		System.out.println(park.age);
		String out = park.intro();
		System.out.println(out);

	}

}
