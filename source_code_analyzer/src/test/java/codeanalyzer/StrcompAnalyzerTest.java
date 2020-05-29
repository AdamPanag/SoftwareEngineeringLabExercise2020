package codeanalyzer;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class StrcompAnalyzerTest {
	SourceFileReader sfr = new LocalFileReader();
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzer analyzer = new StrcompAnalyzer();
	
	@Test
	public void testCalculateStrCompLOC() throws IOException {
		assertEquals(7, analyzer.calculateLOC(TEST_CLASS, sfr));
	}
	
	@Test
	public void testCalculateStrCompNOM() throws IOException {
		assertEquals(3, analyzer.calculateNOM(TEST_CLASS, sfr));
	}
	
	@Test
	public void testCalculateStrCompNOC() throws IOException {
		assertEquals(3, analyzer.calculateNOC(TEST_CLASS, sfr));
	}

}
