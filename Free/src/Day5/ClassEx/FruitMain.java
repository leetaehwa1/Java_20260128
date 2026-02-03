package Day5.ClassEx;

public class FruitMain {//많이중요

	public static void main(String[] args) {
		Fruit apple = new Fruit("사과", 1000,30);
		apple.setPrice(1500);
		System.out.println(apple.getPrice());
		//클래스의 이름 가지고는 변수나 메소드에 접근 불가.	ex Fruit.getPrice();
		//예외적으로, Math 클래스는 변수나 메소드에 접근 가능
		
	}

}
