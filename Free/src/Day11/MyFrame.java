package Day11;

import javax.swing.JFrame;

public class MyFrame extends JFrame { // 상속
	MyFrame() {
		setTitle("Hello GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임에서 x 키를 눌렀을 때 프로그램이 종료되도록 하는 기본 값.
		
		setSize(300, 300);
		setVisible(true);// 화면을 닫아도 true 에서 false 로 변경됨.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();// 객체를 만들어줘야 생성자가 실행됨.
	}

}
