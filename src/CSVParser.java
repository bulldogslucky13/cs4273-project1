import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVParser {
	
	private static List<String> getRecordFromLine(String line) {
	    List<String> values = new ArrayList<String>();
	    try (Scanner rowScanner = new Scanner(line)) {
	        rowScanner.useDelimiter(COMMA_DELIMITER);
	        while (rowScanner.hasNext()) {
	            values.add(rowScanner.next());
	        }
	    }
	    return values;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("book.csv"));) {
		    while (scanner.hasNextLine()) {
		        records.add(getRecordFromLine(scanner.nextLine()));
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}	

}
