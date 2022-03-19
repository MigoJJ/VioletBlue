package je.panse.doro.comm;

import java.io.IOException;	
import java.util.ArrayList;
import java.util.List;
import je.panse.doro.main.Enter;

public class File_cw_chart {
	// -------------------------------------------Form Files Copying
	public void callchartlist(String laname) throws IOException {
	   File_cdrw_proc nu1 = new File_cdrw_proc();
	   List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");

			  for(String fruit:list)  
			  nu1.copyfiler(Enter.wtf + laname +fruit, Enter.wtf + fruit);
   }
	// ------------------------------------------------------Form Files Copying	
	public void writechart() throws IOException {
		File_cdrw_proc nu2 = new File_cdrw_proc();
		List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");

			  for(String fruit:list)  
			  nu2.rwfiler(Enter.wtf + fruit,Enter.wtf + "/ChartPlate");
	}
// ----------------------------------------------------------
	public void writechartbu(String origin, String target) throws IOException {
		File_cdrw_proc nu2 = new File_cdrw_proc();
		List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");

			  for(String fruit:list)  
			  nu2.rwfiler(Enter.wtf + fruit, Enter.wtf + "/tripikata" + fruit);
	}
// ----------------------------------------------------------
}