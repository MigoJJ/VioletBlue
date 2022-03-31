package je.panse.doro.aeternum.thyroid;

import java.io.File;	
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;	
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Press_Any;
import je.panse.doro.hito.newsub.New9PLAN;
import je.panse.doro.main.Enter;

public class ThyPrescription {
	public static void main(String presd) throws Exception {
		File_cdrw_proc tp1 = new File_cdrw_proc();
		tp1.readfiler(Enter.wd +"/aeternum/thyroid/fourgate" + presd);
//		Path path = Paths.get(Enter.wd +"/aeternum/thyroid/fourgate" + presd);
		Key_Press_Any.main(null);		
			

		
		
		
	}
	// ----------	
	static void readfiler(String readf) {
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
			int i=0;	
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				i++;
				System.out.print("  [ " + i + " ]  ");
				System.out.println(data);
			}
	       myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }
	
	static void writefiler(String writef, String writed) throws IOException {
	    try {
	      FileWriter myWriter = new FileWriter(writef, true);
	      myWriter.write(writed+ "\n");
	      myWriter.close();
//		      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 }
// ----------	
}