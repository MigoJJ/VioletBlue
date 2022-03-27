package je.panse.doro.comm.item;

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
import je.panse.doro.hito.newsub.New9PLAN;
import je.panse.doro.main.Enter;

public class ThyPrescription {

	public static void main(String presd) throws Exception {
		try {
			
			readfiler(Enter.wt + "/singlebeam/subnewmenu/9PLANs" + presd);
			
			Path path = Paths.get(Enter.wt + "/singlebeam/subnewmenu/9PLANs" + presd);
			Stream<String> lBl = Files.lines(path);
				    Scanner myPx = new Scanner(System.in);  // Create a Scanner object
				    System.out.println("Enter Px number : ");
				    String choicePx = myPx.nextLine();  // Read user input
				    System.out.println("Px number is : " + choicePx);  // Output user input
					
				    int choicePxi = Integer.parseInt(choicePx);
					String nthPx = lBl.skip(choicePxi -1).findFirst().get();
					System.out.println(nthPx);
			
				writefiler(Enter.wt + "/samsara/9PLAN", nthPx);	
					
					New9PLAN.main(null);

//			myPx.close();			
//			lBl.close();
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
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
				System.out.print(i + " ]  ");
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