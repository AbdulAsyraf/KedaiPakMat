package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDatabase {

	private static String DB_URL = "jdbc:mysql://502m.hopto.org:3306/test?useSSL=false";
	private static String USER = "User";
	private static String PASS = "abc123";
	
	public static Connection doConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;
	}
}
