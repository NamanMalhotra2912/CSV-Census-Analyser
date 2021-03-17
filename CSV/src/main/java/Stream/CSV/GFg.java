package Stream.CSV;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GFg { 

 public static void main(String[] args) 
 { 
          try { 

         FileReader fr = new FileReader("E:\\eclipse-workspace\\CSV\\StatesList.txt"); 

         FileWriter fw = new FileWriter("E:\\eclipse-workspace\\CSV\\StatesList.csv"); 

         String str = ""; 

         int i; 

         while ((i = fr.read()) != -1) { 
             str += (char)i; 
         } 

         System.out.println(str); 

         fw.write(str); 
         fr.close(); 
         fw.close(); 

         System.out.println( 
             "File reading and writing both done"); 
     } 
     catch (IOException e) { 
         System.out.println( 
             "There are some IOException"); 
     } 
 } 
}