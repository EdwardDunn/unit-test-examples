package edward_dunn.unit_test_examples.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTests.class, CalendarTests.class, PalindromeTests.class, UnitsConverterMockTests.class })
public class AllTests {

}
