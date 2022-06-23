package je.panse.doro.main;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.File_editor_proc;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.comm.item_administratus.Key_Press_Any;
import je.panse.doro.hito.Newcategory;

public class Debut {
	public void main(String[] args) throws Exception {
		DirectoryAdmin	da1 = new DirectoryAdmin();
		File_cw_chart 	fcw = new File_cw_chart();
		File_editor_proc	fep = new File_editor_proc();
		Enter				en1 = new Enter();
		Newcategory 		nc1 = new Newcategory();

		try(Scanner case_code = new Scanner(System.in)) {
			while (true) {
				System.out.println(">>> Enter selected number :  >>>");
				int select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
					case 1 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
					case 2 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
					case 3 : 
							da1.prepare_ChartPlate();
							da1.copy_Directory(Enter.wtk + "/hana", Enter.wts);
							en1.main(null);  	
							break;
					case 4 : 
							da1.copy_Directory(Enter.wtt, Enter.wts);
							fcw.writechart();
							fep.main(Enter.wt + "/samsara/ChartPlate");
							Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
							nc1.main(null);  	
							break; 
							
						case 31 :
							File_cw_chart  ob3 = new File_cw_chart(); 
					    	ob3.cleanChartPlate();
							fcw.callchartlist("/knots/hana");
					    	Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
							nc1.main(null);break; // Items		
						
						case 32 :
							File_cw_chart  ob4 = new File_cw_chart(); 
					    	ob4.cleanChartPlate();
							fcw.callchartlist("/knots/soap");
					    	Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
							nc1.main(null);break; // Items		
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