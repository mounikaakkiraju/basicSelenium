package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class sql 
{
	public static void main(String[] args) throws SQLException
	{
		//step1:- Register the Driver
		 OracleDriver driver = new OracleDriver();
		 
		 
		 DriverManager.registerDriver(driver);
		 
		 //step:-get connection for database
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe\r\n"+ "", "CORE","CORE");
		 
		 //step3:-Create statement
		 
		 Statement sta = con.createStatement();
		 
		 //step4:-Execute query
		 String que="select * from mounikaa";
		 ResultSet result = sta.executeQuery(que);
		 
		 while(result.next())
			{
				System.out.println(result.getString(1));
			}
		 //step5:-Close Database
		 con.close();
		
	}

}
