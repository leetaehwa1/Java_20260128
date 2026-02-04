package Day6;

public class Person {
	private String name;
	private int age;
	private String addr;
	private String gender;
	
	Person(){
		System.out.println("Person 생성자 호출!");
	}
	
	Person(String name, int age, String addr) {
		this(name, age, addr, ""); //중복되는 인자들이 있을 때 사용하는 생성자.this();본인 클래스내에서
	}

	Person(String name, int age, String addr, String gender) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}
}