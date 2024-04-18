package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class UpdateTable
{
	public static void main(String[] args) throws SQLException
	{
		OracleDriver driver = new OracleDriver();
		 
		 DriverManager.registerDriver(driver);
		 
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe\r\n"
		 		+ "", "CORE","CORE");
		 
		 Statement sta = con.createStatement();
		 String que="update mounikaa set name='mou' where name='suma'";
		 int result = sta.executeUpdate(que);
		 
		
		 
		 con.close();
		
		
	}

}
