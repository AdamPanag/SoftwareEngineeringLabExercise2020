package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Hides the functionality of the library from the user.
 * Receives all the necessary data from the user and does
 * all the actions needed to analyze the source code and
 * export it.
 * @author agkortzis, AdamPanag
 *
 */
public class Facade {
	
	/**
	 * Reads a Java source code file, calculates the metrics and exports them.
	 */
	public void analyzeSourceCode(String filepath, String sourceCodeAnalyzerType, String sourceFileLocation, 
			String outputFilePath, String outputFileType) throws IOException {
		
		Map<String, Integer> metrics = new HashMap<>();
		SourceCodeAnalyzerManagementSystem scams = new SourceCodeAnalyzerManagementSystem();
		
		SourceCodeAnalyzer analyzer = scams.createSourceCodeAnalyzerObject(sourceCodeAnalyzerType);
		metrics = scams.calculateMetrics(analyzer, sourceFileLocation, filepath); //calculate metrics

		MetricsExporterFactory mef = new MetricsExporterFactory();
		MetricsExporter exporter = mef.createMetricsExporter(outputFileType);
		
		exporter.writeFile(metrics, outputFilePath); //export metrics
	}
}
