package JavaCourse;
// Ananya Gupta's TTT Project

import java.util.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe implements ActionListener {
	
	static JPanel panel;
	static JFrame f; static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9; static JLabel lbl; static JDialog d1, d2, d3; 
	String currturn = "X"; char play_mode = 'p'; static JMenuBar m; static JMenu x, x1; static JMenuItem m1, m2, m3, m4; static JLabel men; 
	int player_turn = 1;
	int total_moves = 0; 
	boolean somebodywon = false;
	boolean button1 = false;
	boolean button2 = false;
	boolean button3 = false;
	boolean button4 = false;
	boolean button5 = false;
	boolean button6 = false;
	boolean button7 = false;
	boolean button8 = false;
	boolean button9 = false; 
	
	
	char[][] ttt = new char[3][3];
	
	public TicTacToe() {
		
		JPanel p2 = new JPanel();
		
		f = new JFrame("tic-tac-toe");		
		f.setSize(500,500); 
		panel = new JPanel();
		panel.setSize(400,400); 
		f.getContentPane().add(panel);
		f.setVisible(true);
		
		p2.setBackground(Color.darkGray);
		p2.setSize(400, 100);
		p2.setBounds(100, 100, 300, 300);
		GridLayout layout = new GridLayout(0, 3);
		layout.setHgap(10);
		layout.setVgap(10);
		p2.setLayout(layout);
		
		m = new JMenuBar(); 
			//m.setSize(); 
			//m.setVisible(true);
		x = new JMenu("Tic Tac Toe"); 
			// x.setSize(100,100);
			// x.setVisible(true);
		m1 = new JMenuItem("Player v. Player Mode"); 
			// m1.setSize(100,100); 
			// m1.setVisible(true);
		m2 = new JMenuItem("Player v. Computer Mode"); 
			// m2.setSize(100,100);
			// m2.setVisible(true); 
		m3 = new JMenuItem("Help"); 
			// m3.setSize(100,100); 
			// m3.setVisible(true); 
		m4 = new JMenuItem("Clear"); 
		
		x.add(m1); 
		x.add(m2); 
		x.add(m3); 
		x.add(m4); 
		m.add(x); 
		f.setJMenuBar(m);
		
		b1=new JButton(" "); 
		b1.setBounds(30, 100, 100, 40);
		b2=new JButton(" "); 
		b3=new JButton(" ");  
		b4=new JButton(" ");  
		b5=new JButton(" ");  
		b6=new JButton(" ");  
		b7=new JButton(" ");  
		b9=new JButton(" "); 
		
		lbl = new JLabel("Play Mode: Player"); 
		
		p2.add(b1); 
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b9);
		b8=new JButton(" ");  	
		p2.add(b8);
		p2.add(lbl); 
		panel.add(p2);
		f.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e){
		
			if (e.getSource().equals(b1) && button1 == false)
		{
				System.out.println("Button1 Clicked: "+currturn);
			b1.setText(currturn); 
			updateArray(currturn, 1);
			total_moves++;
			//b1.setEnabled(false);
		}
		else if (e.getSource().equals(b2) && button2 == false)
		{
			b2.setText(currturn);
			updateArray(currturn, 2);
			total_moves++;
		}
		else if (e.getSource().equals(b3) && button3 == false)
			{
			b3.setText(currturn);
			updateArray(currturn, 3);
			total_moves++;
			}
		else if (e.getSource().equals(b4) && button4 == false)
			{
			b4.setText(currturn);
			updateArray(currturn, 4);
			total_moves++;
			}
		else if (e.getSource().equals(b5) && button5 == false)
		{
		b5.setText(currturn);
		updateArray(currturn, 5);
		total_moves++;
		}
		else if (e.getSource().equals(b6) && button6 == false)
		{
			b6.setText(currturn);
			updateArray(currturn, 6);
			total_moves++;
		}
		else if (e.getSource().equals(b7) && button7 == false)
		{	
			b7.setText(currturn);
			updateArray(currturn, 7);
			total_moves++;
		}
		else if (e.getSource().equals(b8) && button8 == false)
			{
			b8.setText(currturn);
			updateArray(currturn, 8);
			total_moves++;
			}
		else if (e.getSource().equals(b9) && button9 == false)
			{
			b9.setText(currturn);
			updateArray(currturn, 9);
			total_moves++;
			}
		else if (e.getSource().equals(m1)) {
			//player v. player 
			clear_game(); 
			play_mode = 'p'; 
			lbl.setText("Play Mode: Player");
		}
			
		else if (e.getSource().equals(m2)) {
			//computer v. player 
			System.out.println("P v. C"); 
			clear_game(); 
			play_mode = 'c'; 
			lbl.setText("Play Mode: Computer");
			
		}
		else if (e.getSource().equals(m4)) {
			//clearing 
			clear_game();
			return;
		}
			
			

		if(play_mode == 'c' && ! e.getSource().equals(m2)) {
			
			if (total_moves >= 3)
			{
				System.out.println("Total Moves > 3 Checking for win");
				somebodywon = checkforwin('O');
				if (somebodywon) { 
					d1 = new JDialog(); 
					d1 = new JDialog(f, "Computer Won!", true); 
					d1.setSize(300, 300);
					d1.setVisible(true);
					clear_game();
					return;
				}
				
				somebodywon = checkforwin('X');
			
				if (somebodywon) { 
				d2 = new JDialog(); 
				d2 = new JDialog(f, "Player 1 Won!", true); 
				d2.setSize(300, 300);
				d2.setVisible(true);
				clear_game();
				return;
				}
			}
			if (total_moves == 9 && somebodywon == false) {
				d3 = new JDialog(); 
				d3 = new JDialog(f, "Tie", true); 
				d3.setSize(300, 300);
				d3.setVisible(true);
				clear_game();
				return;
			}
		
			if (total_moves < 9 && !somebodywon) {
				compMove();
				total_moves++;
				somebodywon = checkforwin('O');
				if (somebodywon) { 
					d1 = new JDialog(); 
					d1 = new JDialog(f, "Computer Won!", true); 
					d1.setSize(300, 300);
					d1.setVisible(true);
					clear_game();
					return;
				}

			}
			
			
		}
		
	if (play_mode == 'p') {
		if (total_moves >= 5) {
			if ( currturn.charAt(0) == 'X' )
				somebodywon = checkforwin('O');
			else
				somebodywon = checkforwin('X');
		}
		if (somebodywon && currturn.charAt(0) == 'X') { 
			d2 = new JDialog(); 
			d2 = new JDialog(f, "Player 2 Won!", true); 
			d2.setSize(300, 300);
			d2.setVisible(true);
			clear_game();
		}
		if (somebodywon && currturn.charAt(0) == 'O') { 
			d3 = new JDialog(); 
			d3 = new JDialog(f, "Player 1 Won!", true); 
			d3.setSize(300, 300);
			d3.setVisible(true);
			clear_game(); 
			}
		if (total_moves == 9 && somebodywon == false) {
			d1 = new JDialog(); 
			d1 = new JDialog(f, "Tie!", true); 
			d1.setSize(300, 300);
			d1.setVisible(true);
			clear_game(); 
		}
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		TicTacToe listener = new TicTacToe(); 
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);
		m1.addActionListener(listener); 
		m2.addActionListener(listener); 
		m3.addActionListener(listener); 
		m4.addActionListener(listener); 
	}
	public void compMove()
	{
		Random gen = new Random(); 
		int num1; 
		boolean squarefilled = false; 
		System.out.println("Computer Move"); 
		do{
			num1 = gen.nextInt(9); 
			num1++;
			System.out.println("Button chosen is "+num1);
			switch (num1) {
			case 1: 
				if (ttt[0][0] == 'O')
				{ 
				ttt[0][0] = 'O'; 
				b1.setText("O"); 
				squarefilled = true; 
				}
		        break;
			case 2: 
				if (ttt[0][1] == ' ')
				{ 
				ttt[0][1] = 'O';
				b2.setText("O"); 
				squarefilled = true; 
				}
		        break;
			case 3: 
				if (ttt[0][2] == ' ')
				{ 
				ttt[0][2] = 'O'; 
				b3.setText("O");
				squarefilled = true; 
				}
		        break;
			case 4: 
				if (ttt[1][0] == ' ')
				{ 
				ttt[1][0] = 'O'; 
				b4.setText("O");
				squarefilled = true; 
				}
		        break;
			case 5: 
				if (ttt[1][1] == ' ')
				{ 
				ttt[1][1] = 'O'; 
				b5.setText("O");
				squarefilled = true; 
				}
		        break;
		    case 6: 
				if (ttt[1][2] == ' ')
				{ 
				ttt[1][2] = 'O'; 
				b6.setText("O");
				squarefilled = true; 
				}
			    break;
		    case 7: 
				if (ttt[2][0] == ' ')
				{ 
				ttt[2][0] = 'O'; 
				b7.setText("O");
				squarefilled = true; 
				}
		        break;
		    case 8: 
				if (ttt[2][1] == ' ')
				{ 
				ttt[2][1] = 'O'; 
				b8.setText("O");
				squarefilled = true; 
				}
		        break;
		    case 9: 
				if (ttt[2][2] == ' ')
				{ 
				ttt[2][2] = 'O'; 
				b9.setText("O");
				squarefilled = true; 
				}
		        break; 
		}
		} while(squarefilled == false);
		System.out.println("Coming out of Comp Move");
	}
	public void updateArray (String c, int i) {
		switch(i) {
		case 1: ttt[0][0] = c.charAt(0);
		button1 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break; 
		case 2: ttt[0][1] = c.charAt(0); 
		button2 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		case 3: ttt[0][2] = c.charAt(0); 
		button3 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O";
		}
		break;
		case 4: ttt[1][0] = c.charAt(0);
		button4 = true; 
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O";
		}
		break;
		case 5: ttt[1][1] = c.charAt(0); 
		button5 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		case 6: ttt[1][2] = c.charAt(0);
		button6 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		case 7: ttt[2][0] = c.charAt(0); 
		button7 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		case 8: ttt[2][1] = c.charAt(0); 
		button8 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		case 9: ttt[2][2] = c.charAt(0);
		button9 = true;
		if (play_mode == 'p') {
			if (currturn == "O")
				currturn = "X";
			else if (currturn == "X")
				currturn = "O"; 
		}
		break;
		}
	}
	public boolean checkforwin(char c) {
	
		boolean win = false;

		for (int i=0;i<=2; i++)
		{
			if ( ttt[0][i] == c && ttt[1][i] == c && ttt[2][i] == c)
				win = true;
		}
		for (int i=0;i<3; i++)
		{
		if ( ttt[i][0] == c && ttt[i][1] == c && ttt[i][2] == c)
			win = true;
				}
		if (  (ttt[0][0] == c && ttt[1][1] == c && ttt[2][2] == c ) ||
			  (ttt[0][2] == c && ttt[1][1] == c && ttt[2][0] == c ) ) 
			win=true;
		
		return(win);

	}
	
	public void clear_game() { 
		for (int i=0; i<3; i++)
		{ 
			for (int j=0; j<3; j++)
			{
				ttt[i][j] = ' ';  
			}
		}
		
		button1 = false; 
		button2 = false; 
		button3 = false; 
		button4 = false; 
		button5 = false; 
		button6 = false; 
		button7 = false; 
		button8 = false; 
		button9 = false; 
		
		b1.setText(" ");
		b2.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" "); 
		
		b1.setEnabled(true); 
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		
		currturn = "X"; 
		
		total_moves = 0; 
		somebodywon = false;
	}
}


