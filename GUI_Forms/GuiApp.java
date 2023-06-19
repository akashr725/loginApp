package GUI_Forms;

import java.awt.*;

import javax.swing.*;

import Listener.GuiListener;

public class GuiApp {
	
	public JFrame jf;
	public JButton add,update,delete,select;
	public GuiApp() {
		
		jf=new JFrame("MainGui");
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add=new JButton("Login");
		update=new JButton("Update");
		delete=new JButton("Delete");
		select=new JButton("Select");
		jf.setLayout(new FlowLayout());
		jf.add(add);
		jf.add(update);
		jf.add(delete);
		jf.add(select);
		
		GuiListener gl =new GuiListener(this);
		add.addActionListener(gl);
		update.addActionListener(gl);
		delete.addActionListener(gl);
		select.addActionListener(gl);
		jf.setSize(800,600);
		jf.setLocation(200, 200);
		jf.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		
		new GuiApp();
		

	}

}
