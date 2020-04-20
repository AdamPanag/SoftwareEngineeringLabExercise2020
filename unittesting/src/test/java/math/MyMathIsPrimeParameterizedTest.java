package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * A class that that provides parameterized test cases 
 * for the method isPrime of the class
 * MyMath, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 20/04/2020
 */
@RunWith(Parameterized.class)
public class MyMathIsPrimeParameterizedTest {
	
	@Parameter(value = 0)
	public int prime;
	
	@Parameter(value = 1)
	public int notPrime;
	
	MyMath mm = new MyMath();
	
	/*
	 * Add the values and the expected results in an Object named data.
	 * The first value of each array corresponds to the variable named
	 * prime and the second to the notPrime.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{2,4},{5,10},{7,50},{97,4000}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * A unit test that checks if the method isPrime behaves
	 * with the right way.
	 */
	@Test
	public void testIsPrime() {
		Assert.assertTrue(mm.isPrime(prime));
		Assert.assertFalse(mm.isPrime(notPrime));
	}	
}
