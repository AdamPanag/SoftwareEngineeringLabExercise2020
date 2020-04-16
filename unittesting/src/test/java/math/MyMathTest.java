package math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

/**
 * A class that that provides test cases 
 * for the mathematical operations of the MyMath
 * class, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 16/04/2020
 */
public class MyMathTest {
	
	MyMath mm = new MyMath();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A unit test that checks that the method factorial throws
	 * the right exception and message when the argument is
	 * a negative number.
	 */
	@Test
	public void testFactorialNegative() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Cannot count the factorial of values below 0 or above 12.");
		mm.factorial(-18);
	}
	
	/*
	 * A unit test that checks that the method factorial throws
	 * the right exception and message when the argument is
	 * a number greater than 12.
	 */
	@Test
	public void testFactorialAboveTwelve() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Cannot count the factorial of values below 0 or above 12.");
		mm.factorial(13);
	}
}
