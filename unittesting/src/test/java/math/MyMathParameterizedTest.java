package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * A class that that provides parameterized test cases 
 * for the mathematical operations of the MyMath
 * class, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 16/04/2020
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedTest {
	
	@Parameter(value = 0)
	public int factor;
	
	@Parameter(value = 1)
	public int result;
	
	MyMath mm = new MyMath();
	
	/*
	 * Add the values and the expected results in an Object named data.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * A unit test that checks if the factorial of each value, that 
	 * are in the first column of each row of Object data, equals to
	 * the value of the second column.
	 */
	@Test
	public void testFactorial() {
		Assert.assertEquals(result, mm.factorial(factor));
	}
}
