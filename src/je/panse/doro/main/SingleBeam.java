package je.panse.doro.main;

import je.panse.doro.comm.File_cdrw_proc;

public class SingleBeam {
	public static void main(String[] args) throws Exception {
    	File_cdrw_proc cdrw = new File_cdrw_proc(); 
        cdrw.readfiler(Enter.wt + "/singlebeam/SingleBeam");
//       cdrw.readfiler(Enter.wt + "/singlebeam/DoctorLogin");
        Debut.main(null);
        Enter.main(null);
	}
// ----------
}