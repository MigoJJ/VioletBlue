package je.panse.doro.comm;

import je.panse.doro.main.Enter;	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.util.Scanner;

public class ManageFile {
// -------------------------------------------
	public static void checkfiler(String checkf) throws IOException {
		try {
			File checklist = new File(checkf);
			if (checklist.createNewFile()) {
				System.out.println("File created: " + checklist.getName());
			} 
			else {
				System.out.println("File already exists.");
			}
		} 
		catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
		}
	}			
// -------------------------------------------
	public static void readfiler(String readf) {
		try{
				File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
	
				while (myReader.hasNextLine()) {
						String data = myReader.nextLine();
						System.out.println(data);
				}
		       myReader.close();
			} 
			catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
			}
    }	
// -------------------------------------------	
	public static void ucopyfiler(String copyf) throws IOException {	
		    System.out.println(copyf); 
			// 1. 원본 File, 복사할 File 준비
		    File file = new File(copyf+ "/ChartPlate"); 
			File newFile = new File(Enter.wd + "/text/back/" + "chart-" + CurrentDate.save_time +".txt");
			// 2. 복사
			 Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
// -------------------------------------------
	public static void deletefiler(String deletef) throws IOException { 
			File dfile = new File(deletef); 
			if( dfile.exists() ){ 
				if(dfile.delete()){ System.out.println("successfully deleting file ~~^^"); 
				}
				else{ System.out.println("Fail to delete file ^^"); } 
				}
			else{ System.out.println("No exsisting files ~~"); } 
			}
// -------------------------------------------
}
