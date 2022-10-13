package utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtility {
	
	public static Connection connect()
	{
		//load the driver
		//estabilish connection
		Connection connection=null;
		try
		{
		//Class.forName("org.postgresql.Driver");
		 //connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB_1st","postgres","ks");
		FileInputStream fis = new FileInputStream("C:/Users/khswami/Downloads/DB_1st/src/main/resources/db.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String driver = (String)p.get("driver");
		String url = (String)p.get("url");
		String username = (String)p.get("username");
		String password = (String)p.get("password");
		
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}
	
	

}
