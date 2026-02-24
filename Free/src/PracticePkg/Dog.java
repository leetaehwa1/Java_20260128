package PracticePkg;

public class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 에러가 발생하지 않도록 생성자 작성(name, age 초기화)
		// 2. 해당 클래스(Dog)의 객체 생성 후 sound 메소드 호출 시
		// '이름 : ooo(name변수 정보), 나이 : oo(age변수 정보)가 멍멍 소리냅니다. ' 출력되도록 코드를 작성할 것
		Dog dog = new Dog("진돗개", 10);
		dog.sound();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " " + this.getAge() + "살 이(가) 멍멍 소리냅니다.");
	}
}
