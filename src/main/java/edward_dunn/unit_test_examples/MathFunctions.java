package edward_dunn.unit_test_examples;

public class MathFunctions {

	public int sumArray(int[] numbersArray) {
		int sum = 0;
		
		for(int i : numbersArray) {
			sum+= i;
		}
		
		return sum;
	}
	
	public int findMax(int[] numbersArray) {
		int max = 0;
		
		for(int i : numbersArray) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
	}
	
	public int findMin(int[] numbersArray) {
		int min = numbersArray[0];
		
		for(int i : numbersArray) {
			if(i < min) {
				min = i;
			}
		}
		
		return min;
	}
	
	
	
}
