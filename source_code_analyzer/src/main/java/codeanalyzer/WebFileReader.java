package codeanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves (reads) the contents of a given file
 * that is stored on the web.
 * @author agkortzis, AdamPanag
 *
 */
public class WebFileReader implements SourceFileReader {

	/**
	 * Reads a file and returns its content in a List
	 * @param fileReaderType the location of a file 
	 * <b>web</b> for files stored on the web). 
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * or null if the type is not <b>web</b>
	 * @throws IOException
	 */
	public List<String> readFileIntoList(String filepath) throws IOException {
		// read a file stored in the web
		List<String> lines = new ArrayList<>();
	    URL url = new URL(filepath);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
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
	 * <b>web</b> for files stored on the web). 
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * or null if the type is not <b>web</b>
	 * @throws IOException
	 */
	public String readFileIntoString(String filepath) throws IOException {
		// read a file stored in the web
		StringBuilder sb = new StringBuilder();
	    URL url = new URL(filepath);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	        sb.append(line + "\n");
	    }
	    reader.close();
		return sb.toString();
	}
}
