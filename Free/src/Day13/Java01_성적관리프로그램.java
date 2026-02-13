package Day13;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java01_성적관리프로그램 {
	static Scanner s = new Scanner(System.in);

	public static ResultSet getStuNo(Statement stmt) {
		try {
			System.out.print("학번 : ");
			String stuNo = s.next();
			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void addStudent(Statement stmt) {
		try { // 1. 학생 추가(학번, 이름, 학과 입력받아서 저장)
				// -> 학번은 중복 체크 후 저장
				// -> 학번은 무조건 네 자리
			String stuNo = "";
			while (true) { // 프라이머리 정보여서 범위를 정해줘야됨.

				System.out.print("학번 : ");
				stuNo = s.next();
				if (stuNo.length() != 4) {
					System.out.println("학번은 4글자 입니다.");
					continue;
				} else {
					ResultSet rs = stmt.executeQuery("SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'");
					if (rs.next()) {
						System.out.println("중복되었습니다. 다시 입력하세요.");
					} else {
						System.out.println("사용 가능한 학번입니다.");

						System.out.print("이름 : ");
						String name = s.next();

						System.out.print("학과 : ");
						String dept = s.next();

						String sql = "INSERT INTO TBL_STUDENT (STU_NO, STU_NAME, STU_DEPT) VALUES(" + "'" + stuNo
								+ "', " + "'" + name + "', " + "'" + dept + "') ";

						int result = stmt.executeUpdate(sql);
						if (result > 0) {
							System.out.println("학생이 입력되었습니다.");

						}
						break;
					}

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void insertGrade(Statement stmt) {
		try {
			// 2. 성적 입력
			// -> 학번을 입력받은 후 해당 학생 존재하는지 확인
			// -> 자바, 오라클, HTML 점수를 입력받아서 DB에 저장
			// -> 점수는 0~100 사이 값을 입력받아서 저장 하도록 함.
			ResultSet rs = getStuNo(stmt);
			if (rs.next()) {
				String stuNo = rs.getString("STU_NO");
				   
				System.out.print(" 자바 :");
				int java = s.nextInt();

				System.out.print(" 오라클 :");
				int oracle = s.nextInt();

				System.out.print(" HTML : ");
				int html = s.nextInt();

				String sql = "UPDATE STUDENT SET " + "JAVA = " + java + ", " + "ORACLE = " + oracle + ", " + "HTML = "
						+ html + " WHERE STU_NO = '" + stuNo + "'";

				int insert = stmt.executeUpdate(sql);
				if (insert > 0) {
					System.out.println("성적 입력이 완료되었습니다.");
				}

			} else {
				System.out.println(Message.failMsg);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void confirmGrade(Statement stmt) {
		// 3. 성적 확인
		// -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		// -> 해당 학생의 이름, 각 과목의 점수를 출력
		ResultSet rs = getStuNo(stmt);

	}

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub

		// 4. 성적 수정
		// -> 학번을 입력받은 후 해당 학생 존재하는지 확인
		// -> 수정하고자 하는 과목 선택(1. 자바, 2. 오라클, 3.HTML)
		// -> 점수 입력받은 후 (0~100) 수정

		// 5. 종료

		try {
			boolean flg = true;
			while (flg) {

				System.out.print("[1.학생 입력, 2. 성적 입력, 3. 성적 확인, 4. 성적 수정, 5. 종료] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					addStudent(stmt);
					break;
				case 2:
					insertGrade(stmt);
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					if (!flg) {
						System.out.println("종료되었습니다");
					}

				default:
					System.out.println("1에서 5사이의 메뉴를 선택하세요.");
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
