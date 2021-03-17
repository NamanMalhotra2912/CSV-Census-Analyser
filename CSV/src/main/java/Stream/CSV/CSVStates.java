package Stream.CSV;

import java.io.FileReader;
import java.io.FileWriter;

public class CSVStates {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader fileReader = new FileReader("E:\\eclipse-workspace\\CSV\\StatesList.txt");
			
			FileWriter fileWriter = new FileWriter("E:\\eclipse-workspace\\CSV\\CsvStatesList.csv");
			
			String CsvData = " ";
			
			int i;
			
			while ((i = fileReader.read()) != -1) {
				
				CsvData += (char)i;
			}
			System.out.println(CsvData);
			
			fileWriter.write(CsvData);
			
			fileReader.close();
			fileWriter.close();
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		System.out.println("Process Completed");
	}

}
