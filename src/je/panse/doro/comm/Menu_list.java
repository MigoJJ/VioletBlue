package je.panse.doro.comm;

import je.panse.doro.main.Enter;

public class Menu_list {

	public static void main(String menulist) {
		File_cdrw_proc fcp = new File_cdrw_proc(); 
		fcp.readfiler(menulist);
	}
// ----------
}
