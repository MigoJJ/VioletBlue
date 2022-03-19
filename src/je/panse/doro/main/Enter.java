// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;
import je.panse.doro.hito.StartForm;

import java.io.IOException;

public class Enter {
	// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
	// ------------------------------------------------------file preparing
	public static void main(String[] args) throws IOException {
       System.out.println(currentUsersHomeDir);
		CurrentDate.defineTime();
        System.out.println(currentUsersHomeDir);

    	File_cdrw_proc ari1 = new File_cdrw_proc();
	    	ari1.deletefiler(wtf + "/ChartPlate");
	    	ari1.checkfiler(wtf + "/ChartPlate");
	    	ari1.deletefiler(wtf + "/Comment);");
	    	ari1.checkfiler(wtf + "/Comment");
	    	   	
	    	File_cw_chart ari2 = new File_cw_chart();	
	    	ari2.callchartlist("/hana");
//	    	ari2.writechart();
// ------------------------------------------------------GDStm Program starting
        StartForm.main(null);
	}
// ------------------------------------------------------    
}

