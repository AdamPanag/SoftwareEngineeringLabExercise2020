package codeanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MetricsExporterFactoryTest {
	
	MetricsExporterFactory mef = new MetricsExporterFactory();
	
	@Test
	public void testCreateMetricsExporterWithCsvFileType() {
		MetricsExporter actual = mef.createMetricsExporter("csv");
		Assert.assertTrue(actual instanceof CsvWriter);
	}
	
	@Test
	public void testCreateMetricsExporterWithJsonFileType() {
		MetricsExporter actual = mef.createMetricsExporter("json");
		Assert.assertTrue(actual instanceof JsonWriter);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateMetricsExporterWithUknownFIleType() {
		mef.createMetricsExporter("non-existing-type");
	}
}
