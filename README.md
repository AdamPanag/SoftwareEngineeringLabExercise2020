# iCode
[![Build Status](https://travis-ci.com/AdamPanag/iCode.svg?token=TFZa7qgmi3yxuWQ8eYkt&branch=development)](https://travis-ci.com/AdamPanag/iCode)
## Overview
This project is created for the needs of the course Software Engineering in Practice of the DMST of AUEB.

## Project Structure

This repository consists of a Maven project with two modules.
1) [Histogram Generator](gradeshistogram) - receives a .txt file with grades and generates a histogram.
2) [Unit Testing](unittesting) - includes classes that do certain operations and tests all the functions of these classes.
3) [Source Code Analyzer](source_code_analyzer) - reads a Java source code file that is stored locally or on the web, calculates the LOC, NOM and NOC metrics and exports these metrics to an output file.

## Requirements
This project requires:
* Java JDK version 1.8 (or later)
* Maven 3.3 (or later)

## Install
You must clone the repository and install maven to your computer [maven-installation](https://mkyong.com/maven/how-to-install-maven-in-windows/)

## Build
Go to the root directory of the repository and execute the following command in order to build all modules:
```
mvn clean package jacoco:report
```
This command will generate a jar file and a report of the code coverage produced by JaCoCo for each module.

The jar file is located in the following path:
```
module_name/target/
```

The report of the code coverage is located in the following path:
```
module_name/target/site/jacoco
```

## Test Project
To simply test the unit tests of the project, execute the following commant in the root directory:
```
mvn test
```

## Generate Test-Coverage report
If you want to test the project and generate a code coverage report, execute the following command in the root directory:
```
mvn test jacoco:report
```

## Run gradeshistogram
Go to the directory "target" that exists in gradeshistogram module and execute the following command:
```
java -jar gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar "path\of\file\with\grades"
```

### Authors
* [Adam Panagiotidis](https://github.com/AdamPanag)

* [Antonios Gkortzis](https://github.com/AntonisGkortzis)