import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends Frame implements ActionListener {
	Button button;
	TextField textField1 = new TextField(30);
	TextField textField2 = new TextField(30);
	TextField textField3 = new TextField(30);
	TextField textField4 = new TextField(30);
	
	SignUpForm(){
		
		setTitle("Sign up page");
		setSize(300,400);
		setVisible(true);
		setLayout(new FlowLayout());
		button=new Button("SUBMIT");
		add(textField1);
		add(textField2);
		add(textField3);
		add(textField4);
		
		add(button);
		textField1.setText("Name");
		textField2.setText("email");
		textField3.setText("Mob Number");
		textField4.setText("place");
		
		button.addActionListener(this);
		
		
	}

public void actionPerformed(ActionEvent e) {
		
		System.out.println("Name :"+textField1.getText());
		System.out.println(" email: "+textField2.getText());
		System.out.println("Mob Number  :-"+textField3.getText());
		System.out.println("place : "+textField4.getText());
		
		
	}

public static void main(String[] args) {
	new LoginPageDemo();
}
}