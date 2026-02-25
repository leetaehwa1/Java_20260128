package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test7강사님 {
	static Scanner s = new Scanner(System.in);

	public static int checkNumber(String text) {
		while (true) {
			System.out.print(text);
			int number = s.nextInt();
			if (number <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				return number;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("==포인트 적립 프로그램==");
		while (true) {
			System.out.print("[ 1. 등록, 2 .적립, 3.차감, 4.확인, 5.종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> user = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.println("이미 등록된 사용자 입니다.");
						flg = false;
						break;
					}
				}

				if (flg) {
					int age = checkNumber("나이 : ");
					user.put("name", name);
					user.put("age", age);
					user.put("point", 0);

					list.add(user);
				}

			} else if (menu == 2) {
				System.out.print("포인트 적립할 사용자 이름 : ");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("name"))) {
						int point = checkNumber("적립할 포인트 : ");
						list.get(i).put("point", (int) user.get("point") + point);
						flg = false;
						break;
					}
				}
				if (flg) {
					System.out.println("없는 사용자입니다.");
				}
			} else if (menu == 3) {
				System.out.print("포인트 차감할 사용자 이름 : ");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("name"))) {
						flg = false;
						int point = checkNumber("차감 할 포인트 : ");
						if ((int) user.get("point") < point) {
							System.out.println("차감할 수 있는 포인트는 " + user.get("point") + "입니다.");
							break;
						}
						list.get(i).put("point", (int) user.get("point") - point);
						System.out.println(user.get("name") + "님의 포인트를 " + point + "만큼 차감했습니다.");
						break;
					}
				}
				if (flg) {
					System.out.println("없는 사용자입니다.");
				}
			} else if (menu == 4) {
				System.out.print("포인트 적립할 사용자 이름 : ");
				String name = s.next();
				boolean flg = true;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if (name.equals(user.get("name"))) {
						System.out.println(user.get("name") + "님의 현재 포인트는 " + user.get("point") + " 입니다.");
						break;
					}
				}
				if (flg) {
					System.out.println("없는 사용자입니다.");
				}
			} else if (menu == 5) {

			}
		}

	}

}
