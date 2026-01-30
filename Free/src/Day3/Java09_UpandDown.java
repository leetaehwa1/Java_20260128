package Day3;

import java.util.Random;
import java.util.Scanner;

public class Java09_UpandDown {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		int random = ran.nextInt(100) + 1; // 1~100 (경우의 수라고 생각)
		int count = 1; //시도 횟수
		while (true) { 
			System.out.print(count + "번째 시도 :");
			int answer = s.nextInt(); //사용자의 응답
			if (!(answer >= 1 && answer <= 100)) { // = if (answer < 1 || answer > 100)
				System.out.println("1~100사이의 값을 입력해주세요");
			}

			else if (answer < random) {
				System.out.println("up");
				count++;
			} else if (answer > random) {
				System.out.println("down");
				count++;
			} else {
				System.out.println("정답!" + count + "번째 만에 맞췄습니다.");
				break;
			}

		}

	}

}
