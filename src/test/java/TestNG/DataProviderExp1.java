package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExp1 {
	@Test(dataProvider="getdata")
	public void BookTickets(String src, String dest,int numberofPeople)
	{
		System.out.println("Book Tickets from " +src+  " to "  +dest+ " for " + numberofPeople);
	}
@DataProvider
public Object[][] getdata()
{
	Object[][] obj = new Object[3][3];
	
	obj [0][0]="Bangalore";
	obj [0][1]="goa";
	obj [0][2]=2;
	
	obj [1][0]="Bangalore";
	obj [1][1]="Mysore";
	obj [1][2]=3;
	
	obj [2][0]="Bangalore";
	obj [2][1]="Chennai";
	obj [2][2]=4;
	return obj;
}
}
