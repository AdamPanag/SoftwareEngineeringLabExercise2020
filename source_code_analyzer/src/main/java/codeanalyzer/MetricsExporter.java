package codeanalyzer;

import java.util.Map;

/**
 * Interface that exports (writes) the metrics to a given output file. 
 * @authors agkortzis, AdamPanag
 *
 */
public  interface MetricsExporter {
	
	public void writeFile(Map<String, Integer> metrics, String filepath);
}
