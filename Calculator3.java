package execises;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator3 implements ActionListener{

JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sub,add,multi,div,rem,equ,clr;
JTextField t;
JLabel l;
Double result,a,b;
int op ;

Calculator3(){
JFrame f = new JFrame("Calcualtor");
f.setSize(340,370);
JPanel p = new JPanel();
l = new JLabel("CALCUALTOR");
l.setBounds(115,30,162,50);
p.add(l);

t = new JTextField();
t.setBounds(50,65,162,30);
p.add(t);


b0 = new JButton("0");
b0.addActionListener(this);
b0.setBounds(105,205,50,30);
p.add(b0);

b1 = new JButton("1");
b1.addActionListener(this);
b1.setBounds(50,100,50,30);
p.add(b1);

b2 = new JButton("2");
b2.addActionListener(this);
b2.setBounds(105,100,50,30);
p.add(b2);

b3 = new JButton("3");
b3.addActionListener(this);
b3.setBounds(160,100,50,30);
p.add(b3);

b4 = new JButton("4");
b4.addActionListener(this);
b4.setBounds(50,135,50,30);
p.add(b4);

b5 = new JButton("5");
b5.addActionListener(this);
b5.setBounds(105,135,50,30);
p.add(b5);

b6 = new JButton("6");
b6.addActionListener(this);
b6.setBounds(160,135,50,30);
p.add(b6);

b7 = new JButton("7");
b7.addActionListener(this);
b7.setBounds(50,170,50,30);
p.add(b7);

b8 = new JButton("8");
b8.addActionListener(this);
b8.setBounds(105,170,50,30);
p.add(b8);

b9 = new JButton("9");
b9.addActionListener(this);
b9.setBounds(160,170,50,30);
p.add(b9);

sub = new JButton("-");
sub.addActionListener(this);
sub.setBounds(215,135,50,30);
p.add(sub);


add = new JButton("+");
add.addActionListener(this);
add.setBounds(215,100,50,30);
p.add(add);

multi = new JButton("*");
multi.addActionListener(this);
multi.setBounds(215,170,50,30);
p.add(multi);

div = new JButton("/");
div.addActionListener(this);
div.setBounds(50,205,50,30);
p.add(div);

clr = new JButton("C");
clr.addActionListener(this);
clr.setBounds(215,205,50,30);
p.add(clr);

rem = new JButton("%");
rem.addActionListener(this);
rem.setBounds(160,205,50,30);
p.add(rem);

equ = new JButton("=");
equ.addActionListener(this);
equ.setBounds(215,65,50,30);
p.add(equ);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.setLayout(null);
f.setContentPane(p);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
t.setText(t.getText().concat("1"));
}
if(e.getSource()==b2){
t.setText(t.getText().concat("2"));
}
if(e.getSource()==b3){
t.setText(t.getText().concat("3"));
}
if(e.getSource()==b4){
t.setText(t.getText().concat("4"));
}
if(e.getSource()==b5){
t.setText(t.getText().concat("5"));
}
if(e.getSource()==b6){
t.setText(t.getText().concat("6"));
}
if(e.getSource()==b7){
t.setText(t.getText().concat("7"));
}
if(e.getSource()==b8){
t.setText(t.getText().concat("8"));
}
if(e.getSource()==b9){
t.setText(t.getText().concat("9"));
}
if(e.getSource()==add){
a = Double.parseDouble(t.getText());
op = 1;
t.setText("");
}
if(e.getSource()==sub){
a = Double.parseDouble(t.getText());
op=2;
t.setText("");
}
if(e.getSource()==multi){
a = Double.parseDouble(t.getText());
op=3;
t.setText("");
}
if(e.getSource()==div){
a = Double.parseDouble(t.getText());
op= 4;
t.setText("");
}
if(e.getSource()==rem){
a = Double.parseDouble(t.getText());
op =5;
t.setText("");
}
if(e.getSource()==equ){
b = Double.parseDouble(t.getText());
t.setText("");
switch(op){
case 1: result = a+b;
break;
case 2: result = a-b;
break;
case 3: result = a*b;
break;
case 4: result = a/b;
break;
case 5: result = a%b;
break;
default: System.out.println("/ by 0");
}
t.setText(""+result);
}
if(e.getSource()==clr){
t.setText("");
}

}

public static void main(String[] args){
Calculator calculator=new Calculator();
}
}


