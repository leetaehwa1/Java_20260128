package Day5;

public class Human {
	String name;
	int age;
	String addr;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	int money;
	Human(){}
	Human(String name, int money){
		this.name = name;
		this.money = money;
	}
	void eat(String food) {
		System.out.println(food + "을(를) 먹는다");
		
	}
}
