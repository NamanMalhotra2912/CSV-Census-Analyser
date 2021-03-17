package Stream.CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StateCensusAnalyser {

	public static void main(String[] args) throws IOException {
		 
		FileReader file = new FileReader("E:\\eclipse-workspace\\CSV\\StatesList.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
		System.out.println("Process Completed");
	}

}
