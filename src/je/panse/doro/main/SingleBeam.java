package je.panse.doro.main;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.ClearConsole;

public class SingleBeam {
	public static void main(String[] args) throws Exception {
    	File_cdrw_proc sf1 = new File_cdrw_proc(); 
	    	sf1.readfiler(Enter.wt + "/singlebeam/SingleBeam");
			//sf1.readfiler(Enter.wt + "/singlebeam/DoctorLogin");
    	Debut sf2 = new Debut(); 
	    	sf2.main(null);
	}
// ----------
}