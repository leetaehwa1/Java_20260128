package Day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java03_오라클_삭제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner s = new Scanner(System.in);

		try {
			// 스캐너로 학번 입력 받아서 해당 학번 학생 삭제.
			System.out.print("삭제 할 학번 : ");
			String stuNo = s.next(); // 문자열로 할 땐
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '" + stuNo + "'"); // ''붙혀야됨.
			if (result > 0) {
				System.out.println("삭제되었습니다.");
			} else
				System.out.println("해당 학생 없음.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
