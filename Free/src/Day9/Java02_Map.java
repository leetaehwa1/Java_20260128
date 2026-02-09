package Day9;

import java.util.HashMap;

public class Java02_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hong = new HashMap<>();// value 값은 Object로 많이 사용.

		hong.put("name", "홍길동");
		hong.put("Java", 90);
		hong.put("oracle", 95);
		hong.put("html", 85);
		
		System.out.println(hong);
// 		list 는 대괄호[], HashMap 은 중괄호{} 로 출력됨. 

		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("Java", 95);
		kim.put("oracle", 90);
		kim.put("html", 85);
		System.out.println(kim.get("oracle"));
	}

}
