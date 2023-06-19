package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DataBaseConnector.ConnectionProvider;
import beans.LoginBean;
import beans.RegisterBean;

public class RegisterDao {
	
	public String registerLogin(RegisterBean rgb) {
		try {
			
			Connection c =ConnectionProvider.getConnection();
			PreparedStatement ps =c.prepareStatement("insert into userdata values(?,?,?,?,?,?)");
			ps.setString(1,rgb.getName());
			ps.setString(2,rgb.getPass());
			ps.setString(3,rgb.getLname());
			ps.setString(4,rgb.getEmail());
			ps.setString(5,rgb.getCpass());
			ps.setString(6,rgb.getMnumber());
			int i=ps.executeUpdate();
			if(i>0) {
				return "Success";
			}
			else {
				return "Fail";
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Fail";
	}

}
