package GUI_Forms;

import java.awt.*;

import javax.swing.*;

import Listener.LoginListener;

public class LoginForm {
	public JFrame jf;
	public JTextField text1,text2;
	public JButton cancle,login,user;
	public JLabel label1,label2;
	
	public LoginForm() {
		jf=new JFrame("Login");
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		login=new JButton("Login");
		cancle=new JButton("Cancle");
		user = new JButton("Click here for new user");
		text1=new JTextField(10);
		text2=new JTextField(10);
		label1=new JLabel("Enter the user name:");
		label2=new JLabel("Enter your password:");
		jf.setLayout(new FlowLayout());
		jf.add(label1);
		jf.add(text1);
		jf.add(label2);
		jf.add(text2);
		jf.add(login);
		jf.add(cancle);
		jf.add(user);
		LoginListener l = new LoginListener(this);
		login.addActionListener(l);
		cancle.addActionListener(l);
		user.addActionListener(l);
		
		jf.setSize(300,300);
		jf.setVisible(true);
		
		
	}


}
