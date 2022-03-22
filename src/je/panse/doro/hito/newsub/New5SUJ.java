package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item_exec.CalcBP;
import je.panse.doro.comm.item_exec.CalcHbA1c;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class New5SUJ {
	public static void main(String args) throws IOException { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/submenu/5LAB_list");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;

			while (true) {
			if (select_code == 99) { break; }
		 	
			System.out.println("Enter selected code number ...   : ");
			select_code = Integer.valueOf(new_code.nextLine().trim());

			switch (select_code) {
				case 1 : CalcHbA1c ob3 = new CalcHbA1c(); ob3.main(null);  break;
//				case 2 : new4PMH.main(null);  	break;
//				case "3" : new5SUJ.main(null);  	break;

//				case "5" : new7LAB.main(null);  	break;
//				case "6" : new8ACC.main(null);  	break;
//				case "7" : new9PLAN.main(null);  	break;
				case 9 : NineDeux.unnine(); 			 	 			break;	
			}
			Newcategory.main(null);
		}
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}