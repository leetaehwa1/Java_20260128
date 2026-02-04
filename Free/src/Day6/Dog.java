package Day6;

public class Dog extends Animal {
	// 오버라이딩 부모 클래스의 메소드를 자식 클래스에서 수정가능
	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void speak() {
		System.out.println("멍멍");
//		super.speak();
	}
}
