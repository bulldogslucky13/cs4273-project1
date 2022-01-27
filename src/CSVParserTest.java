import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CSVParserTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<List<String>> parsedResult = CSVParser.readCsv("csvTester.csv");
		ListIterator<List<String>> parsedIterator = parsedResult.listIterator();
		
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		testList.add("d");
		testList.add("e");
		
		List<String> row = parsedIterator.next();
		Object[] rowArray = row.toArray();
		Object[] testArray = testList.toArray();
		assertArrayEquals(rowArray,testArray);
	}

}
