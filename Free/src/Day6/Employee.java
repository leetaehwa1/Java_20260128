package Day6;

public class Employee extends Person {
	String empNo;

	public Employee(String name, int age, String addr, String empNo) {
		super(name,age,addr);//부모의 생성자를 선택하는 것이 가능
		this.empNo = empNo;
	}

	public Employee(String name, int age, String addr, String gender, String empNo) {
		super(name,age,addr,gender);//무조건 첫 줄에(부모 클래스를 먼저 처리해야 하기 때문에)
		this.empNo = empNo;	
	}
}