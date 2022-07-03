package je.panse.doro.main;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.CalcASS;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_execute.lab7.CalcBP;
import je.panse.doro.comm.item_execute.lab7.CalcHbA1c;
import je.panse.doro.hito.newsub.*;

public class RecoveryNewcategory {
// --------------------------------------------	
	public static void main(String agrs) throws Exception {
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
		File_cw_chart ob3 = new File_cw_chart(); 
    	ob3.cleanChartPlate();
    	File_cw_chart st3 = new File_cw_chart();
		st3.callchartlist(Enter.wt + "/stripikata");
	
    	switching();
	}	
// --------------------------------------------    	
    static void switching() throws Exception {
   		Scanner new_code = new Scanner(System.in);
   		int select_code = 0;

   		while (true) {
//		   	if (select_code == 99) { break; }
		 	
		   	System.out.println("Enter selected code number ...   : ");
		   	select_code = Integer.valueOf(new_code.nextLine().trim());
	
		   	switch (select_code) {
	   		case 1 : New3CC nc1 = new New3CC();	 	nc1.main(null);	  	break;
		   		case 2 : New4PMH.main(null);  	break;
				case 3 : New5SUJ.main(null, null);  	break;
		   		case 4 : New6OBJ.main(null);  	break;
				case 5 : New7LAB.main(null);  	break;
				case 6 : New8ASS.main(null);  	break;
				case 7 : New9PLAN.main(null);  	break;

				case 42 : CalcBP ob1 = new CalcBP();	 	ob1.main(null);break;
				case 51 : CalcHbA1c ob2 = new CalcHbA1c();ob2.main(null);break;
				case 61 : CalcASS ob3 = new CalcASS();	 	ob3.main(null);break;
				case 71 : CalcDitto ob4 = new CalcDitto();ob4.main(null);break;
				
		   		case 9 : case 99: case 999 :	
		   			Key_Iwbb st999 = new Key_Iwbb(); 
		   			st999.Key_Iwbb_Page(select_code); break;
				default :System.out.println(" uncertain ... please check  !!");
		   	}
//		new_code.close();
   		}
   	}
 // --------------------------------------------
}