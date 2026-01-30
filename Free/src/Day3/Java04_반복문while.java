package Day3;
//복습하기
public class Java04_반복문while {

	public static void main(String[] args) {

		// for(선언부;조건식;증감식)
		// while(조건)
		// while(조건), 선언은 밖, 증감은 안
		// for(int i=1;i<=10,i++

		int i = 2;
		while (i <= 9) {
			System.out.println("===" + i + "단===");
			int j = 1;//상위 while문 안의 while 문 위에 위치해야함.
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
		}

	}

}
