package Day4.classEx;

public class Circle { // Class 파일과 Main 파일은 분리해서 사용.
	int radius;
	String name;

	// 생성자 생략가능 ()안이 비어있어서.
	Circle() {//기본생성자 만약에 본인이 만들어낸 생성자가 있을 경우 기본 생성자도 나타내줘야함.
	} // 생성자

	Circle(String name, int radius){
			this.name = name;//this 는 새로운 생성자의 사용 시점을 기준 
			this.radius = radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;

//		}

	}
}
