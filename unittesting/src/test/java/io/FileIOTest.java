package io;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

import java.util.Arrays;

/**
 * A class that that provides test cases 
 * for the operations of the FileIO
 * class, for demonstrating Unit Testing.
 * @author AdamPanag
 * @since 17/04/2020
 */
public class FileIOTest {
	
	FileIO fio = new FileIO();
	String filepath;
	
	/*
	 * A unit test for the method readFile with am appropriate file
	 * as an input.
	 */
	@Test
	public void testReadFile() {
		filepath = "src/test/resources/normal_case.txt";
		Assert.assertArrayEquals(new int[] {2, 6, 5, 9, 7354, 12}, fio.readFile(filepath));
	}
}
