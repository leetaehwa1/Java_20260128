package Day3;

import java.util.Random;
import java.util.Scanner;

public class Java06_랜덤 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
//		int a = ran.nextInt(10); //0~9
//		int b = ran.nextInt(10)+1; //1~10
//		System.out.println();
		
		int x = ran.nextInt(8)+2; //2~9
		int y = ran.nextInt(9)+1; //1~9
		System.out.print(x + " * " + y + " = " );
		int answer = s.nextInt();
		
		if (x * y == answer) {
			System.out.println("정답");
			
		}else {
			System.out.println("오답");
		}
	}

}
