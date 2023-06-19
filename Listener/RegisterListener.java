package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import GUI_Forms.RegisterForm;
import beans.RegisterBean;
import dao.RegisterDao;

public class RegisterListener implements ActionListener {
	RegisterForm registerForm;

	public RegisterListener(RegisterForm registerForm) {
		
		this.registerForm=registerForm;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==registerForm.register) {
			String name=registerForm.firstName.getText();
			String pass=registerForm.lastName.getText();
			String email=registerForm.email.getText();
			String mnumber=registerForm.number.getText();
			String lname=registerForm.passwrd.getText();
			String cpass=registerForm.cpassword.getText();
			if(name.equals("")||pass.equals("")||email.equals("")||mnumber.equals("")||lname.equals("")||cpass.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please Fill all Fields..");
			}
			else {
				RegisterBean rb=new RegisterBean();
				rb.setName(name);
				rb.setPass(pass);
				rb.setLname(email);
				rb.setEmail(mnumber);
				rb.setCpass(lname);
				rb.setMnumber(cpass);
				
				RegisterDao rgd=new RegisterDao();
				String msg=rgd.registerLogin(rb);
				
				if(msg.equals("Success")) {
					JOptionPane.showMessageDialog(null, "Successfully Registered");
				}
				else {
					JOptionPane.showMessageDialog(null, "Something is Wrong");
				}
			}
			
		}
		else if(e.getSource()==registerForm.cancle) {
			
			registerForm.cpassword.setText("");
			registerForm.firstName.setText("");
			registerForm.lastName.setText("");
			registerForm.email.setText("");
			registerForm.number.setText("");
			registerForm.passwrd.setText("");
			
		}
		
		
	}

}
