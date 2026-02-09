package Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java06_과일가게프로그램 {
	static Scanner s = new Scanner(System.in);

	public static int inputNumber(int first, int last) {
		int result = 0;
		while (true) {
			result = s.nextInt();
			if (result < first || result > last) {
				System.out.println(first + "~" + last + "사이 값을 다시 입력해주세요 : ");
			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료]
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("[1. 과일 등록, 2. 과일 판매, 3. 가격 수정, 4. 종료]");
			int menu = s.nextInt();
			if (menu == 1) {
				// 과일 등록
				// 과일 이름(name), 개수(count),가격(price)을 입력받아서
				HashMap<String, Object> fruit = new HashMap<>();
				boolean fruitFlg = false;
				System.out.print("과일 이름 :");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)) {
						fruitFlg = true;
						System.out.print("개수 : ");
						int count = inputNumber(1, 200);
						map.put("count", (int) map.get("count") + count);
						break;
					}
					if(!fruitFlg) {
						System.out.print("개수 : ");
						int count = inputNumber(1, 200);
						fruit.put("count", count);

						System.out.print("가격 :");
						int price = inputNumber(100, 10000);
						fruit.put("price", price);
						
						list.add(fruit);
					}
				}

				fruit.put("name", name);

				// 개수는 0부터 부터 10000사이 값200 사이, price 는 0

				System.out.print("개수 : ");
				int count = inputNumber(1, 200);
				fruit.put("count", count);

				System.out.print("가격 :");
				int price = inputNumber(100, 10000);
				fruit.put("price", price);
				// map에 저장 후 리스트에 추가.
				list.add(fruit);
				// 동일한 이름의 과일이 있을 경우
				// 가격은 물어보지 않고, 개수만 입력받아서 기존 개수에 더하기
			} else if (menu == 2) {
				// 과일 판매
				System.out.println(list);
			} else if (menu == 3) {
				// 가격 수정
			} else if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4 사이 메뉴 선택해주세요.");
			}

		}

	}

}
