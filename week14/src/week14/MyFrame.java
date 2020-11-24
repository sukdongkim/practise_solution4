package week14;

import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	MyFrame() {
		setSize(300,150);
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BusinessCard b = new BusinessCard();
		b.setBackground(Color.lightGray);
		add(b);
		setVisible(true);
	}

	class BusinessCard extends JPanel {
		private static final long serialVersionUID = 1L;
		ImageIcon icon = new ImageIcon("images/Koala.png");
		Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.setFont(new Font("����ü", Font.BOLD, 20));
			g.drawString("ȫ�浿", 150, 40);
			g.setColor(Color.blue);
			g.setFont(new Font("���ü", Font.BOLD, 15));
			g.drawString("ȣ�����б�", 150, 60);
			g.drawString("041-540-0001", 150, 80);
			g.drawImage(img, 20, 20, 80, 80, this);
		}
	}

	public static void main(String [] args) {
		new MyFrame();
	}
} 
