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
import je.panse.doro.comm.File_editor_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.main.Enter;

public class ThyPrescription {
	public static void main(String presd) throws Exception {
		File_cdrw_proc tp1 = new File_cdrw_proc();
		tp1.readfiler(Enter.wd +"/aeternum/thyroid/fourgate" + presd);
		
		Path path = Paths.get(Enter.wd +"/aeternum/thyroid/prescriptlist");
		String pathf = (Enter.wd +"/aeternum/thyroid/prescriptlist");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (select_code != 9) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 21  : File_editor_proc.linepickup(path + "/ThySyrPx", Enter.wts+ "/9PLAN" );break;
					case 22  : File_editor_proc.linepickup(path + "/ThySyxPx", Enter.wts+ "/9PLAN" );break;
					case 23  : File_editor_proc.linepickup(path + "/ThyMetPx", Enter.wts+ "/9PLAN" );break;
					case 24  : File_editor_proc.linepickup(path + "/ThyAntPx", Enter.wts+ "/9PLAN" );break;
					case 25  : File_editor_proc.linepickup(path + "/ThyCamenPx", Enter.wts+ "/9PLAN" );break;
					case 26  : File_editor_proc.linepickup(path + "/ThyIndPx", Enter.wts+ "/9PLAN" );break;
			   		case 9 : case 99 : case 999 :
			   			Key_Iwbb st999 = new Key_Iwbb();
			   			st999.Key_Iwbb_Page(select_code); break;
					default :System.out.println(" uncertain ... please check  !!");
					}
				}
			}
	}
	// ----------	
	static void tfiler(String readf) {
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
			int i=0;	
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				i++;
				System.out.print(".[ " + i + " ]..");
				System.out.println(data);
			}
	       myReader.close();
	       
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }

	       
	   	static void selectfiler(Path rrr) throws IOException {
			Stream<String> lBl = Files.lines(rrr);
			Scanner myPx = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter Px number : ");
			String choicePx = myPx.nextLine();  // Read user input
			System.out.println("Px number is : " + choicePx);  // Output user input
			
			int choicePxi = Integer.parseInt(choicePx);
			String nthPx = lBl.skip(choicePxi -1).findFirst().get();
			System.out.println(nthPx);
			
			File_cdrw_proc tp2 = new File_cdrw_proc();
			tp2.writeliner(Enter.wt + "/samsara/9PLAN", nthPx);	
	       

    }
//	static void writefiler(String writef, String writed) throws IOException {
//	    try {
//	      FileWriter myWriter = new FileWriter(writef, true);
//	      myWriter.write(writed+ "\n");
//	      myWriter.close();
////		      System.out.println("Successfully wrote to the file.");
//	    } catch (IOException e) {
//	      System.out.println("An error occurred.");
//	      e.printStackTrace();
//	    }
//	 }
// ----------	
}