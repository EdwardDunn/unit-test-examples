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
	public void test_isPalindrome_GivenPalindrome_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "madam";
		boolean expected = true;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_isPalindrome_GivenUpperCasePalindrome_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "NOON";
		boolean expected = true;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_isPalindrome_GivenNonPalindrome_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "test";
		boolean expected = false;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_isPalindrome_GivenEmptyString_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "";
		boolean expected = false;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_isPalindrome_GivenSentence_ReturnTrue(){
		Palindrome pc = new Palindrome();
		String word = "The purpose of this test is to ensure sentences are handled correctly";
		boolean expected = false;
		boolean actual = pc.isPalindrome(word);
		assertEquals(expected, actual);
	}

}
