package edward_dunn.unit_test_examples;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalendarTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// the timeout function here can be used to set the maximum request time allowed
	@Test (timeout = 1000)
	public void test_getCurrentDate_GivenNothing_ReturnCurrentDate() {
		// arrange
		String expectedResult = LocalDate.now().toString();
		String actualResult = "";
		
		// act
		Calendar cal = new Calendar();
		actualResult = cal.getCurrentDate();
		
		// assert 
		assertEquals(expectedResult, actualResult);		
	}
	
	@Test (timeout = 1000)
	public void test_getCurrentDayOfWeek_GivenNothing_ReturnCurrentDayOfWeek() {
		// arrange
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");		
		String expectedResult = simpleDateformat.format(now);
		String actualResult = "";
		
		// act
		Calendar cal = new Calendar();
		actualResult = cal.getCurrentDay();
		
		// assert 
		assertEquals(expectedResult, actualResult);		
	}

}
