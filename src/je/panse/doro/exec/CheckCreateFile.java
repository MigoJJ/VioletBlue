package je.panse.doro.exec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckCreateFile {
	  public static void main(String wtf) throws IOException {
		  List<String> list=new ArrayList<String>();  
		  list.add("/3CC");  
		  list.add("/4PMH");  
		  list.add("/5SUJ");  
		  list.add("/6OBJ");  
		  list.add("/7LAB");  
		  list.add("/8ACC");  
		  list.add("/9PLAN");  
		  for(String fruit:list)  
			   cf(wtf + fruit);
//		      System.out.println(fruit);
	  }
// ------------------------------------------
	static void cf(String file1) {	
    	try {
	      File file = new File(file1);
	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
    	} catch (IOException e) {
	      e.printStackTrace();
	}
  }
	// ------------------------------------------
	  public static void chartplating(String wtf) throws IOException {
		  List<String> list=new ArrayList<String>();  
		  list.add("/ChartPlat");  
		  list.add("/Comment");  
		  for(String fruit:list)  
			   cf(wtf + fruit);
//	      System.out.println(fruit);
	  }
// ------------------------------------------
}