package Day11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 보통 이 사이에 코드를 작성.
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));// 배치 관리자.버튼 순서 지정 이거부터 위에는 필수.
//		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));// 첫 번째가 숫자가 좌우(수평), 두 번째가 상하(수직)
		// FlowLayout 은 상단의 왼쪽부터

		c.setBackground(Color.BLACK);

		JButton btn1 = new JButton("로그인");
		c.add(btn1);
		c.add(new JButton("오라클?ㅎㅎ"));
		c.add(new JButton("자바 꿀잼"));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
