package Day3;
//복습하기
import java.util.Scanner;

public class Java05_반복문 {

	public static void main(String[] args) {
		// while 무한루프 for문은 for(;;) = while(true)
		// 문제. 입력되는 숫자를 모두 더하시오
		// 단, -1을 입력하면 여태 더한 값을 출력하고 종료하시오.
		Scanner s = new Scanner(System.in);
		int sum = 0; // 누적해서 저장하는 공간을 만들어줘야함. while 문보다 먼저 실행해야함. 
		int count = 1;
		while (true) {
			System.out.print(count + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if (num != -1) {
				sum += num; // sum = sum + num;
			} else {
				// -1이 입력되었을 경우.
				break;
			}
			count++; // while문 끝나기 전에 count를 증감
		}
		System.out.println("숫자들의 합 : " + sum);//while문 끝난 밖에 출력.
	}
}
