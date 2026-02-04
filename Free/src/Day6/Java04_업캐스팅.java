package Day6;

public class Java04_업캐스팅 {
	//Object 는 모든 객체를 표현할 수 있음.
	static void fruitBoxing(Fruit f) { //하나의 코드로 묶어서 받아서 처리 가능.
		
		if(f instanceof Apple) {
			System.out.println("토마토 서비스로 드림.");
		}

		// 포장기능
		System.out.println(f.name + "를 포장한다!");
	}

//	static void appleBoxing(Apple a) {
//		// 포장기능
//		System.out.println(a.name + "를 포장한다!");
//	}
//
//	static void bananaBoxing(Banana b) {
//		// 포장기능
//		System.out.println(b.name + "를 포장한다!");
//	}
//
//	static void orangeBoxing(Orange o) {
//		// 포장기능
//		System.out.println(o.name + "를 포장한다!");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모클래스 ->Fruit 
		// 자식클래스 ->Apple,Banana,Orange
		Apple apple = new Apple("청주사과", 1000);
		fruitBoxing(apple);
		Banana banana = new Banana("맛있는 바나나", 500);
		Orange orange = new Orange("오렌지", 2000);
		fruitBoxing(banana);
//		fruitBoxing(orange);
		
		int arr[]=new int[5];
		
		Object arr2[] = {1,"zz",apple,true}; //데이터타입의 제약없이 값을 넣는 것이 가능하다. 
		
		
		
//		Fruit a = apple;// 부모클래스는 자식클래스의 객체를 받을 수 있음
//		Fruit b = banana;
//		Fruit o = orange;
	}

}
