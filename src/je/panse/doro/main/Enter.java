// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;				
import je.panse.doro.exec.*;
import java.io.IOException;
import java.nio.file.Path;

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
	
    //--------------------------------------------------------
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

       CheckDeleteFile.main(wtf);
       
       ManageFile.deletefiler(wtf + "/chartplate");
       ManageFile.deletefiler(wtf + "/comment");
       
       CheckCreateFile.main(wtf);
       CheckCreateFile.chartplating(wtf);
       
       FirstPlate.main(null);
       
//       ReadWriteToFile.readFile(wtf +"/hana/3CC");
       
       
//		ManageFile.copyfiler(wf);
	}
//--------------------------------------------------------
}
