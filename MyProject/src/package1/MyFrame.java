package package1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	MyFrame(){
		
	this.setTitle("MY APP");
	this.setSize(420,420);
	this.setVisible(true);
	ImageIcon image = new ImageIcon("logo.png");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground(Color.white);

	
	}

}
