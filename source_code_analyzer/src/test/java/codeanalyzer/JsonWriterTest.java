package codeanalyzer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import codeanalyzer.MetricsExporter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doCallRealMethod;

public class JsonWriterTest {
	
	MetricsExporter mex = new JsonWriter();
	
	@Test
	public void testWriteJson() {
		JsonWriter mockedExporter = mock(JsonWriter.class);
		// create an empty metrics content
		Map<String, Integer> metrics = new HashMap<>();
		String outputFilepath = "whatever-path";
		
		//this is a demo of how a mocked object can call a real method (partial mocking)
		doCallRealMethod().when(mockedExporter).writeFile(metrics, outputFilepath);
		mockedExporter.writeFile( metrics, outputFilepath);
		//just verify that the method was executed/called
		verify(mockedExporter).writeFile(metrics, outputFilepath);
	}
}
