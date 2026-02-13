package Day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java05_오라클_UPDATE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		// 스캐너로 학생 입력받고 해당 학생 STU_CLASS 를 D로 수정.
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("업데이트 할 학번 : ");
			String stuNo = s.next();

			String sql = "UPDATE STUDENT SET STU_CLASS ='D'  WHERE STU_NO = '" + stuNo + "'";
//			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("수정되었습니다.");
			} else {
				System.out.println("해당 학생 없음.");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

}
