package je.panse.doro.comm;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import je.panse.doro.main.Enter;

public class WriteToFile2 {  
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();  
		  list.add("/3CC");  
		  list.add("/4PMH");  
		  list.add("/5SUJ");  
		  list.add("/6OBJ");  
		  list.add("/7LAB");  
		  list.add("/8ACC");  
		  list.add("/9PLAN");  
		  for(String lff1:list)
			  System.out.println(lff1);
  }
  
	public static void fileObj(String[] args) throws IOException {
		
	
	}
}

