package edward_dunn.unit_test_examples;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Calendar {
	
//	The aim of this class is to implement a simple calendar application that
//	can be used to illustrate how JUnit can be used for performance testing. In this case
//	the test will fail if the result is not returned within 1000ms.
	
	
	public String getCurrentDate() {
		String currentDate = LocalDate.now().toString();
		return currentDate;
	}
	
	public String getCurrentDay() {
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");		
		String currentDay = simpleDateformat.format(now);
		
		return currentDay;		
	}

}
