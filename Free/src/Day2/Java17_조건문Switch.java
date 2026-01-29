package Day2;

public class Java17_조건문Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch ~ case는 else if가 많은 코드를 작성할 때 유용하다.
		int score = 85;
		switch (score / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
//break를 생략하면 그 단계에서 다음단계로 계속 내려가서 값을 다 나타냄
			//break는 단계를 빠져나오는 용도
		default:
			System.out.println("F");
			break;
		}

	}

}
