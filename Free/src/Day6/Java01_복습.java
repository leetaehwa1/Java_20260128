package Day6;

import java.util.Random;
import java.util.Scanner;

import Day5.Student;

public class Java01_복습 {
	// protected는 같은 패키지 내에서이지만 자식 클래스는 부모클래스의 protected 멤버 접근 가능
	// 디폴트는 같은 패키지 내에서만 접근 가능.
	// 오버로딩:같은 메소드
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Student hong = new Student("홍길동", 30,"1234");//이 자체가 생성자를 호출.이 생성자 말고 부모 클래스의 생성자를 먼저 실행함.(호출x)
		hong.setStuNo("9876");
		hong.setAddr("인천");
		
	}

}
