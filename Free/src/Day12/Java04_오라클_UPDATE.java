package Day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java04_오라클_UPDATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		// 스캐너로 학생 입력받고 해당 학생 STU_CLASS 를 D로 수정.
		try {
			Scanner s = new Scanner(System.in);
			// 학번, 이름, 학과 를 입력받아서
			// STUDENT 테이블에 저장.
			String stuNo = "";
			while (true) { // 프라이머리 정보여서 범위를 정해줘야됨.
				System.out.print("학번 : ");
				stuNo = s.next();
				if (stuNo.length() != 8) {
					System.out.println("학번은 8글자 입니다.");
				} else {
					ResultSet rs = stmt.executeQuery
							("SELECT * FROM STUDENT WHERE STU_NO = ' " + stuNo + "'");
					if(rs.next()) {
						System.out.println("이미 사용 중인 학번입니다.");
					} else {
						System.out.println("사용 가능한 학번 입니다.");
						break;
					}
				}
			}

			System.out.print("이름 : ");
			String name = s.next();

			System.out.print("과목 : ");
			String dept = s.next();

			String sql = "INSERT INTO STUDENT (STU_NO, STU_NAME, STU_DEPT) VALUES(" + "'" + stuNo + "', " + "'" + name
					+ "', " + "'" + dept + "') ";
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("추가되었습니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
