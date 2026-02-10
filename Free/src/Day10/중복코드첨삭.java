package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 중복코드첨삭 { // 똑같은 게 반복되는 게 있다고 생각하면 static 으로
	static Scanner s = new Scanner(System.in);

	public static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> fruit = list.get(i);
			if (fruit.get("name").equals(name)) {
				return fruit; // 해당 과일을 찾으면 해당 맵 리턴
			}
		}
		return null; // 찾지 못했으면 null 리턴.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); // static 으로 빼면 보안에 문제 생길 수 있음.

		while (true) {
			System.out.print("[1. 과일 등록, 2. 가격 수정, 3. 과일 판매] :");
			int menu = s.nextInt();
			if (menu == 1) {
				// 과일 이름(name), 개수(count), 가격(price)을 입력받아서
				// 맵에 저장 후 , 해당 맵을 리스트에 저장.

				HashMap<String, Object> map = new HashMap<>();
				boolean fruitFlg = false;
				System.out.print("이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = searchFruit(list, name);

				if (fruit != null) {
					// 이미 과일 존재 찾음
					System.out.print("개수 : ");
					int count = s.nextInt();
					fruit.put("count", (int) fruit.get("count") + count);
				} else {
					// 없는 과일
					map.put("name", name);

					System.out.print("개수 : ");
					int count = s.nextInt();
					map.put("count", count);

					System.out.print("가격 :");
					int price = s.nextInt();
					map.put("price", price);
					list.add(map);

				}

				System.out.println(list);

			} else if (menu == 2) {
				// 과일 이름을 입력받고 있는 과일이면 가격을 입력 받아서 해당 가격으로 수정
				// 없으면 '없는 과일 입니다' 출력 후 메뉴로 이동
				boolean fruitFlg = false;
				System.out.print("이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = searchFruit(list, name);

				if (fruit != null) {
					System.out.print("새로운 가격 :");
					int price = s.nextInt();
					fruit.put("price", price);
				} else {
					System.out.println("해당 이름의 과일 없음.");
				}

				System.out.println(list);
			} else if (menu == 3) {
				// 과일 이름을 입력받고, 있는 과일이면
				// 사용자가 구매할 개수 입력. 입력된 수 만큼 기존 개수에서 빼기
				// -> 과일의 개수는 음수가 될 수 없다
				// --> 구매에 성공 시 'ㅇㅇㅇ과일을 00개 판매했습니다.'출력
				// 없는 과일이면 '해당 이름의 과일 없음' 출력

				boolean fruitFlg = false;
				System.out.print("이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = searchFruit(list, name);
				if (fruit != null) {
					System.out.print("사용자가 구매하는 개수 : ");
					int count = s.nextInt();
					if ((int) fruit.get("count") > count) {
						fruit.put("count", (int) fruit.get("count") - count);
						System.out.println(name + "를 " + count + "개 판매하였습니다.");
					} else {
						System.out.println("상품 개수보다 많이 구매할 수 없습니다.");
					}
				} else {
					System.out.println("해당 이름의 과일 없음.");
				}

				System.out.println(list);
			}

		}
	}

}
