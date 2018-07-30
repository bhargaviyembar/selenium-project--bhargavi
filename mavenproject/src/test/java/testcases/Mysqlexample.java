package testcases;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Mysqlexample {
	@Test
public void database() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.driver");
	java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "1234");
	java.sql.Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select * from employee");
	while (rs.next()) {
		int id = rs.getInt("id");
		String name=rs.getString("name");
		String company=rs.getString("company");
		System.out.println(id+ ""+name+""+company+"");
		
		
		
	}
	
	
	
}
}
