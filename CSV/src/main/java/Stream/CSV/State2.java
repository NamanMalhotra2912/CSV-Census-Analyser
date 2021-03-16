package Stream.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class State2 {
	
	public static void main(String[] args) throws Exception {
		
//		File file = new File("E:\\eclipse-workspace\\CSV\\StatesList.txt");
//		FileReader fr = new FileReader(file);
		
		FileReader file = new FileReader("E:\\\\eclipse-workspace\\\\CSV\\\\StatesList.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
//		try {
//				FileWriter fileWriter = new FileWriter("E:\\eclipse-workspace\\CSV\\StatesList.csv");
//				CSVWriter writer = new CSVWriter(fileWriter);
				
//				writer.writeAll(line);
				
//				String [] header = {"Id", "Name", "Class", "Marks" };
//				writer.writeNext(header);
//				
//				String[] data1 = {"1","Neeraj", "Mca","100" }; 
//				writer.writeNext(data1);
//				
//				String[] data2 = {"2","Neeraj", "Mca","100" }; 
//				writer.writeNext(data2);
//				
//				String[] data3 = {"3","Neeraj", "Mca","100" }; 
//				writer.writeNext(data3);
//				
//				String[] data4 = {"4","Neeraj", "Mca","100" }; 
//				writer.writeNext(data4);
				
//				writer.close();
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
			
			System.out.println("Process Completed");
		
		
		
	}

}
