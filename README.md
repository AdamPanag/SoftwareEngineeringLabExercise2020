# iCode

This repository is for the course Software Engineering in Practice of the DMST of AUEB.

## Project Structure

This repository consists of a Maven project and one module.
1) [Histogram Generator](gradeshistogram) - receives a .txt file with grades and generates a histogram

## Install
You must clone the repository and install maven to your computer [maven-installation](https://mkyong.com/maven/how-to-install-maven-in-windows/)

## Build
Go to the root directory of the repository and execute the following command in order to build all modules:
```
mvn package
```
This command generates a jar file in each module's target directory.

## Run
Go to the directory "target" that exists in every module and execute the following command:
```
java -jar gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar "path\of\file\with\grades"
```

### Authors
[Adam Panagiotidis](https://github.com/AdamPanag)