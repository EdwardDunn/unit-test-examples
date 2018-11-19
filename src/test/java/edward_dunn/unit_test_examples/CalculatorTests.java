package edward_dunn.unit_test_examples;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void test_add_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		int num1 = 5;
		int num2 = 6;
		int expectedResult = 11;
		int actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.add(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_subtract_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		int num1 = 20;
		int num2 = 2;
		int expectedResult = 18;
		int actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.subtract(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}

}
