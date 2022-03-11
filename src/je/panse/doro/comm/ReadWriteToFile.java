package je.panse.doro.comm;

import java.io.File;	
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.main.Enter;

public class ReadWriteToFile {
	  public static void readFile(String readf) throws IOException {
		    try {
		      File myObj = new File(readf);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
//		        System.out.println(data);
		        
		        writeFile(Enter.wtf + "/ChartPlate",data);
		      }
		        myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
// ----------------------------------------------------
	  public static void writeFile(String writef, String writed) throws IOException {
		    try {
		      FileWriter myWriter = new FileWriter(writef, true);
		      myWriter.write(writed + "\n");
		      myWriter.close();
//		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
// ----------------------------------------------------
}
