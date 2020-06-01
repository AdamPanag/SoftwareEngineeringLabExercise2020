package codeanalyzer;

import java.io.IOException;

/**
 * Analyzes the contents of a Java source code file 
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes. 
 * The current functionality supports two types of source code analysis,
 * namely regex (with the use of regular expressions) and 
 * strcomp (with the use of string comparison). 
 * @author agkortzis, AdamPanag
 *
 */
public abstract class SourceCodeAnalyzer {
		
	public abstract int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException;
	
	public abstract int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException;
	
	public abstract int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException;
}
