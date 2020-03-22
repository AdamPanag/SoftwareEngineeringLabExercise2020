package gradeshistogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/***
 * 
 * @author AdamPanag The purpose of this class is to generate
 *		   a histogram from a .txt file with a grade (from 0 to 10) 
 *         in each line.
 * @since March 2020 
 */
public class HistogramGenerator {
		
	/***
	 * Receives the path of the file that contains the grades.
	 * Reads the file line by line and stores the frequency of
	 * each grade to the Integer array gradeFrequency.
	 * 
	 * @param path String with the file path
	 */
	public int[] readGrades(String path) {
		
		// initialize the frequency of each grade to zero.
		int[] gradeFrequency = {0,0,0,0,0,0,0,0,0,0,0};
		
		File file = new File(path);
		try  {
			BufferedReader br = new BufferedReader(new FileReader(file));
		    String line;
		    while ((line = br.readLine()) != null) { // read each line
		    	gradeFrequency[Integer.parseInt(line)]++; // update the frequency
		    }
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		
		return gradeFrequency;
	}

	/***
	 * Receives a single dimension Integer array, that contains the frequencies
	 * of each possible grade. From this array generates the dataset that will
	 * be used for the visualization. Finally, generates a histogram and makes it
	 * visible in the screen.
	 */
	public void generateHistogram(int[] gradeFrequency) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Adding grade frequencies to the XYSeries data object.
		 */
		for (int i = 0; i < gradeFrequency.length; i++) {
			data.add(i, gradeFrequency[i]);
		}
				
		dataset.addSeries(data); // add the series to the dataset

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the
		 * previously created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);		
	}
		
	public static void main(String[] args) {
		
		String path = args[0]; // get the path from the command line
		
		HistogramGenerator demo = new HistogramGenerator();
		int[] gradeFrequency = demo.readGrades(path);
		demo.generateHistogram(gradeFrequency);		
	}	
}
