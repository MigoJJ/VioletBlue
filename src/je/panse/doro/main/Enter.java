// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;	
import je.panse.doro.exec.StartForm;
import java.io.IOException;

public class Enter {
	// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
	
	// ------------------------------------------------------file preparing
	public static void main(String[] args) throws IOException {
		CurrentDate.defineTime();
        System.out.println(currentUsersHomeDir);

    	File_cdrw_proc ob1 = new File_cdrw_proc();
	    	ob1.deletefiler(wtf + "/ChartPlate");
	    	ob1.checkfiler(wtf + "/ChartPlate");
	    	ob1.deletefiler(wtf + "/Comment);");
	    	ob1.checkfiler(wtf + "/Comment");
	    	   	
        PlatePrepFirst.main(null);
// ------------------------------------------------------GDStm Program starting
        StartForm.main(null);
// ------------------------------------------------------    
   }
}
