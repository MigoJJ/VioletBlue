package je.panse.doro.main;

import je.panse.doro.comm.*;	
import je.panse.doro.hito.StartForm;

public class Enter {
// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");
//	public static String wd = (currentUsersHomeDir + "/je/panse/doro");

	public static String wt  = (wd + "/text");
	public static String wtk = (wd + "/text/knots");
	public static String wts = (wd + "/text/samsara");
	public static String wtt = (wd + "/text/tripikata");
	public static String wds = (wd + "/aeternum/supportdiagnosis");

// ------------------------------------------------------file preparing
	public static void main(String[] args) throws Exception {	
//		CurrentDate.defineDate();
// ------------------------------------------------------GDStm Program starting
		Menu_list.main(Enter.wt + "/singlebeam/StartMenuList");
		StartForm.main(null);
	}
// ----------    
}

