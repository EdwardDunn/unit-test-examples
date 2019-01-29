package edward_dunn.unit_test_examples.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edward_dunn.unit_test_examples.Calculator;

public class CalculatorTests extends junit.framework.TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void test_add_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		double num1 = 5;
		double num2 = 6;
		double expectedResult = 11;
		double actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.add(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_subtract_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		double num1 = 20;
		double num2 = 2;
		double expectedResult = 18;
		double actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.subtract(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_multiply_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		double num1 = 10.5;
		double num2 = 2;
		double expectedResult = 21;
		double actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.multiply(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_divide_GivenPositiveNum_ReturnCorrectResult() {
		//arrange
		double num1 = 50;
		double num2 = 5;
		double expectedResult = 10;
		double actualResult = 0;
		
		//act
		Calculator calculator = new Calculator();
		actualResult = calculator.divide(num1, num2);
		
		//assert
		assertEquals(expectedResult, actualResult);
	}	

}
