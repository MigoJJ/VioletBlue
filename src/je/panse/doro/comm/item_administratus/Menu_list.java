package je.panse.doro.comm.item_administratus;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_ClearConsoleScreen;
import je.panse.doro.comm.item_administratus.loop.CurrentDate;
import je.panse.doro.main.Enter;

public class Menu_list {
	public static void main(String menulist) {
		Key_ClearConsoleScreen ccs = new Key_ClearConsoleScreen();
			ccs.main(null);
		System.out.println("\r" + Enter.currentUsersHomeDir);
		CurrentDate.defineTime();
		File_cdrw_proc fcp = new File_cdrw_proc(); 
			fcp.readfiler(menulist);
	}
}
