package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

public class P47_SumOfArrayTest {

    @Test(timeout = 1000)
    public void testTypicalArray() {
        int[] input = {5, 1, 9, 4, 2};
        int expected = 21;
        int result = P47_SumOfArray.sumOfNumbersInArray(input);
        assertEquals("Sum of {5, 1, 9, 4, 2} should be 21", expected, result);
    }

    @Test(timeout = 1000)
    public void testEmptyArray() {
        int[] input = {};
        int expected = 0;
        int result = P47_SumOfArray.sumOfNumbersInArray(input);
        assertEquals("Sum of empty array should be 0", expected, result);
    }

    @Test(timeout = 1000)
    public void testSingleElementArray() {
        int[] input = {7};
        int expected = 7;
        int result = P47_SumOfArray.sumOfNumbersInArray(input);
        assertEquals("Sum of {7} should be 7", expected, result);
    }

    @Test(timeout = 1000)
    public void testNegativeNumbers() {
        int[] input = {-3, -2, -1, 0, 1, 2, 3};
        int expected = 0;
        int result = P47_SumOfArray.sumOfNumbersInArray(input);
        assertEquals("Sum of balanced negatives and positives should be 0", expected, result);
    }

    @Test(timeout = 1000)
    public void testAllSameNumber() {
        int[] input = {4, 4, 4, 4};
        int expected = 16;
        int result = P47_SumOfArray.sumOfNumbersInArray(input);
        assertEquals("Sum of {4, 4, 4, 4} should be 16", expected, result);
    }
}
