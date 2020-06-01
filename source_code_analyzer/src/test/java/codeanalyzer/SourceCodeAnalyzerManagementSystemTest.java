package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class SourceCodeAnalyzerManagementSystemTest {
	
	SourceCodeAnalyzerManagementSystem scams = new SourceCodeAnalyzerManagementSystem();
	
	@Test
	public void testCreateSourceCodeAnalyzerObjectWithRegexAnalyzerType() {
		SourceCodeAnalyzer actual = scams.createSourceCodeAnalyzerObject("regex");
		Assert.assertTrue(actual instanceof RegexAnalyzer);
	}
	
	@Test
	public void testCreateSourceCodeAnalyzerObjectWithStrcompAnalyzerType() {
		SourceCodeAnalyzer actual = scams.createSourceCodeAnalyzerObject("strcomp");
		Assert.assertTrue(actual instanceof StrcompAnalyzer);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSourceCodeAnalyzerObjectWithUknownFIleType() {
		scams.createSourceCodeAnalyzerObject("non-existing-type");
	}

}
