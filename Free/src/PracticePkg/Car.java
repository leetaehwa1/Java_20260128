package PracticePkg;

public class Car implements CarManager {
//	 -- 필드(변수) 생성, kind(String), speed(int), color(String)
//    -- Car c = new Car("소나타", 0, "검정"); 코드가 정상 동작하도록 생성자 작성
//    -- System.out.println(c); 해당 코드 실행 시 '차 종류는 소나타, 색은 검정 입니다' 출력되도록 toString 메소드 재정의
//    -- CarManager를 implements 하여 아래 조건에 맞게 추상메소드 모두 오버라이딩할 것
//    	-- SpeedUp -> 기존 speed 변수 값에 매개변수로 받은 값만큼 증가
//                  단, 매개변수로 음수는 입력되지 않는다고 가정하며, 증가된 speed 가 200이 초과할 경우 200으로 고정
//    	-- SpeedDown -> 기존 speed 변수 값에 매개변수로 받은 값만큼 감소
//                  단, 매개변수로 음수는 입력되지 않는다고 가정하며, 감소된 speed 가 0이 미만일 경우 0으로 고정
//      -- getSpeed -> speed 값을 리턴
	String kind;
	int speed;
	String color;

	Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "차 종류는 " + kind + ", 색은 " + color + "색 입니다.";
	}

	@Override
	public void SpeedUp(int x) {
		// TODO Auto-generated method stub
		speed += x;
		if (speed > 200) {
			speed = 200;
		}
	}

	@Override
	public void SpeedDown(int y) {
		// TODO Auto-generated method stub
		speed -= y;
		if (speed < 0) {
			speed = 0;
		}
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		조건 5. main메소드에서 아래 코드를 실행하고 결과를 캡처
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c); // '차 종류는 소나타, 색은 검정 입니다'
		c.SpeedUp(100);
		System.out.println(c.getSpeed()); // 100
		c.SpeedUp(150);
		System.out.println(c.getSpeed()); // 200
		c.SpeedDown(30);
		System.out.println(c.getSpeed()); // 170
	}

}
