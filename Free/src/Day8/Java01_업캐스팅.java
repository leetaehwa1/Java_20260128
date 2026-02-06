package Day8;

public class Java01_업캐스팅 {
	static void test1(Point p) {// 부모 클래스를 인자로 선언 해놓으면
		if (p instanceof Point3D) {
			System.out.println(p.getX() * p.getX());
		}
		System.out.println(p.getX() * p.getY()); // 자식 클래스들 모두 들어갈 수 있음.
	}

//	static void test1(ColorPoint cp) {
//		System.out.println(cp.getX() * cp.getX());
//	}
//
//	static void test1(Point3D p3) {
//		System.out.println(p3.getX() * p3.getX());
//	}
//
//	static void test1(PositivePoint pp) {
//		System.out.println(pp.getX() * pp.getX());
//	}

	public static void main(String[] args) {
		Point p = new Point(0, 2);
		ColorPoint cp = new ColorPoint(10, 20, "blue");
		Point3D p3 = new Point3D(1, 2, 3);
		PositivePoint pp = new PositivePoint(5, 10);

		test1(p3);
	}

}
