package DataBaseConnector;
import java.sql.*;
import java.util.Scanner;

public class MainCode {

	public static void main(String[] args) {
		Connection c=null;
		try {
			
			 c=ConnectionProvider.getConnection();
			PreparedStatement s=c.prepareStatement("insert into user values(?,?)");
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter the name: ");
			String name=sc.next();
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			s.setString(1,name);
			s.setInt(2, id);
		int i=s.executeUpdate();
		if(i>0) {
			System.out.println("record inserted.....");
		}
		else {
			System.out.println("record is not inserted.....");
		}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
				System.out.println("Connection is closed");
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
