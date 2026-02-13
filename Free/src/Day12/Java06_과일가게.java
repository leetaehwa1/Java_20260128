package Day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java06_과일가게 {
	static Scanner s = new Scanner(System.in);

	public static ResultSet getFruit(Statement stmt) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("과일 이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
			// return stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		// return null

	}

	public static void addFruit(Statement stmt) {
		try {
			Scanner s = new Scanner(System.in);
			// 과일 이름 ,개수, 가격 입력 받아서 DB(TBL_FRUIT) 에 저장
			// 과일 이름이 이미 있는 경우 개수만 입력받아서 기존에 더해주기
			System.out.print("이름 : ");
			String name = s.next();

			System.out.print("개수 : ");
			int count = s.nextInt();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) { // 있냐 없냐를 판단하는 조건.
				sql = "UPDATE TBL_FRUIT SET " + "COUNT = " + (rs.getInt("COUNT") + count) + " WHERE NAME = '" + name
						+ "'";
				stmt.executeUpdate(sql);
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					System.out.println("개수가 추가되었습니다.");
				}
			} else {

				// INSERT (이름, 개수, 가격)추가
				System.out.print("가격 : ");
				int price = s.nextInt();
				sql = "INSERT INTO TBL_FRUIT VALUES(" + "'" + name + "'," + price + "," + count + ")";
				int result = stmt.executeUpdate(sql); //
				if (result > 0) { // 결과가 하나 이상 나오면
					System.out.println("추가되었습니다.");
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	};

	public static void searchFruit(Statement stmt) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("과일 이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print(rs.getString("NAME") + " | ");
				System.out.print(rs.getInt("PRICE") + " | ");
				System.out.println(rs.getInt("COUNT"));
			} else {
				System.out.println(Message.failMsg);
			}

//			rs.next();
//			System.out.print(rs.getString("NAME") + " | " );
//			System.out.print(rs.getString("PRICE") + " | " );
//			System.out.println(rs.getString("COUNT"));

//			while(rs.next()) {
//				System.out.print(rs.getString("NAME") + " | " );
//				System.out.print(rs.getString("PRICE") + " | " );
//				System.out.println(rs.getString("COUNT"));
//			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void removeFruit(Statement stmt) {
		// TODO Auto-generated method stub
		try {

			// 과일 이름 입력받고 삭제하기
			// 과일 이름이 db 에 있으면 정말 삭제할 지 한 번 더 물어보고('Y', 'N') 삭제
			// 대소문자 구분 없이 Y(y) 하면 삭제, N(n)하면 메뉴로 이동
			// 그 외 문자 입력 시 'Y', 'N'중에 선택하세요 출력 후 다시 입력하도록
			// 과일 이름 없으면 '해당 과일은 존재하지 않습니다.' 출력 후 메뉴로 이동.
			Scanner s = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql); // 이안에는 데이터가 한 개 있거나 아예 없음. true or false
			if (rs.next()) {
				while (true) {
					System.out.print("정말 삭제하겠습니까?(y/n)");
					String confirm = s.next();
					if (confirm.toUpperCase().equals("Y")) {
						sql = "DELETE FROM TBL_FRUIT WHERE NAME = '" + name + "'";
						int result = stmt.executeUpdate(sql);
						if (result > 0) {
							System.out.println("삭제 완료!");
							return;// 안해도됨.
						}
					} else if (confirm.toUpperCase().equals("N")) {
						return; // 리턴 독립적으로 사용하면 메소드를 빠져나감.
					} else
						System.out.println("y/n 중 선택해라");
				}
			} else {
				System.out.println(Message.failMsg);
			}

//			if (rs.next()) {
//				System.out.print("정말 삭제하시겠습니까? ('Y(y)', 'N(n)') : ");
//				String yn = s.next();
//
//				if (yn.equalsIgnoreCase("Y")) {
//					sql = "DELETE FROM TBL_FRUIT WHERE NAME = '" + name + "'";
//					stmt.executeUpdate(sql);
//					System.out.println("과일이 삭제되었습니다.");
//
//				} else if (yn.equalsIgnoreCase("N")) {
//					System.out.println("메뉴로 이동합니다.");
//				} else {
//					System.out.println("'Y', 'N' 중에 선택하세요.");
//				}
//
//			} else {
//				System.out.println("해당 과일이 존재하지 않습니다.");
//			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void sellFruit(Statement stmt) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print("판매 개수 : ");
				int count = s.nextInt();
				if (rs.getInt("COUNT") >= count) {
					sql = "UPDATE TBL_FRUIT SET " + "COUNT = " + (rs.getInt("COUNT") - count) + " WHERE NAME = '" + name
							+ "'";
					int result = stmt.executeUpdate(sql);
					if (result > 0) {
						System.out.println("판매했습니다.");
					}
				} else {
					System.out.println("물량 부족! 현재 판매 가능한 개수는 " + rs.getInt("COUNT"));
				}

			} else {
				System.out.println(Message.failMsg); // 일관성있게 출력해야됨.
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void editFruit(Statement stmt) {
		try {
			ResultSet rs = getFruit(stmt);
			if (rs.next()) {
				System.out.println("현재" + rs.getString("NAME") + "의 가격은 " + rs.getInt("PRICE") + "원 입니다.");
				System.out.print("수정 할 금액을 입력해주세요 : ");
				int price = s.nextInt();
				String sql = "UPDATE  TBL_FRUIT SET " + "PRICE = " + price + " WHERE NAME = '" + rs.getString("NAME")
						+ "'";
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					System.out.println("수정되었습니다.");
				}
			} else {
				System.out.println(Message.failMsg);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();

		try {
			// 1.과일 추가, 2. 과일 판매, 3. 가격 수정, 4. 과일 삭제, 5. 종료
			boolean flg = true; // while 변수안에 true 대신 변수 선언하는 경우 많음.
			while (flg) {

				System.out.print("[1.과일 추가, 2. 과일 판매, 3. 가격 수정, 4. 과일 삭제, 5. 과일 확인, 6. 종료] : ");
				int menu = s.nextInt();
				switch (menu) {
				case 1:
					addFruit(stmt);
					break;
				case 2:
					sellFruit(stmt);
					break;
				case 3:
					editFruit(stmt);
					break;
				case 4:
					removeFruit(stmt);
					break;
				case 5:
					searchFruit(stmt);
					break;
				case 6:
					System.out.println("종료되었습니다!");
					flg = !flg;
					break;

				default:
					System.out.println("1에서 6사이를 메뉴 선택하세요.");
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
