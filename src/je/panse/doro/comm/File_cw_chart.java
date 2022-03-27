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
			  nu1.copyfiler(Enter.wtk + laname +fruit, Enter.wts + fruit);
   }
	// --------------------------------------------Write Files To Chart	
	public void writechart() throws IOException {
		File_cdrw_proc nu9 = new File_cdrw_proc();
		List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");

			  for(String fruit:list)  
			  nu9.rwfiler(Enter.wts + fruit, Enter.wts + "/ChartPlate");
	}
// ------------------------------------------------Backup Files
	public void chartbackup() throws IOException {
		File_cdrw_proc nu3 = new File_cdrw_proc();
		List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");
			  list.add("/ChartPlate");
			  list.add("/Comment");

			  for(String fruit:list)
				  nu3.copyfiler(Enter.wts + fruit, Enter.wt + "/tripikata" + fruit +".txt");
	}
// ------------------------------------------------Clean ChatPlate
	public void cleanChartPlate() throws IOException {
		File_cdrw_proc nc1 = new File_cdrw_proc();
			nc1.deletefiler(Enter.wts + "/ChartPlate");
			nc1.checkfiler(Enter.wts + "/ChartPlate");
			nc1.deletefiler(Enter.wts + "/Comment);");
			nc1.checkfiler(Enter.wts + "/Comment");
	}
// ----------------------------------------------------------
}