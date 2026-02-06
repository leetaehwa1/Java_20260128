package Day8;

public class PositivePoint extends Point {

	PositivePoint() {
		super(0, 0);
	}

	PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 && y < 0) {
			super.move(0, 0); // 초기화 여기서는 부모거나 본인의 메소드 실행가능
		}
	}

	@Override
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) {
			super.move(x, y); // 초기화
		}

	}

	public String toString() {
		return "(" + getX() + " , " + getY() + ") 의 점";
	}
}
