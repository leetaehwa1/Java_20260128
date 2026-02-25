package Day17;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 수도퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자한테 몇문제를 풀지 물어보고 해당 문제수 만큼 출제.
		// 내가 가진 문제 수 보다 큰 숫자 입력은 x
		// 중복 된 문제 출제 x

		Scanner s = new Scanner(System.in);
		CapitalQuiz obj = new CapitalQuiz();
		ArrayList<Quiz> quizList = obj.getList();
		ArrayList<Quiz> questionList = obj.getList();
		Random ran = new Random();
		int count = 0;
		while (true) {
			System.out.print("몇 문제 풀래? :");
			count = s.nextInt();
			if (count > quizList.size() || count < 3) {
				System.out.println("최대 문제 수는 " + quizList.size() + " 문제 입니다. 최소 문제 수는 3 문제 입니다.");
				continue;
			}
			break;
		}

		for (int i = 1; i <= count; i++) {
			int ranNum = ran.nextInt(quizList.size());
			Quiz quiz = quizList.get(ranNum);

			if (questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}

			System.out.print(i + ") " + quiz.getCountry() + " : ");
			String answer = s.next();
			if (answer.equals(quiz.getCapital())) {
				System.out.println("정답 !");
			} else {
				System.out.println("오답 ! 정답은 '" + quiz.getCapital() + "' 입니다.");
			}
		}
	}

//		int count = 0;
//		while (true) {
//			System.out.print("문제 수 입력 : ");
//			count = s.nextInt();
//			if (count > quizList.size()) {
//				System.out.println("문제 수 보다 많이 출제할 수 없습니다.");
//			} else {
//				for (int i = 0; i < count; i++) {
//					int ranNum = ran.nextInt(quizList.size());
//					Quiz quiz = quizList.get(ranNum);
//					System.out.print((i + 1) + ") " + quiz.getCountry() + " : ");
//					if (quiz.equals(quizList.get(i))) {
//						i--;
//						continue;
//					}
//					String answer = s.next();
//					if (answer.equals(quiz.getCapital())) {
//						System.out.println("정답 !");
//					} else {
//						System.out.println("오답 ! 정답은 '" + quiz.getCapital() + "' 입니다.");
//					}
//				}
//			}
//		}
}
