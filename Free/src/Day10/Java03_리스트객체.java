package Day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Java03_리스트객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트안에는 해쉬맵보단 객체를 넣는 걸 권장.
		ArrayList<Student> list = new ArrayList<>();

		Student hong = new Student("1234", "홍길동", 30);
		hong.setJava(90);

		Student kim = new Student("9876", "김철수", 25);
		kim.setJava(95);

		list.add(hong);// hong 과 kim 은 레퍼런스임.
		list.add(kim);
		System.out.println(list);
	}

}
