package Day14;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Day13.DBClass;

public class Java09_DB {
	public static void removeStudent(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("삭제 할 학생 학번 입력 : ");
			String stuNo = s.next();
			String sql = "DELETE FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("삭제에 실패했습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void searchStudent(Statement stmt) {
		try {
			String sql = "SELECT * FROM TBL_STUDENT";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print("학번 : " + rs.getString("STU_NO") + ", ");
				System.out.println("이름 : " + rs.getString("STU_NAME"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void addStudent(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			String sql = "";
			while (true) {
				System.out.print("학번 입력 : ");
				String stuNo = s.next();
				sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				ResultSet rs = stmt.executeQuery(sql);
				if (rs.next()) {
					System.out.println("중복된 학번입니다.");

				} else {
					System.out.print("이름 입력 : ");
					String name = s.next();

					System.out.print("학과 입력 : ");
					String dept = s.next();

					sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT) " + "VALUES('" + stuNo + "', '" + name
							+ "', '" + dept + "')";
					int result = stmt.executeUpdate(sql);
					if (result > 0) {
						System.out.println("추가되었습니다.");
					} else {
						System.out.println("시스템 오류");
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
//		s.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner s = new Scanner(System.in);
		// 1. 검색, 2. 추가, 3. 수정, 4. 삭제
		while (true) {
			System.out.print("[1. 검색, 2. 추가, 3. 수정, 4. 삭제, 5. 종료] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				searchStudent(stmt);
			} else if (menu == 2) {
				addStudent(stmt);
			} else if (menu == 3) {
			} else if (menu == 4) {
				removeStudent(stmt);
			} else if (menu == 5) {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("메뉴는 1~5 사이 메뉴 선택하세요.");
			}
		}
	}

}
