package AdSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SQL_Insert {
public static void main(String[] args) throws Throwable 
{
	Driver d = new Driver();
	DriverManager.registerDriver(d);
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root","Gokul@23");
	Statement s = c.createStatement();
	String st="insert into students(id,first_name,last_name,address)values('5','Ranjith','Kumar','goa')";
	int res = s.executeUpdate(st);
	if(res==1)
	{
		System.out.println("data is passed");
	}
	else
	{
		System.out.println("Data is not passed");
	}
	c.close();
}
}
