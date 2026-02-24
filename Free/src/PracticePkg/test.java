package PracticePkg;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 숫자 중 짝수이면서 5의 배수인 숫자들의 합을 출력하시오.
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i % 5 ==0) {
				sum += i;
				System.out.println(sum);
			}	
		}

	}

}
