package je.panse.doro.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import je.panse.doro.comm.File_cdrw_proc;

public class PlatePrepFirst {
	public static void main(String[] args) throws IOException {
		
    	File_cdrw_proc ob1 = new File_cdrw_proc();

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
			  ob1.copyfiler(Enter.wtf + "/hana" +fruit, Enter.wtf + fruit);
  }
// ----------------------------------------------------------
}

