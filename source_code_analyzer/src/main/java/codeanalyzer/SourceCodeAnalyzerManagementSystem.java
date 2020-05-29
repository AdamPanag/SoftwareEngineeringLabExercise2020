package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages the source code analysis. 
 * @author agkortzis, AdamPanag
 *
 */
public class SourceCodeAnalyzerManagementSystem {
	
	private SourceFileReader fileReader;
	private SourceCodeAnalyzer analyzer;
	SourceFileReaderFactory sfrf = new SourceFileReaderFactory();
	
	/**
	 * Decides which source code analyzer type will be used.
	 * @param analyzerType the type of the source code analyzer
	 * @return the object of the class SourceCodeAnalyzer
	 */
	public SourceCodeAnalyzer createSourceCodeAnalyzerObject(String analyzerType) {
		if (analyzerType.equals("regex")) {
			this.analyzer = new RegexAnalyzer();
		} else if (analyzerType.equals("strcomp")) {
			this.analyzer = new StrcompAnalyzer();
		} else {
			throw new IllegalArgumentException("Unknown source code analyzer type : " + analyzerType);
		}
		
		return analyzer;
	}
	
	/**
	 * Starts the calculation of all the metrics.
	 * @param analyzer the object of the class SourceCodeAnalyzer
	 * @param fileReaderType the type of the source code analyzer
	 * @param filepath the path of the file to by analyzed
	 * @return a Map<String, Integer> with the name and the value of each metric
	 * @throws IOException
	 */
	public Map<String, Integer> analyzeSourceCode(SourceCodeAnalyzer analyzer, String fileReaderType, String filepath) throws IOException{
		
		this.fileReader = sfrf.createSourceFileReader(fileReaderType);
		Map<String, Integer> metrics = new HashMap<>();
		
		int loc = analyzer.calculateLOC(filepath, fileReader);
		int nom = analyzer.calculateNOM(filepath, fileReader);
		int noc = analyzer.calculateNOC(filepath, fileReader);
		
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
		
		return metrics;
	}

}
