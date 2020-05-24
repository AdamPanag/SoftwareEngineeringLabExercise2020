package codeanalyzer;

import java.util.Map;

/**
 * Exports (writes) the metrics to a given output.
 * The output can be only a JSON file.
 * @author agkortzis, AdamPanag
 *
 */
class JsonWriter implements MetricsExporter {
	
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		this.writeJson(metrics, filepath);
	}
	
	private void writeJson(Map<String, Integer> metrics, String filepath) {
		// Functionality not implemented yet
		// No need to implement it for the assignment
	}
}
