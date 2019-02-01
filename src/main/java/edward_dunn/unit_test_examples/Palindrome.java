package edward_dunn.unit_test_examples;

public class Palindrome {

	public boolean isPalindrome(String word){
		if(word.equals("")) {
			return false;
		}
		
		word.toLowerCase();
		
    	StringBuilder sb = new StringBuilder(word);
    	String reversed = sb.reverse().toString();
    	
    	if(word.equals(reversed)){
    		return true;
    	}else {
    		return false;
    	}
	}
	
}
