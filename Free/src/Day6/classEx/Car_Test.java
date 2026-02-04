package Day6.classEx;

public class Car_Test {
	private String name; // 자동차 이름
	private String color; // 색상
	private int speed; // 속도

	Car_Test() {
		this("기본차", "하얀색", 0);
	}

	Car_Test(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void setInfo(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;

	}

	public void carInfo() {
		System.out.println("자동차의 이름은 " + this.name + ", 색상은 " + this.color + " 입니다.");
	}

	void speedUp(int speed) {
		this.speed += speed;
		if (this.speed > 200) {
			System.out.println("200초과의 속도는 불가합니다. 200으로 변경합니다.");
			this.speed = 200;
		}
	}

	void speedDown(int speed) {
		this.speed -= speed;
		if (this.speed < 0) {
			System.out.println("0미만의 속도는 불가합니다. 0으로 변경합니다.");
			this.speed = 0;
		}
	}

	public int getSpeed() {
		return speed;
	}

//	public void carInfo(String name, String color) {
//		System.out.println("자동차의 이름은" + this.name + "색상은" + this.color + "입니다");
//	}
//
//	public void setInfo(String name, String color, int speed) {
//		System.out.println(this.name + this.color + this.speed);
//	}
//
//	public void speedUp(int speed) {
//		if (speed > 200) {
//
//			System.out.println(this.speed + "이상의 속도는 불가합니다." + this.speed + "으로 변경됩니다.");
//		} else if (speed < 0) {
//			this.speed = speed;
//			System.out.println(this.speed + "미만의 속도는 불가합니다." + this.speed + "으로 변경됩니다.");
//
//		} else {
//			this.speed = speed;
//			System.out.println("현재 속도는 " + this.speed + "입니다.");
//		}
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public String getColor() {
//		return this.color;
//	}
//
//	public int getSpeed() {
//		return this.speed;
//	}
}
