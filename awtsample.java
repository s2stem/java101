package JavaCourse;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class awtsample {
	static GraphicsConfiguration gc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame(gc);
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");
		JButton b6 = new JButton("B6");
		JButton b7 = new JButton("B7");
		JButton b8 = new JButton("B8");
		JButton b9 = new JButton("B9");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.setLayout(new GridLayout(3,3));
		frame.setTitle("My First Frame");
		frame.setSize(600, 600);
		frame.setVisible(true);
	
	}

}
