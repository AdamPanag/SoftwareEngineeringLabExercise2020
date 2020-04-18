package math;

import io.FileIO;
import java.util.ArrayList;
import java.util.List;

/**
* A class that provides array operations
* for demonstrating Unit Testing.
*
* @author  AdamPanag
* @since   18/04/2020 
*/
public class ArrayOperations {
	
	/**
	 * Finds the prime numbers in a file with a value in each line.
	 * If the values are non-Integer, the result will be still correct.
	 * 
	 * @param fileIo the FileIO instance
	 * @param filepath the relative path of the file
	 * @param fileIo the FileIO instance
	 * @return an Integer array that contains only prime numbers
	 */
	int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		
		int[] integers = fileIo.readFile(filepath);
		List<Integer> primeNums = new ArrayList<>();
		
		for (int n : integers) {
			if (myMath.isPrime(n)) {
				primeNums.add(n);
			}
		}
		return primeNums.stream().mapToInt(i -> i).toArray();
	}

}
