package je.panse.doro.main;

import je.panse.doro.comm.*;			
import je.panse.doro.hito.StartForm;

public class Enter {
// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt  = (wd + "/text");
	public static String wtk = (wd + "/text/knots");
	public static String wts = (wd + "/text/samsara");
	public static String wtt = (wd + "/text/tripikata");

// ------------------------------------------------------file preparing
	public static void main(String[] args) throws Exception {	
		System.out.println(currentUsersHomeDir);
		CurrentDate.defineTime();
//		CurrentDate.defineDate();
// ------------------------------------------------------GDStm Program starting
       StartForm.main(null);
	}
// ----------    
}

