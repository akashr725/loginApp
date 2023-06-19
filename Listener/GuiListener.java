package Listener;

import java.awt.event.*;

import GUI_Forms.GuiApp;
import GUI_Forms.LoginForm;

public class GuiListener implements ActionListener{
	GuiApp gui;

	public GuiListener(GuiApp guiApp) {
		
		this.gui=guiApp;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o=e.getSource();
		if(o==gui.add) {
			
			LoginForm lf=new LoginForm();
			
		}
		else if(o==gui.update) {
			System.out.println("Update");
		}
        else if(o==gui.delete) {
        	System.out.println("delete");
		}
        else if(o==gui.select) {
        	System.out.println("select");
        }
		
		
	}

}
