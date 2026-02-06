package Day8;

public class ColorPoint extends Point {
	private String color;

	ColorPoint() {
		this(0, 0, "BLACK");
//		super(0,0);
//		this.color = "BLACK";
	}

	ColorPoint(int x, int y) {
		this(x, y, "BLACK");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y); // super 생략가능

	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
//		RED색의 (10,20)의 점
	public String toString() {
		return this.color + " (" + getX() + " , " + getY() + ") 의 점";
	}

}
