package je.panse.doro.main;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.File_editor_proc;
import je.panse.doro.comm.Key_Press_Any;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.hito.Newcategory;

public class Debut {
	public void main(String[] args) throws Exception {
<<<<<<< HEAD
		DirectoryAdmin de2 = new DirectoryAdmin();
		Newcategory    de3 = new Newcategory();
		try (Scanner case_code = new Scanner(System.in)) {
=======
		DirectoryAdmin 	de2  = new DirectoryAdmin();
		Newcategory 		de3  = new Newcategory();
		File_cw_chart 	fcwc = new File_cw_chart();
		File_editor_proc  dn4 = new File_editor_proc();
		try(Scanner case_code = new Scanner(System.in)) {
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/0407_up
			int select_code = 0;
 			
=======
>>>>>>> refs/remotes/origin/0407_up
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				int select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
					case 1 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
					case 2 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
					case 3 : de2.prepare_ChartPlate();
							  de2.copy_Directory(Enter.wtk + "/hana", Enter.wts);
							Enter.main(null);  	
							break;
					case 4 : de2.copy_Directory(Enter.wtt, Enter.wts);
<<<<<<< HEAD
							  de3.main(null);  	
=======
							fcwc.writechart();
							dn4.main(Enter.wt + "/tripikata/ChartPlate");
							de3.main(null);  	
>>>>>>> refs/remotes/origin/0407_up
							break; 
					default :System.out.println(" uncertain ... please check  !!");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public void press_Key(String openf) throws Exception {
		File_cdrw_proc cdrw = new File_cdrw_proc(); 
		cdrw.readfiler(openf);
		Key_Press_Any.main(null);
		SingleBeam.main(null);		
	}
// ----------
}