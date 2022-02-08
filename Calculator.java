/********************************************
 *  FILE        : Experiment 5
 *  DESCRIPTION : JAVA PROGRAM (ABSTRACT)  
 *  AUTHOR      : NAVEEN S PANANTHANAM
 *  VERSION     : 1
 *  DATE        : 6/2/22
 ********************************************/

import java.awt.*;
import java.awt.event.*;
 
public class Calculator extends Frame implements ActionListener{
	
	Button b0 =new Button("0");
	Button b1 =new Button("1");
	Button b2 =new Button("2");
	Button b3 =new Button("3");
	Button b4 =new Button("4");
	Button b5 =new Button("5");
	Button b6 =new Button("6");
	Button b7 =new Button("7");
	Button b8 =new Button("8");
	Button b9 =new Button("9");
	
	Button addi = new Button("+");
	Button subt = new Button("-");
	Button mult = new Button("");
	Button divi = new Button("/");
	Button clr =new Button("c");
	Button dot = new Button(".");
	Button equals = new Button("=");
	
	TextField result =new TextField();
	
	Calculator(){
		
		setTitle("calculator");
		setVisible(true);
		setSize(250,400);
		setLayout(null);
		
		result.setBounds(30,50,200,50);
		add(result);
		b0.setBounds(25,95,50,50);
		add(b0);
		b1.setBounds(75,95,50,50);
		add(b1);
		b2.setBounds(125,95,50,50);
		add(b2);
		b3.setBounds(175,95,50,50);
		add(b3);
		b4.setBounds(25,145,50,50);
		add(b4);
		b5.setBounds(75,145,50,50);
		add(b5);
	    b6.setBounds(125,145,50,50);
		add(b6);
		b7.setBounds(175,145,50,50);
		add(b7);
		b8.setBounds(25,195,50,50);
		add(b8);
		b9.setBounds(75,195,50,50);
		add(b9);
		addi.setBounds(125,195,50,50);
		add(addi);
		subt.setBounds(175,195,50,50);
		add(subt);
		mult.setBounds(25,245,50,50);
		add(mult);
		divi.setBounds(75,245,50,50);
		add(divi);
		clr.setBounds(125,245,50,50);
		add(clr);
		dot.setBounds(175,245,50,50);
		add(dot);
		equals.setBounds(100,295,50,50);
		add(equals);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		addi.addActionListener(this);
		subt.addActionListener(this);
		divi.addActionListener(this);
		mult.addActionListener(this);
		clr.addActionListener(this);
		dot.addActionListener(this);
		equals.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		new Calculator();

	}


	public void actionPerformed(ActionEvent e) {
		
		
	}

}
