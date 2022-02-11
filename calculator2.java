package execises;


import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator2 extends JFrame implements
ActionListener {
JButton one, two, three, four, five, six, seven, eight,
nine, Zero, add, sub, div, mult, re, cel;
JTextField textField;
String s = "", ope = "";
int flag = 0;
double total1;
double input1, input2;
void total(double input1, double inout2, String ope) {
String total;
if (ope.equalsIgnoreCase("+")) {
total1 = input1 + input2;
total = Double.toString(total1);
textField.setText(total);
} else if (ope.equalsIgnoreCase("-")) {
total1 = input1 - input2;
total = Double.toString(total1);
textField.setText(total);
} else if (ope.equalsIgnoreCase("*")) {
total1 = input1 * input2;
total = Double.toString(total1);
textField.setText(total);
} else if (ope.equalsIgnoreCase("/")) {
total1 = input1 / input2;
total = Double.toString(total1);
textField.setText(total);
}

}
calculator2() {

JFrame f= new JFrame("Caculator");
JPanel p = new JPanel( );
p.setLayout(null);
f.setContentPane(p);
f.setVisible(true);
f.setSize(400,400);
f.setVisible(true);
p.setVisible(true);
add = new JButton("+");
add.setSize(50,50);
sub = new JButton("-");
Zero = new JButton("0");
one = new JButton("1");
two = new JButton("2");
three = new JButton("3");
four = new JButton("4");
five = new JButton("5");
six = new JButton("6");
seven = new JButton("7");
eight = new JButton("8");
nine = new JButton("9");
mult = new JButton("*");
div = new JButton("/");
re = new JButton("=");
cel = new JButton("Clear");
textField = new JTextField("");
//Adding
p.add( textField);
textField.setBounds(100,100,200,20);
p.add(one);
one.setBounds(100,140,50,40);
p.add(two);
two.setBounds(150,140,50,40);
p.add(three);
three.setBounds(200,140,50,40);
p.add(add);
add.setBounds(250,140,50,40);
p.add(four);
four.setBounds(100,180,50,40);
p.add(five);
five.setBounds(150,180,50,40);
p.add(six);
six.setBounds(200,180,50,40);
p.add(sub);
sub.setBounds(250,180,50,40);
p.add(seven);
seven.setBounds(100,220,50,40);
p.add(eight);
eight.setBounds(150,220,50,40);
p.add(nine);
nine.setBounds(200,220,50,40);
p.add(mult);
mult.setBounds(250,220,50,40);
p.add(Zero);
Zero.setBounds(100,260,50,40);
p.add(cel);
cel.setBounds(150,260,50,40);
p.add(re);
re.setBounds(200,260,50,40);
p.add(div);
div.setBounds(250,260,50,40);

// listener
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
five.addActionListener(this);
six.addActionListener(this);
seven.addActionListener(this);
eight.addActionListener(this);
nine.addActionListener(this);
Zero.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);
mult.addActionListener(this);
div.addActionListener(this);
re.addActionListener(this);
cel.addActionListener(this);

}
public void actionPerformed(ActionEvent e) {
Object o = e.getSource();
if (o == one) {
textField.setText(s.concat("1"));
s = textField.getText();
} else if (o == two) {
textField.setText(s.concat("2"));
s = textField.getText();
} else if (o == three) {
textField.setText(s.concat("3"));
s = textField.getText();
} else if (o == four) {
textField.setText(s.concat("4"));
s = textField.getText();
} else if (o == five) {
textField.setText(s.concat("5"));
s = textField.getText();
} else if (o == six) {
textField.setText(s.concat("6"));
s = textField.getText();
} else if (o == seven) {
textField.setText(s.concat("7"));
s = textField.getText();
} else if (o == eight) {
textField.setText(s.concat("8"));
s = textField.getText();
} else if (o == nine) {
textField.setText(s.concat("9"));
s = textField.getText();
} else if (o == Zero) {
textField.setText(s.concat("0"));
s = textField.getText();
} else if (o == add) {
textField.setText("");
input1 = Double.parseDouble(s);
System.out.println(input1);
s = "";
ope = "+";
} else if (o == sub) {
textField.setText("");
input1 = Double.parseDouble(s);
s = "";
ope = "-";
} else if (o == mult) {
textField.setText("");
input1 = Double.parseDouble(s);
s = "";
ope = "*";
} else if (o == div) {
textField.setText("");
input1 = Double.parseDouble(s);
s = "";
ope = "/";
} else if (o == re) {
if (flag == 0) {
input2 = Double.parseDouble(s);
total(input1, input2, ope);
flag = 1;
} else if (flag == 1) {
input2 = Double.parseDouble(s);
total(input1, input2, ope);
}
System.out.println(input1);
}
if (o == cel) {
textField.setText("");
s = textField.getText();
total1 = 0;
}
}
public static void main(String arg[]) {
new calculator2();

}
}

