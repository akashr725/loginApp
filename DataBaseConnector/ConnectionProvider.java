package DataBaseConnector;
import java.sql.*;

public class ConnectionProvider {

private ConnectionProvider() {
	
}

public static Connection getConnection() {
	Connection con=null;
	try {
		
		Class.forName(DataBaseDetails.DataBase_Driver);
		con=DriverManager.getConnection(DataBaseDetails.DataBase_Url,DataBaseDetails.DataBase_UserName,DataBaseDetails.DataBase_Password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}

public static Connection getConnection1() {
	// TODO Auto-generated method stub
	Connection con=null;
	try {
		
		Class.forName(DataBaseDetails.DataBase_Driver);
		con=DriverManager.getConnection(DataBaseDetails.DataBase_Url,DataBaseDetails.DataBase_UserName,DataBaseDetails.DataBase_Password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	
}

}
