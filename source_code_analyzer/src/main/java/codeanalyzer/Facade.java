package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Facade {
	
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
				
		MetricsExporter exporter = new MetricsExporter();
		exporter.writeFile(outputFileType, metrics, outputFilePath);
	}
}
