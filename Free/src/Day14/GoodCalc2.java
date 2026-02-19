package Day14;

public class GoodCalc2 implements Calculator2 { // 무조건 오버라이딩해야 벗어날 수 있다.

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
		return x > 0 ? x : y;
	}

}
