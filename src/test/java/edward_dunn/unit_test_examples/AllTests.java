package edward_dunn.unit_test_examples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, CalculatorTests.class, CalendarTests.class, UnitsConverterMockTests.class })
public class AllTests {

}
