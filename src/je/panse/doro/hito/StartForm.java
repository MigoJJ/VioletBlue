package je.panse.doro.hito;

import java.util.Scanner;	

import je.panse.doro.aeternum.thyroid.ThyPrescription;
import je.panse.doro.comm.*;
import je.panse.doro.comm.item_administratus.ClearConsole;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String[] string) throws Exception {
    	System.out.println(System.lineSeparator().repeat(10));

		File_cdrw_proc st1 = new File_cdrw_proc(); 
		Newcategory st2 = new Newcategory(); 
		File_cw_chart st3 = new File_cw_chart();
		ThyPrescription st4 = new ThyPrescription(); 
		Key_Iwbb st5 = new Key_Iwbb(); 
		
		st1.readfiler(Enter.wt + "/singlebeam/StartMenuList");

		try (Scanner case_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(case_code.nextLine());
			
				switch (select_code) {
					case 1 : st2.main(null);break;
					case 2 : st3.callchartlist("/knots/soap");
							  st2.main(null);break;
					case 3 : break;  // Disease Category
					case 4 : st4.main("/ThyroidStart");break; // Items		
			   		case 999:st5.Key_Iwbb_Page(select_code);	break;
					default :System.out.println(" uncertain ... please check  !!");
				}
			}	
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    }
// ----------
}