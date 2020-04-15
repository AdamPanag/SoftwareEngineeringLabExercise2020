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
}
