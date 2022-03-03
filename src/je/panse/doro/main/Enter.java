// Jae Joon Koh M.D.
package je.panse.doro.main;

import je.panse.doro.comm.*;				
import je.panse.doro.exec.*;

import java.io.BufferedWriter;
import java.io.IOException;

public class Enter {
	//--- user directory definition--------------------------------------------
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");
	
	public static String wf    = (wd + "/text/form/History_taking_list");
	public static String wcf   = (wd + "/text/chart.txt");
	public static String wcc   = (wd + "/text/form/1CC");
	public static String wpmh  = (wd + "/text/form/2PMH");	
	public static String whab  = (wd + "/text/form/3HAB");
	public static String wbmi  = (wd + "/text/form/4BMI");
	public static String wbp   = (wd + "/text/form/5BP");
	public static String wlab  = (wd + "/text/form/6LAB");
	public static String wacc  = (wd + "/text/form/7ACC");
	public static String wplan = (wd + "/text/form/8PLAN");
    //------------------------------------------------------------------------------------
	public static void main(String[] args) throws IOException {
		CurrentDate.defineTime();
        System.out.println(wf);

		ManageFile.deletefiler(wcf);
		ManageFile.checkfiler(wcf);
		ManageFile.readfiler(wf);

		StartForm.main(wf);
	}
}
