package Listener;

import java.awt.event.*;

import GUI_Forms.LoginForm;
import GUI_Forms.RegisterForm;
import beans.LoginBean;
import dao.LoginDao;

public class LoginListener implements ActionListener{
	LoginForm loginForm;

	public LoginListener(LoginForm loginForm) {
		// TODO Auto-generated constructor stub
		this.loginForm=loginForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginForm.login) {
			
			String name=loginForm.text1.getText();
			String pass=loginForm.text1.getText();
			LoginBean lgb=new LoginBean(name,pass);
			LoginDao ld=new LoginDao();
			ld.useLogin(lgb);
			
		}
        else if(e.getSource()==loginForm.user) {
        	
        	RegisterForm rb=new RegisterForm();
			
			
		}
		else if(e.getSource()==loginForm.cancle) {
			
			
		}
	
		
	}

}
