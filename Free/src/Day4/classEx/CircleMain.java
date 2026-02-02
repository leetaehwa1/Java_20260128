package Day4.classEx;

public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle("자바피자",10); // Circle pizza;
									 //	pizza = new Circle;
//		pizza.name = "자바피자";
//		pizza.radius = 10;
//		pizza.getArea();
		System.out.println(pizza.getArea());
//		double area = pizza.getArea();
//		System.out.println(area);
		
		Circle donut = new Circle();
		donut.name = "자바도넛";
		donut.radius = 2;
		System.out.println(donut.getArea());
//		double area = pizza.getArea();
//		System.out.println(area);
	}

}
