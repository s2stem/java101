package JavaCourse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tic_tac_toe implements ActionListener {
	
	static JPanel panel; 
	static JFrame f; static JButton b, b1, b2, b3, b4, b5, b6, b7, b8, b9; static JLabel lbl; 
	static JDialog d; static JMenu menu;
	static JMenuItem i1, i2, i3;
	static JMenuBar mb = new JMenuBar();
	String currturn = "X";
	int player_turn = 1;
	int total_moves = 0; 
	boolean somebodywon = false;
	
	char[][] ttt = new char[3][3];
	
	public tic_tac_toe() {
		menu = new JMenu("Menu");
		i1 = new JMenuItem("Player 1 Vs Player 2");
		i2 = new JMenuItem("Player 1 Vs Computer");
		i3 = new JMenuItem("Quit");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		mb.add(menu);
		
//		JPanel p2 = new JPanel();
		b = new JButton ("OK");  
		f = new JFrame("tic-tac-toe");		
		d = new JDialog(f, "You Won !!!", true);
        d.add( new JLabel ("Click button to continue."));  
        d.add(b);   
//        d.setSize(300,300); 
		f.setSize(600,600);
		f.setLayout(new GridLayout(2,1));
		f.setJMenuBar(mb);
		panel = new JPanel();
		
//		panel.setLayout(new GridLayout(3,3));
		panel.setBackground(Color.ORANGE);
		GridLayout layout = new GridLayout(3, 3);
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);
		
		lbl = new JLabel("Ready Start...");
	
		b1=new JButton();
		b1.setForeground(Color.GREEN);
		b1.setBackground(Color.BLUE);
		b2=new JButton(); 
		b3=new JButton();  
		b4=new JButton();  
		b5=new JButton();  
		b6=new JButton();  
		b7=new JButton();  
		b8=new JButton();  	
		b9=new JButton(); 
		
		panel.add(b1); 
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
//		panel.add(lbl); 
//		panel.add(p2);
		f.add(panel);
		f.add(lbl);
		f.setVisible(true); 
	
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(i1))
			System.out.println("Menu Item 1 chosen");
		if (player_turn == 1)
			currturn = "X";
		else if (player_turn == 2)
			currturn = "O";
		if (e.getSource().equals(b1))
		{
			b1.setText(currturn);
			updateArray(currturn, 1);
		}
		else if (e.getSource().equals(b2))
		{
			b2.setText(currturn);
			updateArray(currturn, 2);
		}
		else if (e.getSource().equals(b3))
			{
			b3.setText(currturn);
			updateArray(currturn, 3);
			}
		else if (e.getSource().equals(b4))
			{
			b4.setText(currturn);
			updateArray(currturn, 4);
			}
		else if (e.getSource().equals(b5))
		{
		b5.setText(currturn);
		updateArray(currturn, 5);
		}
		else if (e.getSource().equals(b6))
		{
			b6.setText(currturn);
			updateArray(currturn, 6);
		}
		else if (e.getSource().equals(b7))
		{	
			b7.setText(currturn);
			updateArray(currturn, 7);
		}
		else if (e.getSource().equals(b8))
			{
			b8.setText(currturn);
			updateArray(currturn, 8);
			}
		else if (e.getSource().equals(b9))
			{
			b9.setText(currturn);
			updateArray(currturn, 9);
			}
		if (player_turn == 1)
			player_turn = 2; 
		else if (player_turn == 2)
			player_turn = 1; 
		
		total_moves++; 
		if (total_moves >= 5)
		{
			somebodywon = false;
			somebodywon = checkforwin(currturn.charAt(0));
		}
		if (somebodywon)
		{
			d.setVisible(true);
			System.out.println("somebody won");
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		tic_tac_toe listener = new tic_tac_toe(); 
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);
		// Add Menu Items to the Listener
		i1.addActionListener(listener);
		i2.addActionListener(listener);
		i3.addActionListener(listener);
	}
	public void updateArray (String c, int i) {
		switch(i) {
		case 1: ttt[0][0] = c.charAt(0); break;
		case 2: ttt[0][1] = c.charAt(0); break;
		case 3: ttt[0][2] = c.charAt(0); break;
		case 4: ttt[1][0] = c.charAt(0); break;
		case 5: ttt[1][1] = c.charAt(0); break;
		case 6: ttt[1][2] = c.charAt(0); break;
		case 7: ttt[2][0] = c.charAt(0); break;
		case 8: ttt[2][1] = c.charAt(0); break;
		case 9: ttt[2][2] = c.charAt(0); break;
		}
	}
	public boolean checkforwin(char c) {
	
		System.out.println("Checkin for: "+c);
		// Check for Column Win
		boolean win = false;

		for (int i=0;i<=2; i++)
		{
			if ( ttt[0][i] == c && ttt[1][i] == c && ttt[2][i] == c)
			{
				System.out.println("Column Win");
				win = true;
			}
		/*	if ( ttt[0][i] == 'O' && ttt[1][i] == 'O' && ttt[2][i] == 'O')
				win2 = true;*/
		}
		for (int i=0;i<3; i++)
		{
		if ( ttt[i][0] == c && ttt[i][1] == c && ttt[i][2] == c)
		{
			System.out.println("Row Win");
			win = true;
		}
		/*if ( ttt[i][0] == 'O' && ttt[i][1] == 'O' && ttt[i][2] == 'O')
			win2 = true;*/
		}

		if (  (ttt[0][0] == c && ttt[1][1] == c && ttt[2][2] == c ) ||
			  (ttt[0][2] == c && ttt[1][1] == c && ttt[2][0] == c ) ) 
		{
			System.out.println("Diagnol Win");
			win=true;
		}

	/*	if (  (ttt[0][0] == 'O' && ttt[1][1] == 'O' && ttt[2][2] == 'O') ||
				  (ttt[0][2] == 'O' && ttt[1][1] == 'O' && ttt[2][0] == 'O') ) 
				win2=true;		*/
		
		return(win);

	}
}





