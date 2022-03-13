package je.panse.doro.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import je.panse.doro.comm.ReadWriteToChartPlate;

public class PlatePrepUpdate {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();  
		  list.add("/3CC");  
		  list.add("/4PMH");  
		  list.add("/5SUJ");  
		  list.add("/6OBJ");  
		  list.add("/7LAB");  
		  list.add("/8ACC");  
		  list.add("/9PLAN");
		  
//		  for(String fruit:list)  
//			  upcopyfiler(fruit);
	// ------------------------------------------------------ChartPlate writing		  
		  for(String fruit:list)
			  	ReadWriteToChartPlate.readFile(Enter.wtf + fruit);
  }
// ----------------------------------
}

