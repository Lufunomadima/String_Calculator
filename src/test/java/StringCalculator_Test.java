import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculator_Test {
    StringCalculator calculate = new StringCalculator();

    @Test
    public void addReturnsZero() throws Exception {
        assertEquals(calculate.add(""), 0);
    }

    @Test
    public void addReturnsOneValue() throws Exception{
        assertEquals(calculate.add("1"), 1);
    }

    @Test
    public void addReturnsMultipleValues() throws Exception{
        assertEquals(calculate.add("1,1"),2);
    }

    @Test
    public void addNewLine() throws Exception{
        assertEquals(calculate.add("1\n2,3"),  6);
    }

    @Test
    public void addDelimiter() throws Exception{
        assertEquals(calculate.add("//;\n1;2"), 3);
    }

    @Test
    public void addNegativeError() throws Exception {
        calculate.add("-1,-2,3,4"); //it must fail because there are negative numbers
    }

    @Test
    public void addIgnoresIntegersGreaterThan1000() throws Exception{
        assertEquals(calculate.add("//;\n1000,1;2"), 3);
    }

    @Test
    public void addDelimiterOfAnyLength() throws Exception{
        assertEquals(calculate.add("//***\n1***2***3"),6);
    }

    @Test
    public void addDifferentDelimitersOfAnyLength() throws Exception{
        assertEquals(calculate.add("//[***][%%%]\n1***2%%%3"), 6);
    }
}
