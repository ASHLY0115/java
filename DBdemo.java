package dbms;
import java.sql.*;

public class DBdemo {
	

	public static void main(String[] args)throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.driver");
	
	try {
	
	Connection con=null;
	con = DriverManager.getConnection("jdbc:mysql://localhost/","admin","sjcet123");
	
	Statement stmt;
	stmt = con.createStatement();
	
	String sql = "create DB s3 cse a";
	stmt.execute(sql);
	
	con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
		

}
}


