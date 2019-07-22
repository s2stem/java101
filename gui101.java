package JavaCourse;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class gui101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JButton b = new JButton("Click Me");
		b.setBackground(Color.YELLOW);
		b.setBounds(130, 100, 100, 40);
		f.getContentPane().add(b);
		f.setSize(400, 500);
		f.getContentPane().setLayout(null);
		f.setVisible(true);
	}
}
