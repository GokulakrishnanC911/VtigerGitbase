package AdSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SQL {
public static void main(String[] args) throws Throwable
{
	Driver d = new Driver();
	DriverManager.registerDriver(d);
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root","Gokul@23");
	Statement s = c.createStatement();
	String st = "select * from students";
	ResultSet r = s.executeQuery(st);
	while(r.next())
	{
		System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t" + r.getString(3) + "\t"
				+ r.getString(4));
	}
	c.close();
}
}
