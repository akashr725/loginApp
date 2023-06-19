package GUI_Forms;

import java.awt.*;

import javax.swing.*;

import Listener.RegisterListener;

public class RegisterForm {
	
	public JFrame jf;
	public JButton register,cancle;
	public JTextField firstName,lastName,email,number,passwrd,cpassword;
	public JLabel label1,label2,label3,label4,label5,label6;
	
	public RegisterForm() {
		
		jf=new JFrame();
		jf.setSize(400,700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		register=new JButton("Resigter");
		cancle=new JButton("Cancle");
		firstName=new JTextField(10);
		lastName=new JTextField(10);
		email=new JTextField(10);
		number=new JTextField(10);
		passwrd=new JTextField(10);
		cpassword=new JTextField(10);
		label1=new JLabel("First Name");
		label2=new JLabel("Password");
		label3=new JLabel("Lirst Name");
		label4=new JLabel("Email");
		label5=new JLabel("Confirm Password");
		label6=new JLabel("Phone Number");
		jf.setLayout(new FlowLayout());
		jf.add(label1);
		jf.add(firstName);
		jf.add(label2);
		jf.add(lastName);
		jf.add(label3);
		jf.add(email);
		jf.add(label4);
		jf.add(number);
		jf.add(label5);
		jf.add(passwrd);
		jf.add(label6);
		jf.add(cpassword);
		jf.add(register);
		jf.add(cancle);
		RegisterListener lg=new RegisterListener(this);
		register.addActionListener(lg);
		cancle.addActionListener(lg);
		
		
		
	}

}
