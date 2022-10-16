package je.panse.doro.main;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.file_DirAdmin;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_administratus.file.File_editor_proc;
import je.panse.doro.comm.item_administratus.key.Key_Press_Any;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.hito.Newcategory;

public class Debut {
	file_DirAdmin	da1 = new file_DirAdmin();
	File_cw_chart 	fcw = new File_cw_chart();
	File_editor_proc	fep = new File_editor_proc();
	Enter				en1 = new Enter();
	Newcategory 		nc1 = new Newcategory();
	public void main(String args) throws Exception {
		try(Scanner case_code = new Scanner(System.in)) {
			while (true) {
				System.out.println(">>> Enter selected number :  >>>");
				int select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
					case 1 : press_Key(Enter.wtsi + "/subsinglebeam/Prologue");break;
					case 2 : press_Key(Enter.wtsi + "/subsinglebeam/VersionInfo");break;
					case 3 : 
							da1.prepare_ChartPlate();
							da1.copy_Directory(Enter.wtk + "/hana", Enter.wts);
							en1.main(null);  	
							break;
						case 31 : callSheet("/knots/hana");break;
						case 32 : callSheet("/knots/soap");break;
					case 4 : 
							da1.copy_Directory(Enter.wtt, Enter.wts);
							fcw.writechart();
							fep.main(Enter.wts + "/ChartPlate");
							Menu_list.main(Enter.wtsi + "/ChartPopUpMenu");
							nc1.main(null);  	
							break; 

					default :
						Key_shortcut.main(select_code);
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
	public void callSheet(String cdir) throws Exception {
		File_cw_chart  ob3 = new File_cw_chart(); 
    	ob3.cleanChartPlate();
		fcw.callchartlist(cdir);
    	Menu_list.main(Enter.wtsi + "/ChartPopUpMenu");
		nc1.main(null); // Items		
	}
	// ----------
}