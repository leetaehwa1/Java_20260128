package Day11;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 30)); // 간격을 조정하는 건 생성자에 값을 넣어주면 됨.

		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		JButton btn4 = new JButton("버튼 3");
		JButton btn5 = new JButton("버튼 3");

		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.EAST);
		c.add(btn3); // Center 값 생략(디폴트)

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
