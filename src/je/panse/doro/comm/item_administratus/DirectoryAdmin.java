package je.panse.doro.comm.item_administratus;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class DirectoryAdmin {
	public static void copy_Directory(String ladir, String nudir) throws IOException {
		try {
			List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");
	
			  for(String fruit:list)  
				  File_cdrw_proc.copyfiler(ladir +fruit, nudir+ fruit );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// ------------------------------------
	static void clear_Directory(String ari) throws Exception {	
		File fin = new File(ari);
		File[] finlist = fin.listFiles();       
	 		for (int n = 0; n < finlist.length; n++) {
	 			if (finlist[n].isFile()) {
	 				System.gc();
	 				Thread.sleep(10);
	 					finlist[n].delete();
		        	SingleBeam st2 = new SingleBeam();
		        	st2.main(null);
	 			}
	 		}
	}
	// ------------------------------------
	public void prepare_ChartPlate() throws IOException {
		File_cdrw_proc nc1 = new File_cdrw_proc();
			nc1.deletefiler(Enter.wts + "/ChartPlate");
			nc1.checkfiler(Enter.wts + "/ChartPlate");
			nc1.deletefiler(Enter.wts + "/Comment);");
			nc1.checkfiler(Enter.wts + "/Comment");
	}
// ----------		
}