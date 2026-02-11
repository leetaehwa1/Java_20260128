package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java01_리스트객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Food> list = new ArrayList<>();
		ArrayList<String> foodNameList = new ArrayList<>();

		while (true) {
			try {
				System.out.print("[1. 제품 등록, 2. 제품 삭제, 3. 종료] : ");
				int menu = s.nextInt();
				if (menu == 1) {
					// 이름, 가격을 입력받아서 Food 객체로 만든 후 리스트에 저장
					// 단, 중복된 이름 허용 x, 가격은 0이하 x
					boolean foodFlg = true;
					String name = "";
					while (foodFlg) {
						System.out.print("이름 : ");
						name = s.next();
						foodFlg = foodNameList.contains(name);
						if (foodFlg) {
							System.out.println("이미 있는 제품 이름 입니다.");
						}
					}

					int price = 0;
					while (true) {
						System.out.print("가격 : ");
						price = s.nextInt();
						if (price <= 0) {
							System.out.println("1원 이상 입력하세요.");
						} else {
							break;
						}

					}

					Food food = new Food(name, price); // 객체 생성.
					list.add(food); // 리스트 추가.
					foodNameList.add(name);

				} else if (menu == 2) {
					// 제품 이름을 입력 받아서 해당 제품을 삭제
					// 제품 이름이 없으면 '없는 제품 입니다.' 출력
					// 있으면 리스트에서 제거.
					System.out.print("삭제할 제품을 입력하세요 : ");
					String name = s.next();

					boolean foodFlg = foodNameList.contains(name);
					if (foodFlg) {
						for (int i = 0; i < list.size(); i++) {
							Food food = list.get(i);
							if (food.getName().equals(name)) {

								list.remove(i);
								foodNameList.remove(i);
								break;
							}
						}
					} else {
						System.out.println("없는 제품입니다.");
					}
					System.out.println(list);
//					for (int i = 0; i < list.size(); i++) {
//						Food food = list.get(i);
//						if (name.equals(food.getName())) {
//							foodFlg = true;
//							System.out.println("삭제 한 제품 = " + food.getName());
//							list.remove(food);
//						}
//						if (!foodFlg) {
//							System.out.println("없는 제품입니다.");
//						}
//
//					}

				} else if (menu == 3) {
					System.out.println("종료되었습니다.");
				} else {
					System.out.println("1~3사이의 숫자를 입력하세요.");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("입력오류");
				s.next();
			}
		}

	}

}
