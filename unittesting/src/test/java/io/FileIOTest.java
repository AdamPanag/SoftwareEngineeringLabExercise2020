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
	 * A unit test for the method readFile with an appropriate file
	 * as an argument.
	 */
	@Test
	public void testReadFile() {
		filepath = "src/test/resources/normal_case.txt";
		Assert.assertArrayEquals(new int[] {2, 6, 5, 9, 7354, 12}, fio.readFile(filepath));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A unit test for the method readFile with a file, that
	 * does not a exist, as an argument.
	 */
	@Test
	public void testReadFileWhenFileDoesntExist() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		filepath = "src/test/resources/no_file.txt";
		fio.readFile(filepath);
	}	
}
