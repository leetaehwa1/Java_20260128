package Day8;

public class Point3D extends Point {
	private int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	void moveUp() {
		this.z += 1;
	}

	void moveDown() {
		this.z -= 1;
	}

	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + this.z + ") 의 점";
	}

}
