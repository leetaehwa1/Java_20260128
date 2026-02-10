package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class java05_성적관리프로그램 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<String>();
		// 1번 메뉴 -> 학생 추가, 2번메뉴 -> 성적입력, 3번메뉴->성적조회
		// 4번 메뉴 -> 종료, 그 외 숫자 -> 다시 입력하도록
		while (true) {
			try {
				System.out.print("[ 1. 학생추가, 2. 성적입력, 3. 성적조회, 4.종료 ]");
				int menu = s.nextInt();// 중복된 학번이 있으면 학번을 다시 입력하도록.
				if (menu == 1) {
					boolean stuNoFlg = true;
					String stuNo = "";
					while (stuNoFlg) {
						System.out.print("학번 : ");
						stuNo = s.next();
						stuNoFlg = stuNoList.contains(stuNo);
						if (stuNoFlg) {
							System.out.println("중복된 학번 있음!");
						}
					}
					System.out.print("이름 : ");
					String name = s.next();

					System.out.print("나이 : ");
					int age = s.nextInt();

					Student stu = new Student(stuNo, name, age);
					stuNoList.add(stuNo);
					list.add(stu);
					System.out.println(list);

				} else if (menu == 2) {
					// 성적입력
					// 학번을 입력 받아서 해당 학번 학생의 자바, 오라클, html 점수를 입력 받아서 저장
					// 해당하는 학번 없을 경우 '해당 학번을 가진 학생이 없습니다.'출력 후 메뉴로 이동.
					boolean stuFlg = false;
					System.out.print("학번 : ");
					String stuNo = s.next();
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						if (stuNo.equals(stu.getStuNo())) {
							stuFlg = true;
							stu.setJava();

							System.out.print("오라클 : ");
							int oracle = s.nextInt();
							stu.setOracle(oracle);

							System.out.print("html : ");
							int html = s.nextInt();
							stu.setHtml(html);
						}
						if (!stuFlg) {
							System.out.println("해당 학번을 가진 학생이 없습니다.");
						}
					}
					System.out.println(list);

				} else if (menu == 3) {
					// 모든 학생의 정보 출력
					// 학번:000, 이름:000, 자바:00, 오라클: 00, html:00
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.print("학번 : " + stu.getStuNo() + ", ");
						System.out.print("이름 : " + stu.getName() + ", ");
						System.out.print("자바 : " + stu.getJava() + ", ");
						System.out.print("오라클 : " + stu.getOracle() + ", ");
						System.out.print("html : " + stu.getHtml() + ", ");
						System.out.println();
					}
				} else if (menu == 4) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("1~4 중에 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("입력오류");
				s.next();
			}
			System.out.println(list);
		}

	}
}