// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;				
import je.panse.doro.exec.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Enter {
	//--- user directory definition--------------------------
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
	
    //--------------------------------------------------------
	public static void main(String[] args) throws IOException {
		CurrentDate.defineTime();
       System.out.println(currentUsersHomeDir);
    // --- File Preparing 
		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
		
       FirstPlate.main(null);
       ManageFile.ucopyfiler();
       
	}
//--------------------------------------------------------
}
