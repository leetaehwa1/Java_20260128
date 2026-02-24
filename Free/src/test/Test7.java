package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
	static Scanner s = new Scanner(System.in);

//	7. (5점) 이미지와 동일하게 동작하도록 코드를 작성하시오. 
//	단, 데이터 관리는 ArrayList와 HashMap을 이용해서 할 것.
//
//	참고 1. 1번 메뉴에서 동일 이름을 다시 등록 시도할 경우 이미지와 같이 안내문구 띄울 것
//	참고 2. 2~4번 메뉴에서 등록되지 않은 이름을 찾을 경우 이미지와 같이 안내문구 띄울 것
//	참고 3. 모든 숫자는 음수 입력 불가능하도록 할 것
//	참고 4. 포인트 차감은 내가 가진 포인트를 초과해서 차감할 수 없음

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		try {
			while (true) {
				System.out.println("===포인트 관리 프로그램=== ");
				System.out.print("[ 1.사용자 등록, 2. 포인트 적립, 3. 포인트 차감, 4. 포인트 확인, 5.종료 ] : ");
				int menu = s.nextInt();
				if (menu == 1) {
					HashMap<String, Object> user = new HashMap<>();
					boolean userFlg = false;
					System.out.print("이름 : ");
					String name = s.next();
					for (int i = 0; i < list.size(); i++) {
						HashMap<String, Object> map = list.get(i);
						if (map.get("name").equals(name)) {
							userFlg = true;
							System.out.println("이미 등록된 사용자입니다.");
							return;
						}

					}
					user.put("name", name);

					System.out.print("나이 : ");
					int age = s.nextInt();
					user.put("age", age);
					list.add(user);

				} else if (menu == 2) {
					System.out.print("포인트 적립할 사용자 이름 : ");
					String name = s.next();
					boolean userFlg = false;
					for (int i = 0; i < list.size(); i++) {
						HashMap<String, Object> user = list.get(i);
						if (user.get("name").equals(name)) {
							userFlg = true;
							System.out.print("적립 할 포인트 :");
							int point = s.nextInt();

							System.out.println(name + "님의 포인트가 " + point + " 만큼 적립되었습니다.");
						}
					}
					if (!userFlg) {
						System.out.println("해당 사용자가 존재하지 않습니다.");
					}

				} else if (menu == 3) {
					System.out.print("포인트 차감할 사용자 이름 : ");
					String name = s.next();
					boolean userFlg = false;
					for (int i = 0; i < list.size(); i++) {
						HashMap<String, Object> user = list.get(i);
						if (user.get("name").equals(name)) {
							userFlg = true;
							System.out.print("차감 할 포인트 :");
							int point = s.nextInt();
							if ((int) user.get("point") > point) {
								user.put("point", (int) user.get("point") - point);
								System.out.println(name + "님의 포인트가 " + point + " 만큼 차감되었습니다.");
							} else {
								System.out.println("차감할 수 있는 포인트는 " + user.get("point") + "입니다.");
							}
						}
					}
					if (!userFlg) {
						System.out.println("해당 사용자가 존재하지 않습니다.");
					}

				} else if (menu == 4) {
					System.out.print("포인트 확인 할 사용자 이름 : ");
					String name = s.next();
					boolean userFlg = false;
					for (int i = 0; i < list.size(); i++) {
						HashMap<String, Object> user = list.get(i);
						if (user.get("name").equals(name)) {
							userFlg = true;
							System.out.println(name + "님의 현재 포인트는" + user.get("point") + "입니다.");
						}
					}
				} else if (menu == 5) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("메뉴는 1~5중에 선택해주세요.");
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
