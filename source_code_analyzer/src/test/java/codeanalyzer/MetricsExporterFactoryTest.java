package codeanalyzer;

import org.junit.Test;

public class MetricsExporterFactoryTest {
	
	MetricsExporterFactory mef = new MetricsExporterFactory();
	
	@Test(expected = IllegalArgumentException.class)
	public void testWriteFileWithUknownFIleType() {
		mef.createMetricsExporter("non-existing-type");
	}
}
