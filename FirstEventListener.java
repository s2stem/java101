package JavaCourse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstEventListener {
	JFrame f; 	JButton b; 	JLabel lbl1, lbl2; 
	JButton b00, b01, b02, b10, b11, b12, b20, b21, b22;
	public FirstEventListener() {
		
		//Create Container
		f=new JFrame();//creating instance of JFrame  
		f.setSize(490,399);//400 width and 500 height  
		f.getContentPane().setLayout(null); //using no layout managers  
		f.setVisible(true);//making the frame visible 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create UI Elements
        b00 =new JButton();//creating instance of JButton  
        b01 =new JButton();//creating instance of JButton  
        b02 =new JButton();//creating instance of JButton  
        b10 =new JButton("X");//creating instance of JButton  
        b11 =new JButton("X");//creating instance of JButton  
        b12 =new JButton("X");//creating instance of JButton  
        b20 =new JButton("X");//creating instance of JButton  
        b21 =new JButton("X");//creating instance of JButton  
        b22 =new JButton("X");//creating instance of JButton  
        
		b00.setBounds(130,100,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b00);//adding button in JFrame  
		b01.setBounds(180,100,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b01);
		b02.setBounds(230,100,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b02);

		b10.setBounds(130,150,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b10);//adding button in JFrame  
		b11.setBounds(180,150,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b11);
		b12.setBounds(230,150,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b12);

		b20.setBounds(130,200,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b20);//adding button in JFrame  
		b21.setBounds(180,200,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b21);
		b22.setBounds(230,200,50, 50);//x axis, y axis, width, height  	          
		f.getContentPane().add(b22);
		
		
		lbl1=new JLabel();  //create a label to display the message
	    lbl1.setBounds(140,50, 150,20); //x axis, y axis, width, height 
	    f.getContentPane().add(lbl1);//adding label in JFrame
	    lbl1.setText("Lets Play Tic Tac Toe");
		
		lbl2=new JLabel();  //create a label to display the message
	    lbl2.setBounds(140,70, 150,20); //x axis, y axis, width, height 
	    f.getContentPane().add(lbl2);//adding label in JFrame
	    lbl2.setText("Player 1 - Turn");
	    
	}
	
	public void showEventDemo(){
		 b00.addActionListener(new ButtonClickListener());
		 b01.addActionListener(new ButtonClickListener());
		 b02.addActionListener(new ButtonClickListener());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the UI as part of the constructor
		FirstEventListener eventDemo = new FirstEventListener();
		//CallEventHandler
		eventDemo.showEventDemo();
	}
	 //Create Listener Class
	 class ButtonClickListener implements ActionListener{  
		
		 public void actionPerformed(ActionEvent e){  
			 if ( e.getSource().equals(b00) ) 
			 {
		          lbl2.setText("You clicked Button B00");
			 }
		     else if ( e.getSource().equals(b01) )
				 lbl2.setText("You clicked Button B01");
			 else if ( e.getSource().equals(b02) )
				 lbl2.setText("You clicked Button B02");
			 		
		 }  
	 } 

}
