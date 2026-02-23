package Day16;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {
	int num = 1;
	Container c;
	Random ran = new Random();
	long startTime;

	public Quiz1() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);

		createBtn();

		setSize(600, 600);
		setVisible(true);

	}

	void createBtn() {
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "");
			btn.setLocation(ran.nextInt(500), ran.nextInt(500));
			btn.setSize(50, 50);

			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton selectBtn = (JButton) e.getSource();
//					Integer.parseInt(selectBtn.getText()); // 숫자를 문자로
//					Integer.toString(num); // 문자를 숫자로
					String removeNum = num + "";
					if (selectBtn.getText().equals(removeNum)) {
						if (num == 1) {
							startTime = System.currentTimeMillis();
							System.out.println(startTime);
						}
						c.remove(selectBtn);
						c.repaint(); // 없어지는 과정이 단순히 없어지는 것이 아니라 화면을 다시 그려주는 것(새로고침)
						num++;
						if (num == 11) {
							long lastTime = System.currentTimeMillis();
							System.out.println((lastTime - startTime) / 1000.0);
							createBtn();
							num = 1;
						}
					}

				}
			});

			c.add(btn);

		}
//		
//		int width = c.getWidth();
//		int height = c.getHeight();
//		for (int i = 1; i <= 10; i++) {
//			JButton btn = new JButton(i + "");
//			btn.setLocation(ran.nextInt(width - 50), ran.nextInt(height - 50));
//			btn.setSize(50, 50);
//			c.add(btn);
//		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1();
	}

}
