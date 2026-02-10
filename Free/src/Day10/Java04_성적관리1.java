package Day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java04_성적관리1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		// 3명의 학생을 list 에 추가
		// 학번, 이름, 나이 입력받아서 Student 객체로 만들고 list 에 추가.
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print("학번 : ");
				String stuNo = s.next();

				System.out.print("이름 : ");
				String name = s.next();

				System.out.print("나이 : ");
				int age = s.nextInt();

				Student stu = new Student(stuNo, name, age);
				list.add(stu);
//				list.add(new Student(stuNo, name, age));// 도 가능
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자만 입력.");
			s.next();
		}

		System.out.println(list);
	}

}
