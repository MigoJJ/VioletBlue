package je.panse.doro.hito.newsub;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item.ThyPrescription;
import je.panse.doro.comm.item_exec.CalcDitto;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class New9PLAN {
	public static void main(String args) throws Exception { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/submenu/9PLAN_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : CalcDitto ob3 = new CalcDitto(); ob3.main(null);break;

					case 2  : ThyPrescription ob4 = new ThyPrescription(); ob4.main(null); break;
					case 21 : ThyPrescription.main("/ThySyrPx");
					case 22 : ThyPrescription.main("/ThySyxPx");
					case 23 : ThyPrescription.main("/ThyMetPx");
					case 24 : ThyPrescription.main("/ThyAntPx");
					case 25 : ThyPrescription.main("/ThyCamenPx");
					case 26 : ThyPrescription.main("/ThyIndPx");

			   		case 99 : NineDeux.unnine(); 
						StartForm.main(null); break;
			   		case 999 :
			   			Key_Iwbb st999 = new Key_Iwbb(); 
			   			st999.Key_Iwbb_Page(select_code); break;
					default :System.out.println(" uncertain ... please check  !!");
					}
				Newcategory.main(null); break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}