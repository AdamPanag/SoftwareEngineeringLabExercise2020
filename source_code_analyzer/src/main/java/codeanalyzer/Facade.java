package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Hides the functionality of the library from the user. 
 * @author agkortzis, AdamPanag
 *
 */
public class Facade {
	
	/**
	 * Reads a Java source code file, calculates the metrics and exports them
	 */
	public void startApplication(String filepath, String sourceCodeAnalyzerType, String sourceFileLocation, 
			String outputFilePath, String outputFileType) throws IOException {

		SourceCodeAnalyzer analyzer = new SourceCodeAnalyzer(sourceFileLocation);
		int loc = analyzer.calculateLOC(filepath, sourceCodeAnalyzerType);
		int nom = analyzer.calculateNOM(filepath, sourceCodeAnalyzerType);
		int noc = analyzer.calculateNOC(filepath, sourceCodeAnalyzerType);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
		
		MetricsExporterFactory mef = new MetricsExporterFactory();
		MetricsExporter exporter = mef.createMetricsExporter(outputFileType);
		
		exporter.writeFile(metrics, outputFilePath);
	}
}
