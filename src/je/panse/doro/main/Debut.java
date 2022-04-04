package je.panse.doro.main;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Press_Any;
import je.panse.doro.hito.Newcategory;

public class Debut {
	public void main(String[] args) throws Exception {
		try (Scanner case_code = new Scanner(System.in)) {
			int select_code = 0;
 			
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
					case 1 : File_cdrw_proc cdrw = new File_cdrw_proc(); 
							cdrw.readfiler(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
							Key_Press_Any.main(null);
							SingleBeam.main(null);		
					case 2 : File_cdrw_proc de1 = new File_cdrw_proc(); 
							de1.readfiler(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
							Key_Press_Any.main(null);
							SingleBeam.main(null);							
					case 3 : File_cw_chart de2 = new File_cw_chart();
							de2.cleanChartPlate();
							File_cw_chart de3 = new File_cw_chart();
							de3.callchartlist("/knots/hana");
						Enter.main(null);  	
						break;
						
					case 4 : File_cw_chart de4 = new File_cw_chart();
							de4.cleanChartPlate();
					       File_cw_chart de5 = new File_cw_chart();
					       de5.callchartlist("/tripikata");
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
// ----------
}