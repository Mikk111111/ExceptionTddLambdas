package org.example;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntDividerTest {
    /**
     *
     * @throws ArgumentIsZeroException
     * testDivisionBetween
     */
    @Test
    public void testDivisionBetweenXandY() throws ArgumentIsZeroException {
        String numb1="8";
        String numb2="2";
        int x=8;
        int y=2;
        int expectedRes = x/y;
        int result;
        String[] numbers = {numb1,numb2};
        result = IntDivider.divide(numbers);
        Assert.assertEquals(expectedRes,result);

    }
    @Test
    public void testDivisionBetweenOfNames() throws ArgumentIsZeroException {
        String expected = "Dailius";
        String actual;
        actual = "Destytojo vardas yra Dailiuss";
        String resultInfo = "Expected: "+expected+", Actual: "+actual;
        Assert.assertTrue(resultInfo,actual.contains(expected));
    }
}