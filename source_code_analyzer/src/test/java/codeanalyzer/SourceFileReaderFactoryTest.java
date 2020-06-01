package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class SourceFileReaderFactoryTest {
	
	SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
	
	@Test
	public void testCreateSourceFileReaderWithLocalFileType() {
		SourceFileReader actual = sfrf.createSourceFileReader("local");
		Assert.assertTrue(actual instanceof LocalFileReader);
	}
	
	@Test
	public void testCreateSourceFileReaderWithWebFileType() {
		SourceFileReader actual = sfrf.createSourceFileReader("web");
		Assert.assertTrue(actual instanceof WebFileReader);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSourceFileReaderWithUknownFIleType() {
		sfrf.createSourceFileReader("non-existing-type");
	}
}
