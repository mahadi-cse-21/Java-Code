package package1;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MyFrame jframe =new MyFrame();
		
		JFrame frame =new JFrame();
		frame.setTitle("MyApp");
		frame.setSize(420,420);
	
		ImageIcon image = new ImageIcon("logo.png");
		frame.setIconImage(image.getImage());
		JLabel label =new JLabel();
		label.setText("Who are you ?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman",Font.BOLD,20));
		label.setIconTextGap(-4);
		label.setBackground(Color.BLACK);
		
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.getContentPane().setBackground(Color.white);
		frame.setVisible(true);
		frame.add(label);
	}

}
