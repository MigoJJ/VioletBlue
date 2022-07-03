package je.panse.doro.comm;

import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.comm.item_administratus.CurrentDate;
import je.panse.doro.main.Enter;

public class Menu_list {

	public static void main(String menulist) {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
			ccs.main(null);
		File_cdrw_proc fcp = new File_cdrw_proc(); 
			fcp.readfiler(menulist);
		System.out.println("\r" + Enter.currentUsersHomeDir);
		CurrentDate.defineTime();
	}
// ----------
}
