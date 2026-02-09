package Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java12_리스트맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		// 3명의 사람 정보 입력해서 리스트에 저장.
//		for (int i = 0; i < 3; i++) {
//			HashMap<String, Object> map = new HashMap<>();
//			System.out.print("이름 : ");
//			String name = s.next();
//			map.put("name", name);
//
//			System.out.print("나이 : ");
//			int age = s.nextInt();
//			if (age >= 25) {
//				map.put("age", age + 1);
//
//			} else {
//				map.put("age", age);
//			}
//			list.add(map);
//		}
//		System.out.println(list);

		// 리스트에 있는 맵에서 나이가 25이상인 맵에
		// 나이를 +1 하기
		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);

			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);

			list.add(map);
		}

		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			if ((int) map.get("age") >= 25) {
				map.put("age", (int) map.get("age") + 1);
			}
		}
		System.out.println(list);
	}
}
