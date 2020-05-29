package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class RegexAnalyzerTest {
	SourceFileReader sfr = new LocalFileReader();
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzer analyzer = new RegexAnalyzer();
		
	@Test
	public void testCalculateRegexLOC() throws IOException {
		assertEquals(21, analyzer.calculateLOC(TEST_CLASS, sfr));
	}
	
	@Test
	public void testCalculateRegexNOM() throws IOException {
		assertEquals(3, analyzer.calculateNOM(TEST_CLASS, sfr));
	}

	@Test
	public void testCalculateRegexNOC() throws IOException {
		assertEquals(3, analyzer.calculateNOC(TEST_CLASS, sfr));
	}
}
