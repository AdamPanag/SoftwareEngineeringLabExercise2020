package math;

import org.junit.Assert;
import org.junit.Test;

/**
 * A class that that provides test cases for the
 * mathematical operations of the ArithmeticOperations
 * class, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 15/04/2020
 */
public class ArithmeticOperationsTest {

	ArithmeticOperations ao = new ArithmeticOperations();
	
	/*
	 * A unit test that checks the division of two positive numbers.
	 */
	@Test
	public void testDividePositiveNumbers() {
		Assert.assertEquals(8.75, ao.divide(35, 4), 0.000001);
	}
	
	/*
	 * A unit test that checks the division of two negative numbers.
	 */
	@Test
	public void testDivideNegativeNumbers() {
		Assert.assertEquals(7.6, ao.divide(-38, -5), 0.000001);
	}
	
	/*
	 * A unit test that checks the division of a positive with a negative number.
	 */
	@Test
	public void testDividePosWithNegNumber() {
		Assert.assertEquals(-8.75, ao.divide(35, -4), 0.000001);
	}
	
	/*
	 * A unit test that checks the division of two positive numbers 
	 * that their devision is incomplete.
	 */
	@Test
	public void testDivideIncomplete() {
		Assert.assertEquals(3.3333333, ao.divide(10, 3), 0.000001);
	}
}
