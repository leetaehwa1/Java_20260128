package Day4.classEx;

public class Calculator {
	double pi = 3.141592;

	Calculator() {// 생성자는 클래스 이름과 동일
		System.out.println("계산기 생성!");
	}

	void intro() {
		System.out.println("아주아주 좋은 계산기 입니다!");
	}

	int abs(int x) {// 숫자 하나
		System.out.println("절대값을 되돌려 드립니다!");
		return x < 0 ? -x : x;
	}
//		int y = x < 0 ? -x : x;
//		return y;

//		int y;
//		if (x < 0) {
//			y = -x;
//		} else {
//			y = x;
//		}
//		return y;
	int sum(int x, int y) {// 숫자 두개.
		return x + y;

	}

	double sum(int x, double y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}
}
