package je.panse.doro.main;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.ClearConsole;

public class SingleBeam {
	public static void main(String[] string) throws Exception {
    	File_cdrw_proc sb1 = new File_cdrw_proc(); 
	    	sb1.readfiler(Enter.wt + "/singlebeam/SingleBeam");
			//sf1.readfiler(Enter.wt + "/singlebeam/DoctorLogin");
    	Debut sb2 = new Debut(); 
	    	sb2.main(null);
	}
// ----------
}