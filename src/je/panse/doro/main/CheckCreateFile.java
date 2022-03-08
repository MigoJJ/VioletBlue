package je.panse.doro.main;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CheckCreateFile {
	  public static void main(String wtf) throws IOException {
//		  wtf = (wtf + "/htn");
		  List<String> list=new ArrayList<String>();  
//		  list.add("/lanu/11ChartPlat");  
//		  list.add("/lanu/12Comment");  
		  list.add("/51CC");  
		  list.add("/52PMH");  
		  list.add("/53SUJ");  
		  list.add("/54OBJ");  
		  list.add("/55LAB");  
		  list.add("/56ACC");  
		  list.add("/57PLAN");  
		  for(String fruit:list)  
			   cf(wtf + fruit);
//		      System.out.println(fruit);
	  }
	  
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
}