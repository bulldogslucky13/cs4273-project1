import java.io.BufferedReader;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CSVParser {
	public static List<List<String>> readCsv(String filename) {
		List<List<String>> parsedCsv = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        parsedCsv.add(Arrays.asList(values));
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return parsedCsv;
	}
	
	public static void main(String[] args) {
		List<List<String>> parsingResults = readCsv("letters.csv");
		
		ListIterator<List<String>> iterator = parsingResults.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
