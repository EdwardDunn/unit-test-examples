package edward_dunn.unit_test_examples;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class UnitsConverterMockTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@InjectMocks
	UnitsConverter unitsConverter = new UnitsConverter();

	@Mock
	ConverterService convertService;

	@Test
	public void test_convertGramsToKG_GivenNormalRange_ReturnResult() {
		when(convertService.convertGramsToKG(1000)).thenReturn(1.0);
		
		Assert.assertEquals(1.0, unitsConverter.convertGramsToKG(1000));
	}
	
	@Test
	public void test_convertGramsToKG_GivenExceptionalRange_ReturnResult() {
		when(convertService.convertGramsToKG(5556288)).thenReturn(5556.29);
		
		Assert.assertEquals(5556.29, unitsConverter.convertGramsToKG(5556288));
	}
	
	@Test
	public void test_convertPoundsToStone_GivenNormalRange_ReturnResult() {
		when(convertService.convertPoundsToStone(130)).thenReturn(9.29);

		Assert.assertEquals(9.29, unitsConverter.convertPoundsToStone(130));
	}
	
	@Test
	public void test_convertPoundsToStone_GivenExceptionalRange_ReturnResult() {
		when(convertService.convertPoundsToStone(25000)).thenReturn(1785.71);

		Assert.assertEquals(1785.71, unitsConverter.convertPoundsToStone(25000));
	}
	
	@Test
	public void test_convertFeetToYards_GivenNormalRange_ReturnResult() {
		when(convertService.convertFeetToYards(1000)).thenReturn(333.33);
		
		Assert.assertEquals(333.33, unitsConverter.convertFeetToYards(1000));
	}
	
	@Test
	public void test_convertFeetToYards_GivenExceptionalRange_ReturnResult() {
		when(convertService.convertFeetToYards(555999)).thenReturn(185333.0);
		
		Assert.assertEquals(185333.0, unitsConverter.convertFeetToYards(555999));
	}

}
