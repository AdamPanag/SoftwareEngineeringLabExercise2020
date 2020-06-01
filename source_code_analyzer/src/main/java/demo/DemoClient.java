package demo;

import java.io.IOException;

import codeanalyzer.*;

public class DemoClient {

	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}
		
		/*
		* The client needs to give values only to these five (5) variables.
		* That gives us the opportunity to make changes,
		* without affecting the client's usage of the 'library'
		*/
		Facade facade = new Facade();
		facade.analyzeSourceCode(filepath, sourceCodeAnalyzerType, sourceFileLocation, 
				outputFilePath, outputFileType);
	}
}
