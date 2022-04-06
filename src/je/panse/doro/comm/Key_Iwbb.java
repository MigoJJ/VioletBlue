package je.panse.doro.comm;

import java.io.IOException;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class Key_Iwbb {
	public void Key_Iwbb_Page(int select_code) throws IOException, Exception {
		File_cw_chart dn1 = new File_cw_chart();
		Newcategory dn2 = new Newcategory();
		StartForm dn3 = new StartForm();
		File_editor_proc dn4 = new File_editor_proc();
		DirectoryAdmin dn5 = new DirectoryAdmin();

		if (select_code == 9) { 
				dn1.deuxnine();
				dn2.main(null);
		 }
		 else if (select_code == 99) {
			 dn1.deuxnine();
			 dn3.main(null);
		  }
		  else if (select_code == 999){
			 dn1.deuxnine();
			 dn3.main(null);
		
			 dn5.clear_Directory(Enter.wts);

		            }
		  else {
		  }
	}
// ----------
}