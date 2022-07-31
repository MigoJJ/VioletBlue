package je.panse.doro.hito.newsub;

import java.util.Scanner;		

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.fourgate.thyroid.prescription.ThyPrescription;
import je.panse.doro.main.Enter;

public class New9PLAN {
	public static void main(String args) throws Exception { 
		File_cdrw_proc  ob2 = new File_cdrw_proc();
		CalcDitto       ob3 = new CalcDitto();
		ThyPrescription ob4 = new ThyPrescription(); 
		Key_Iwbb        st999 = new Key_Iwbb();
		
//		ob2.readfiler(Enter.wt + "/singlebeam/DisMenu");
		
    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println(">>>-----Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : ob3.main(null);break;
					case 2 : ob4.main("/ThyroidStart"); break;

			   		case 9 : case 99 : case 999 :
		   				st999.Key_Iwbb_Page(select_code); break;
					default :
						System.out.println(" uncertain ... please check  !!");
					}
				New9PLAN.main(null); break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}