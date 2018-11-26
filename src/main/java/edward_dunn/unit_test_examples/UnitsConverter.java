package edward_dunn.unit_test_examples;

public class UnitsConverter implements ConverterService {

	public double convertGramsToKG(double grams) {
		double result =  grams / 1000;
		
		return Math.round(result * 100.0) / 100.0;
	}

	public double convertPoundsToStone(double pounds) {
		double result = pounds / 14;

		// round to 2 decimal places
		return Math.round(result * 100.0) / 100.0;
	}

	public double convertFeetToYards(double feet) {
		double result = feet / 3;

		// round to 2 decimal places
		return Math.round(result * 100.0) / 100.0;
	}

}
