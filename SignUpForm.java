package swing;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;

public class SignUpForm extends Frame implements ActionListener{
    TextField textField1 =new TextField(20);
    TextField textField2 =new TextField(20);
    TextField textField3 =new TextField(20);
    TextField textField4 =new TextField(20);
    
    private Label name,userName,email,password;
    
    Button button;
    SignUpForm(){
        //Frame setting
        setTitle("Sign Up Here");
        setSize(380,250);
        setVisible(true);
        setLayout(new FlowLayout());
        //name
        name=new Label("Name        :");
        name.setBounds(50,80,100,50);
        add(name);
        add(textField1);
        //email
        email=new Label("Email       :");
        email.setBounds(50,100,100,50);
        add(email);
        add(textField2);
        //user name
        userName=new Label("User Name:");
        userName.setBounds(50,120,100,50);
        add(userName);
        add(textField3);
        //password
        password=new Label("Password :");
        password.setBounds(50,140,100,50);
        add(password);
        add(textField4);
        //button
        button=new Button("Sign Up");
        button.setBounds(150,160,60,30);
        add(button);    
        button.addActionListener(this);
  
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Name       :"+textField1.getText());
		System.out.println("Email ID   :"+textField2.getText());
		System.out.println("User Name  :"+textField3.getText());
		System.out.println("Password   : "+textField4.getText());
        
    }
    public static void main(String[] args){
        SignUpForm form =new SignUpForm();
    }
}