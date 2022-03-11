// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;
import je.panse.doro.exec.input.CategoryList;

import java.io.IOException;

public class Enter {
	//--- user directory definition--------------------------
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
<<<<<<< HEAD
<<<<<<< HEAD
	public static String wdt = (currentUsersHomeDir + "/src/je/panse/doro/text");
=======
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
>>>>>>> refs/remotes/origin/frature
=======
	public static String wdt = (currentUsersHomeDir + "/src/je/panse/doro/text");
>>>>>>> branch 'master' of https://github.com/MigoJJ/violetBlue0306.git
	
    //--- file preparing ------------------------------------
	public static void main(String[] args) throws IOException {
       System.out.println(currentUsersHomeDir);
		CurrentDate.defineTime();
<<<<<<< HEAD
<<<<<<< HEAD
=======
       System.out.println(currentUsersHomeDir);
>>>>>>> refs/remotes/origin/frature
=======
>>>>>>> branch 'master' of https://github.com/MigoJJ/violetBlue0306.git

		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
		
       FirstPlatePrepare.main(null);
       ManageFile.ucopyfiler(wtf);
	
// --------------------------------------------------------
       CategoryList.main(null);
	}
// --------------------------------------------------------
}
