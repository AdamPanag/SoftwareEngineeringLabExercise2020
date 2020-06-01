package codeanalyzer;

/**
 * Decides which file reader type the user has chosen
 * to use.
 * @author agkortzis, AdamPanag
 *
 */
public class SourceFileReaderFactory {
	
	/**
	 * Creates the object of the appropriate source file reader.
	 * @param fileReaderType the type of the file reader
	 * @return the object of the right file reader class
	 */
	public SourceFileReader createSourceFileReader(String fileReaderType) {
		SourceFileReader fileReader;
		if (fileReaderType.equals("local")) {
			fileReader = new LocalFileReader();
		} else if (fileReaderType.equals("web")) {
			fileReader = new WebFileReader();
		} else {
			throw new IllegalArgumentException("Unknown file reader type : " + fileReaderType);
		}
		return fileReader;
	}
}
