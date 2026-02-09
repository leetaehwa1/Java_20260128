package Day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java10_복습_맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();//키 값은 중복될 수 없어 하나의 객체 안에는 대상을 하나만 가능
		map.put("java", 90); // value 값 에는 수 많은 데이터 타입이 들어갈 수 있음.
//		map.put("name", "홍길동"); 문자열 불가.
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.5);
		hong.put("isMarried", true);
		System.out.println(hong);

		hong.put("height", 169.5);
		hong.put("height", (double) hong.get("height") - 1);
		System.out.println(hong);
		//그래서 리스트를 만들어서 맵을 리스트안에 넣음
	}

}
