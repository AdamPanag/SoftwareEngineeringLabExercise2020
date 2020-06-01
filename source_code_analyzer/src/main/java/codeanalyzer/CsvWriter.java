package codeanalyzer;

import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exports (writes) the metrics to a given output.
 * The output can be only a CSV file.
 * @author agkortzis, AdamPanag
 *
 */
class CsvWriter implements MetricsExporter {
	
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		this.writeCsv(metrics, filepath);
	}
		
	private void writeCsv(Map<String, Integer> metrics, String filepath) {
		File outputFile = new File(filepath + ".csv");
		StringBuilder metricsNames = new StringBuilder();
		StringBuilder metricsValues = new StringBuilder();
		
		for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
			metricsNames.append(entry.getKey() + ",");
			metricsValues.append(entry.getValue()+",");
		}
		
		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.append(metricsNames + "\n");
			writer.append(metricsValues + "\n");
			writer.close();
			System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
