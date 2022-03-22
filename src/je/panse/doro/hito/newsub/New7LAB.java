package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item_exec.CalcChol;
import je.panse.doro.comm.item_exec.CalcHbA1c;
import je.panse.doro.comm.item_exec.CalcTFT;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New7LAB {
	public static void main(String args) throws IOException { 
		File_cdrw_proc nl1 = new File_cdrw_proc(); 
    	nl1.readfiler(Enter.wt + "/singlebeam/submenu/7LAB_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;

			while (true) {
		 	
			System.out.println("Enter selected code number ...   : ");
			select_code = Integer.valueOf(new_code.nextLine().trim());
			switch (select_code) {
		  	case 1 : CalcHbA1c  nl2 = new CalcHbA1c(); 
		  				nl2.main(null);	  	break;
			case 2 : CalcTFT  nl3 = new CalcTFT(); 
						nl3.main(null);	  	break;
			case 3 : CalcChol nl4 = new CalcChol();
						nl4.main(null);	  	break;
//				case 2 : CalcBP ob3 = new CalcBP(); 
//						ob3.main(null); 				break;
//			  case 2 : new4PMH.main(null);  	break;
//					  case "3" : new5SUJ.main(null);  	break;

//					  case "5" : new7LAB.main(null);  	break;
//					  case "6" : new8ACC.main(null);  	break;
//					  case "7" : new9PLAN.main(null);  	break;
//					  case "c" : Com.main(null);  	break;
//					  case "q" : InputButton.quitButton(null);  	break;
//					  case "qq" : InputQuitSave.main(null);  	break;
				case 9 : NineDeux.unnine(); 
						Newcategory.main(null); break;							
			}
			

					}
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
// ----------
}
