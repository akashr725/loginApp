package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DataBaseConnector.ConnectionProvider;
import beans.LoginBean;

public class LoginDao {
	
	public void useLogin(LoginBean lgb) {
		try {
			
			Connection c =ConnectionProvider.getConnection();
			PreparedStatement ps =c.prepareStatement("select * from userdata where name=? and pass=?");
			ps.setString(1,lgb.getUname());
			ps.setString(2,lgb.getPass());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Valid");
			}
			else {
				System.out.println("InValid");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
