package Generic_Uilities;

import java.util.Random;

public class JavaUtilities {
public int getRandomNum()
{
	Random r = new Random();
	int rn = r.nextInt(1000);
	return rn;
	
}
}
