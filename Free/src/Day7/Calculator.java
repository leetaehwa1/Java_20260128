package Day7;

import Day6.classEx.ArrayFunc;

public class Calculator {
	static final double PI = 3.14;//모든 변수는 private 를 붙이는 것을 권장하지만 static 은 붙이면 안됨.
	
	private String name;
	int price;
	String color;

	Calculator(String name, int price, String color) {//앞에 타입을 붙이는 이유는 명확히 구분하기 위함.
		this.name = name;
		this.price = price;
		this.color = color;
	}

	int sum(int x, int y) {
		return x + y;
	}

	int sum(int[] arr) {
		ArrayFunc func = new ArrayFunc();
		return func.arrSum(arr);
	}

	public String getName() {
		return name;
	}
}
