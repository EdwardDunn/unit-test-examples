package edward_dunn.unit_test_examples;

public class Palindrome {

	public boolean isPalindrome(String word){
    	StringBuilder sb = new StringBuilder(word);
    	String reversed = sb.reverse().toString();
    	
    	if(word.equals(reversed)){
    		return true;
    	}else {
    		return false;
    	}
	}
	
}
