package Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java04_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 명의 사람 정보를 입력 받아서 리스트 안에 저장 => list 로 보관
		// 입력받을 정보는 이름, 나이, 자바 점수, html 점수 => map 으로 보관
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);

			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);

			System.out.print("자바 점수 : ");
			int java = s.nextInt();
			map.put("java", java);

			list.add(map); // 만들어 놓은 리스트를 추가해야함.
		}
		System.out.println(list);
		// 자바 점수가 60점 미만이면 60점으로 변경.
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if ((int) user.get("java") < 60) { // 강제형 변환 해야됨 원래는 Integer 로 해야하지만 언박싱으로 인해 자동으로 가능
				user.put("java", 60); //넣고싶은 키 와 조건의 값 삽입.
			}
		}
		System.out.println(list);
	}

}
