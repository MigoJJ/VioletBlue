// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;				
import je.panse.doro.exec.*;
import java.io.IOException;
import java.nio.file.Path;

public class Enter {
	//--- user directory definition--------------------------
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");
	
	public static String wf    = (wd + "/text/StartMenuList");
	public static String wcf   = (wd + "/text/chart.txt");
	public static String wcc   = (wd + "/text/form/NEW/1CC");
	public static String wpmh  = (wd + "/text/form/NEW/2PMH");	
	public static String whab  = (wd + "/text/form/NEW/3HAB");
	public static String wbmi  = (wd + "/text/form/NEW/4BMI");
	public static String wbp   = (wd + "/text/form/NEW/5BP");
	public static String wlab  = (wd + "/text/form/NEW/6LAB");
	public static String wacc  = (wd + "/text/form/NEW/7ACC");
	public static String wplan = (wd + "/text/form/NEW/8PLAN");
    //--------------------------------------------------------
	public static void main(String[] args) throws IOException {
		CurrentDate.defineTime();
        System.out.println(wf);

		ManageFile.deletefiler(wcf);
		ManageFile.checkfiler(wcf);
		ManageFile.readfiler(wf);

		StartForm.main(wf);
		
		ManageFile.copyfiler(wf);
	}
//--------------------------------------------------------
}
