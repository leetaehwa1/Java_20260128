package Day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Day13.DBClass;

public class 수도퀴즈_DB {
	static Scanner s = new Scanner(System.in);

	public static void runQuiz(Statement stmt) {
		try {
			// 문제수를 사용자로부터 직접 입력 받기
			// 최소 3, 최대 10

			// 맞춘 개수 알려주기
			// (00문제 중 00개 맞추셨습니다.)
			int count = 0;
			while (true) {
				System.out.print("문제 수 입력 : ");
				count = s.nextInt();
				if (count >= 3 && count <= 10) {
					break;
				}
				System.out.println("3~10 사이의 수 입력하세요.");
			}
			String sql = "SELECT * FROM (SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= " + count;
			ResultSet rs = stmt.executeQuery(sql);
			int quizNum = 1;
			int correctNum = 0;

			while (rs.next()) {
				System.out.print(quizNum + "번) " + rs.getString("COUNTRY") + " : ");
				quizNum++;
				String answer = s.next();
				if (answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답입니다.");
					correctNum++;
				} else {
					System.out.println("오답입니다. 정답은 " + rs.getString("CAPITAL"));
				}
			}
			System.out.println(count + "개 문제 중" + correctNum + "개 정답!");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void addQuiz(Statement stmt) {
		try {
			// 추가 할 나라 이름 입력 받은 후 db에 있는 지 없는 지 확인.
			System.out.print("나라 이름 :");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				System.out.println("중복된 나라 이름입니다.");
			} else {
				System.out.print("수도를 입력해주세요 : ");
				String capital = s.next();

				sql = "INSERT INTO TBL_QUIZ VALUES(QUIZ_SEQ.NEXTVAL, " + "'" + country + "', '" + capital + "')";
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					System.out.println("등록됐습니다.");
				} else {
					System.out.println("등록에 실패했습니다.");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void editQuiz(Statement stmt) {
		try {
			// 나라 이름 입력 받은 후 수도 이름 출력해주기.
			// 필리핀 입력하면 "현재 등록된 수도명은 마니라 입니다. 수정하시겠습니까? (Y/N)"
			// Y누르면 수정, N 누르면 메인메뉴로 그외 값 입력시 다시 입력하도록
			// 없는 나라 입력 시 "등록되지 않은 나라입니다." 출력 후 메인메뉴로.
			System.out.print("나라 이름 :");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				System.out.print("현재 등록된 수도명은 " + rs.getString("CAPITAL") + "입니다. 수정하시겠습니까? (Y/N) : ");
				while (true) {
					String edit = s.next();
					if (edit.toLowerCase().equals("y")) {
						System.out.print("수정 할 수도명 : ");
						String capital = s.next();
						sql = "UPDATE TBL_QUIZ SET " + "CAPITAL = '" + capital + "'" + "WHERE COUNTRY ='" + country
								+ "'";

						int result = stmt.executeUpdate(sql);
						if (result > 0) {
							System.out.println("수정되었습니다.");
						} else {
							System.out.println("실패함.");
						}
						break;
					} else if (edit.toLowerCase().equals("n")) {
						return;
					} else {
						System.out.print("y/n 중에 하나를 선택하세요.");
					}
				}

			} else {
				System.out.println("등록되지 않은 나라입니다.");

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void removeQuiz(Statement stmt) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료

		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		boolean closeFlg = true;
		while (closeFlg) {
			System.out.print("[ 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료 ] : ");
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				runQuiz(stmt);
				break;
			case 2:
				addQuiz(stmt);
				break;
			case 3:
				editQuiz(stmt);
				break;
			case 4:
				removeQuiz(stmt);
				break;
			case 5:
				System.out.println("종료되었습니다.");
				closeFlg = false;
				break;

			default:
				System.out.println("메뉴는 1에서 5사이의 숫자를 선택하세요.");
				break;
			}
		}

	}

}
