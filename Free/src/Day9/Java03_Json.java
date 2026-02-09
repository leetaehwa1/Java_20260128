package Day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java03_Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Json -> list 안에 map 이 있는 형태
		// [{},{},{}] ->list[] 안에 map{}이 여러 개 인 형태.
		HashMap<String, Object> hong = new HashMap<>();// value 값은 Object로 많이 사용.

		hong.put("name", "홍길동");
		hong.put("Java", 90);
		hong.put("oracle", 95);
		hong.put("html", 85);

//		System.out.println(hong);
// 		list 는 대괄호[], HashMap 은 중괄호{} 로 출력됨. 

		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("Java", 95);
		kim.put("oracle", 90);
		kim.put("html", 85);

//		System.out.println(kim);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(kim);
		list.add(hong);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
//			HashMap<String, Object> map = list.get(i);
//			System.out.println(map.get("name") + "의 자바 점수는 : " + map.get("Java"));
			System.out.println(list.get(i).get("name") + "의 자바 점수는 : " + list.get(i).get("Java"));
		}
	}
}
