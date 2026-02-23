package Day16;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame {
	Container c;
	Random ran = new Random();
	ArrayList<Integer> list = new ArrayList<>();
	int num = 1;
	long startTime;

	public Quiz2() {
		// TODO Auto-generated constructor stub
		setTitle("첫번째 화면!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new GridLayout(5, 5, 5, 5));

		createBtn();
		setSize(600, 600);
		setVisible(true);
	}

	void createBtn() {
		for (int i = 1; i <= 25; i++) {
			int ranNum = ran.nextInt(25) + 1;
			if (list.contains(ranNum)) {
				i--;
				continue;
			}
			list.add(ranNum);
			JButton btn = new JButton(ranNum + "");
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton removeBtn = (JButton) e.getSource();
					if (removeBtn.getText().equals(num + "")) {
						if (num == 1) {
							startTime = System.currentTimeMillis();
						}
						c.remove(removeBtn);
						c.repaint();
						num++;
						if (num == 26) {
							long lastTime = System.currentTimeMillis();
							System.out.println((lastTime - startTime) / 1000.0);
							list.clear(); // list 객체가 이미 채워져있어서 비워줘야함.
							createBtn();
							c.revalidate();
							c.repaint();
							num = 1;
						}
					}
				}
			});
			c.add(btn);
		}
	}

//	void createBtn() {
//		for (int i = 1; i <= 25; i++) {
//			JButton btn = new JButton(i + "");
//			btn.setSize(50, 50);
//			btn.setLayout(new GridLayout(5, 5));
//			btn.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					JButton selectBtn = (JButton) e.getSource();
//					Integer.parseInt(selectBtn.getText()); // 숫자를 문자로
//					Integer.toString(num); // 문자를 숫자로
//					String removeNum = num + "";
//					if (selectBtn.getText().equals(removeNum)) {
//						if (num == 1) {
//							startTime = System.currentTimeMillis();
//							System.out.println(startTime);
//						}
//						c.remove(selectBtn);
//						c.repaint(); // 없어지는 과정이 단순히 없어지는 것이 아니라 화면을 다시 그려주는 것(새로고침)
//						num++;
//						if (num == 26) {
//							long lastTime = System.currentTimeMillis();
//							System.out.println((lastTime - startTime) / 1000.0);
//							createBtn();
//							num = 1;
//						}
//					}
//
//				}
//			});
//
//			c.add(btn);
//		}
//		
//		int width = c.getWidth();
//		int height = c.getHeight();
//		for (int i = 1; i <= 10; i++) {
//			JButton btn = new JButton(i + "");
//			btn.setLocation(ran.nextInt(width - 50), ran.nextInt(height - 50));
//			btn.setSize(50, 50);
//			c.add(btn);
//		}
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz2();
	}

}
