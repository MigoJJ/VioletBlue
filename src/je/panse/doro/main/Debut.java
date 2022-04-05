package je.panse.doro.main;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Press_Any;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.hito.Newcategory;

public class Debut {
	public void main(String[] args) throws Exception {
		try (Scanner case_code = new Scanner(System.in)) {
			int select_code = 0;
 			
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
					case 1 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
					case 2 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
					case 3 : DirectoryAdmin de2 = new DirectoryAdmin();
							de2.prepare_ChartPlate();
							DirectoryAdmin de3 = new DirectoryAdmin();
							de3.copy_Directory(Enter.wtk + "/hana", Enter.wts);
							Enter.main(null);  	
							break;
					case 4 : DirectoryAdmin de4 = new DirectoryAdmin();
							de4.copy_Directory(Enter.wtt, Enter.wts);
							Newcategory.main(null);  	
							break; 
						
				 	case 9 : 
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