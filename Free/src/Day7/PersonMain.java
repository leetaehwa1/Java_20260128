package Day7;

public class PersonMain {

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 20);
		hong.setPhone("123-123");
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getPhone());

	}

}
