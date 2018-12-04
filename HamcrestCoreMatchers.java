@Test
public void testAssetThatExamples() {

    List<String> fruits = Arrays.asList("Apple", "Orange", "Pear", "Banana");
    // fruits list should have values Apple and Pear
    assertThat(fruits, hasItems("Apple", "Pear"));

    // 'The sample message' should contain 'T' and 's'
    assertThat("The sample message", both(containsString("T")).and(containsString("s")));

    // Every item in the list should have the character 'h'
    assertThat(items, everyItem(containsString("h")));
    
    // negation of all of the matchers
    assertThat("Once", not(allOf(equalTo("test"), containsString("test"))));
    
    // check all of the matchers
    assertThat("Once", allOf(equalTo("Once"), startsWith("O")));
    
}
