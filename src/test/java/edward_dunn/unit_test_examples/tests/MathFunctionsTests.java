package edward_dunn.unit_test_examples.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import edward_dunn.unit_test_examples.MathFunctions;

public class MathFunctionsTests {
	
	MathFunctions mathFunctions;

	@Before
	public void setUp() throws Exception {
		mathFunctions = new MathFunctions();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_sumArray_GivenArrayOfFiveIntegers_ReturnSumOfArray() {
		int[] numbersArray = {1,2,3,4,5};
		int expected = 15;
		int actual = mathFunctions.sumArray(numbersArray);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_findMax_GivenArrayOfTenIntegers_ReturnMax() {
		int[] numbersArray = {255,1,555,67,5,44,222,55,333,567};
		int expected = 567;
		int actual = mathFunctions.findMax(numbersArray);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_findMin_GivenArrayOfTenIntegers_ReturnMax() {
		int[] numbersArray = {54,58,1,25,555,6981,52,77,89,10};
		int expected = 1;
		int actual = mathFunctions.findMin(numbersArray);
		assertEquals(expected, actual);
	}

}
