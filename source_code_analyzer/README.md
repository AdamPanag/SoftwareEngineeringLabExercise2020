# Source Code Analyzer

## Overview
This is a module of the parent Maven project called [iCode](https://github.com/AdamPanag/iCode). This software system reads a Java source code file that is stored locally or on the web, calculates the LOC, NOM and NOC metrics and exports these metrics to an output file.

## Build the executable Java application
	mvn package jacoco:report

## Run the executable by executing
	java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
were args translate to: 	
	arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
	arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
	arg2 = “SourceCodeLocationType” [local|web]
	arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
	arg4 = “OutputFileType” [csv|json]
example: 
	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv

## Design Paterns
This software is redesinged in order to implement some of the good design patterns of software engineering. Here are the design patterns that are used:
* Facade
* Factory on Strategy
* Bridge

### Facade
Thare is a class named Facade that hides all the functionality of the system from the user. It creates all the necessary objects and calls the right methods. So, the user has just to give 5 values as parameters to the method analyzeSourceCode of the class Facade. This makes the usage of the system very easy to the end user, because he/she does not need to know how the system works.

### Factory on Strategy
This design pattern is used two times, one with the classes SourceFileReaderFactory, SourceFileReader, LocalFileReader and WebFileReader and one with the classes MetricsExporterFactory MetricsExporter, CsvWriter and JsonWriter. At the moment we use only two types of source file reader (web, local) and only two types of metrics exporter (csv, json). But with this design pattern we can easily add a third one to both of these cases. So this design pattern gives extensibility. The Factory classes  (SourceFileReaderFactory, MetricsExporterFactory) are responsible for creating the right object depending on which type of source file reader and metrics exporter the user wants to use.

The main drawbacks with this strategy is that we have way more classes that before, which makes the system more complicated to the developers and that it is now more difficult to add a new way of reading files (apart from readFIleIntoString and readFIleIntoList).

### Bridge
The classes that are involved in this startegy are SourceCodeAnalyzerManagementSystem, SourceCodeAnalyzer, RegexAnalyzer, StrcompAnalyzer, SourceFileReaderFactory, SourceFileReader, LocalFileReader and WebFileReader.

The main advantage of this design pattern is that types of source code analyzers and types of source file readers are in different dimensions and can be extended easily without affecting the other dimension. More specifically, adding new types of SourceFileReaders does not affect the SourceCodeAnalyzer hierarchy and vice versa. Also, the class SourceCodeAnalyzerManagementSystem is now responsible for connecting SourceCodeAnalyzer with SourceFileReaderFactory which is more appropriate.