package math;

/**
 * A class that provides simple math operations
 * for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 16/04/2020
 */
public class MyMath {
	
	/*
	 * Calculates the factorial of an integer between 0 and 12.
	 * If it exceeds these bounds, it will throw an IllegalArgumentException.
	 */
	public int factorial(int n) {
		if (n >= 0 && n <= 12) {
			if (n == 0) {
				return 1;
			} else {
				return n * factorial(n-1);
			}
		} else {
			throw new IllegalArgumentException("Cannot count the factorial of values below 0 or above 12.");
		}
	}
}
