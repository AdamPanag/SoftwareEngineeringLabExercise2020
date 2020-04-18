package math;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import io.FileIO;

/**
 * A class that that provides test cases 
 * for the operations of the ArrayOperations
 * class, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 18/04/2020
 */
public class ArrayOperationsTest {
	
	ArrayOperations ao = new ArrayOperations();
	
	/*
	 * A unit test for the method dindPrimesInFile that
	 * mocks the instances of MyMath and FileIO
	 * in order for the test to pass even if me methods
	 * from the other classes do not work properly.
	 */
	@Test
	public void testFindPrimesInFileMocking() {
		
		MyMath mm = mock(MyMath.class);
		FileIO fio = mock(FileIO.class);
		
		String filepath = "blabla";
		
		when(fio.readFile(filepath)).thenReturn(new int[]{2,7,20,4000,97});
		when(mm.isPrime(2)).thenReturn(true);
		when(mm.isPrime(7)).thenReturn(true);
		when(mm.isPrime(20)).thenReturn(false);
		when(mm.isPrime(4000)).thenReturn(false);
		when(mm.isPrime(97)).thenReturn(true);
		
		Assert.assertArrayEquals(new int[]{2,7,97}, ao.findPrimesInFile(fio, filepath, mm));
	}
}
