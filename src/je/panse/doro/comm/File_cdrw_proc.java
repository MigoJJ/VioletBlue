package je.panse.doro.comm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_cdrw_proc   {
// ------------------------------   
	public void checkfiler(String checkf) throws IOException {
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
	public void deletefiler(String deletef) throws IOException { 
		File dfiler = new File(deletef); 
		if( dfiler.exists() ){ 
			if(dfiler.delete()){ System.out.println("successfully deleting file ~~^^"); 
			}
			else{ System.out.println("Fail to delete file ^^"); } 
			}
		else{ System.out.println("No exsisting files ~~"); } 
	}
// ------------------------------
	public void copyfiler(String copyfo, String copyft) throws IOException {
		// 1. 원본 File, 복사할 File 준비
	    File orifile = new File(copyfo); 
		File newFile = new File(copyft);
		// 2. 복사
		 Files.copy(orifile.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}
// ------------------------------
	public void readfiler(String readf) {
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
	  public void rwfiler(String rwfileo, String rwfilet) throws IOException {
		    try {
		      File myObj = new File(rwfileo);
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        
		        writefiler(rwfilet ,data);
		      }
		     
		      myReader.close();
		    
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
//----------------------------------------------------
	  public void writefiler(String writef, String writed) throws IOException {
		    try {
		      FileWriter myWriter = new FileWriter(writef, true);
		      myWriter.write("\n" + writed + "\n");
		      myWriter.close();
//		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
//----------------------------------------------------
		public void formdircopier(String fdc) throws IOException {
			List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");
		// ------------------------------------------------------Form Files Copying	
			  for(String fruit:list)  
				  copyfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/text/form/hana" + fruit, 
						  "/home/migowj/git/violetBlue0306/src/je/panse/doro/text/form" + fruit);
		// ------------------------------------------------------ChartPlate writing		  
			  for(String fruit:list)  
				  rwfiler("/home/migowj/git/violetBlue0306/src/je/panse/doro/text/form/" + fruit, 
						  "/home/migowj/git/violetBlue0306/src/je/panse/doro/text/form/ChartPlate");
		}
//----------------------------------------------------
}
