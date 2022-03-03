package je.panse.doro.comm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import je.panse.doro.main.Enter;

public class ManageFileAppend {
	   public static void main(String writef) {
	      BufferedWriter bw = null;
	      try {
			 String mycontent = writef;
			 File file = new File(Enter.wcf);
				  if (!file.exists()) {
				     file.createNewFile();
				  }
			  FileWriter fw = new FileWriter(file);
			  bw = new BufferedWriter(fw);
			  bw.write(mycontent);
			  		System.out.println("File written Successfully");
	       } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
		    	  	bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		 }
	   }
	}