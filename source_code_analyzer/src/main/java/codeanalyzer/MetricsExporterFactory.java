package codeanalyzer;

/**
 * A factory for the interface MetricsExporter.
 * @author agkortzis, AdamPanag
 *
 */
public class MetricsExporterFactory {
	
	/**
	 * Creates the proper object for the type of the output file.
	 */
	public  MetricsExporter createMetricsExporter(String outputType) {
		MetricsExporter exporter;
		if (outputType.equals("csv")) {
			exporter = new CsvWriter();
		} else if (outputType.equals("json")) {
			exporter = new JsonWriter();
		} else {
			throw new IllegalArgumentException("Unknown output type : " + outputType);
		}
		
		return exporter;
	}
}
