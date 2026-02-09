package Day9;

//깃보고 다시하기
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java05_성적관리프로그램 {
	static Scanner s = new Scanner(System.in);

	public static int inputNumber(int first, int last) {
		int result = 0;
		while (true) {
			result = s.nextInt();
			if (result < first || result > last) {
				System.out.println(first + "~" + last + "사이 값을 다시 입력해주세요 : ");
			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == [ 1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료 ] ==
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {

			System.out.print("[ 1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 학생 추가(이름,나이)
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);

				System.out.print("나이 : ");
				int age = s.nextInt();
				map.put("age", age);

				list.add(map);

			} else if (menu == 2) {
				// 성적 입력(java, oracle, html)
				System.out.print("성적을 입력할 학생 이름 입력 : ");
				String name = s.next();
				boolean studentFlag = false;
				for (int i = 0; i < list.size(); i++) {
//					if (list.get(i).get("name").equals(name)) {//메소드 체이닝
					HashMap<String, Object> student = list.get(i);
					if (student.get("name").equals(name)) {
						studentFlag = true;

						System.out.println("자바 : ");
						int java = inputNumber(0, 30);
						student.put("java", java);

						System.out.println("오라클 : ");
						int oracle = inputNumber(0, 50);
						student.put("oracle", oracle);

						System.out.println("html : ");
						int html = inputNumber(0, 20);
						student.put("html", html);

					}
				}
				if (!studentFlag) {
					System.out.println("해당 이름의 학생이 없습니다.");

				}
			} else if (menu == 3) {
				// 성적 확인
				// 2번처럼 이름 입력받고
				// 해당 이름을 가진 map이 없으면 "해당 이름 학생 없습니다."출력
				// 있으면 "ooo의 점수 : oo, 오라클 : oo, html : oo" 출력
				System.out.print("성적을 확인 할 학생 이름 : ");
				String name = s.next();
				boolean studentFlag = false;
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)) {
						// 학생 이름은 있지만, 점수를 입력되지 않았을 때 로직 처리
						studentFlag = true;
						if (!map.containsKey("java")) { // 특정 key 가 있는지 없는지
							System.out.println("성적 점수가 입력되지 않았습니다.");
							break;
						}
						System.out.print(name + "의 점수 => ");
						System.out.print("자바 : " + map.get("java") + ", ");
						System.out.print("오라클 : " + map.get("oracle") + ", ");
						System.out.println("html : " + map.get("html"));
						break;
					}
				}
				if (!studentFlag) {
					System.out.println("해당 이름의 학생이 없습니다.");
				}

			} else if (menu == 4) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4중에 하나를 선택해주세요.");
			}

		}
	}

}
