package edward_dunn.unit_test_examples.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import edward_dunn.unit_test_examples.Palindrome;

public class PalindromeTests extends TestCase {
	
	@Before
	public void setup() {
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void test_isPalindrome_GivenPalindrom_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "madam";
		boolean expected = true;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}

}
