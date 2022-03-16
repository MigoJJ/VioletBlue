package je.panse.doro.comm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

class File_cdrw_proc   {
    String instanceVariable;
    
    File_cdrw_proc(String num)    {
        this.instanceVariable = num;
    }
    void printInstanceVariable()    {
        System.out.println("Value of Instance Variable is "+instanceVariable);
    }
// ------------------------------   
	void checkfiler(String checkf) throws IOException {
			try {
				File cfiler = new File(checkf);
				if (cfiler.createNewFile()) {
					System.out.println("File created: " + cfiler.getName());
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
// ------------------------------   	
	void deletefiler(String deletef) throws IOException { 
		File dfiler = new File(deletef); 
		if( dfiler.exists() ){ 
			if(dfiler.delete()){ System.out.println("successfully deleting file ~~^^"); 
			}
			else{ System.out.println("Fail to delete file ^^"); } 
			}
		else{ System.out.println("No exsisting files ~~"); } 
	}
// ------------------------------
	void copyfiler(String copyfo, String copyft) throws IOException {
		// 1. 원본 File, 복사할 File 준비
	    File orifile = new File(copyfo); 
		File newFile = new File(copyft);
		// 2. 복사
		 Files.copy(orifile.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
// ------------------------------
	void readfiler(String readf) {
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
// ------------------------------	
}
