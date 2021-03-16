package Stream.CSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class State {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\eclipse-workspace\\CSV\\Sensus.csv");
		CSVWriter writer = new CSVWriter(new FileWriter(file));
		String [] line1 = {"Id","Name","Salary","Start_date","Dept"};
 		writer.writeNext(line1);
 		System.out.println("Done");
 		writer.close();
	}
	
	

}
