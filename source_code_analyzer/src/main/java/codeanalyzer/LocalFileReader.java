package codeanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves (reads) the contents of a given file
 * that is stored locally.
 * @author agkortzis, AdamPanag
 *
 */
public class LocalFileReader implements SourceFileReader {

	/**
	 * Reads a file and returns its content in a List
	 * @param fileReaderType the location of a file 
	 * (<b>local</b> for locally stored files.
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * or null if the type is not <b>local</b>
	 * @throws IOException
	 */
	public List<String> readFileIntoList(String filepath) throws IOException {
		// read a locally stored file
		List<String> lines = new ArrayList<>();
		File file = new File(filepath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		reader.close();
		return lines;
	}
	
	/**
	 * Reads a file and returns its content in a single String
	 * @param fileReaderType the location of a file 
	 * (<b>local</b> for locally stored files. 
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * or null if the type is not <b>local</b>
	 * @throws IOException
	 */
	public String readFileIntoString(String filepath) throws IOException {
		// read a locally stored file
		StringBuilder sb = new StringBuilder();
		File file = new File(filepath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		reader.close();
		return sb.toString();

	}
}

