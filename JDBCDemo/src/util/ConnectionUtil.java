package util;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionUtil {

	private static Connection con;

	public static Connection getConnection() {

//		try (FileInputStream fin = new FileInputStream("db.properties");) {
//			Properties p = new Properties();
//			p.load(fin);
//			// 1. loading and registration of driver
//			Class.forName(p.getProperty("driver"));
//			// 2.Establish connection
//			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),
//					p.getProperty("password"));
//			System.out.println("Connection is Established!!");
//			return con;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return con;
		

//	}

	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mydb","root","Srigmk@28");  
		//here sonoo is database name, root is username and password  
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from product");  
//		while(rs.next())  
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3)); 
//		con.close();  
		}
	catch(Exception e)
	{
		System.out.println(e);
		} 
	return con;
		} 
}

