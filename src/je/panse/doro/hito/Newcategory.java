package je.panse.doro.hito;

import java.util.Scanner;						

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_administratus.Key_shortcut;
import je.panse.doro.comm.item_execute.*;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.*;
import je.panse.doro.fourgate.description.Get_ExceltoJtable02;
import je.panse.doro.fourgate.ros.Rosproc;
import je.panse.doro.fourgate.symptom.subjective_read_data.Symptom12Enter;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class Newcategory {
	public void main(String string) throws Exception {
		try {
	    	switching();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}	

	void switching() throws Exception {
		File_cdrw_proc fcp = new File_cdrw_proc(); 
		try (Scanner new_code = new Scanner(System.in)){
   		while (true) {
		   	System.out.println("Enter selected code number ...   : ");
		   	int select_code = Integer.valueOf(new_code.nextLine().trim());
		   	switch (select_code) {
		   		case 1 : New3CC n31 = new New3CC(); n31.main(null);break;
			   		case 11 :	New3PI n32 = new New3PI(); n32.main(null);break;
			   		case 12 :	Symptom12Enter n33 = new Symptom12Enter(); n33.main(null);break;
			   		case 13 : Rosproc n34 = new Rosproc(); n34.main(null);break;
			   		
		   		case 2 : New4PMH.main(null);break;
				case 3 : New5SUJ.main(null);break;
		   		case 4 : fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		   			New6OBJ.main(null);break;
				case 5 : fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
					New7LAB.main(null);break;
				case 6 : fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/8ASS_List");
					New8ASS.main(null);break;
				case 7 : fcp.readfiler(Enter.wt + "/singlebeam/subnewmenu/9PLAN_List");
					New9PLAN.main(null);break;

				default :
					System.out.println(" uncertain ... please check  !!");
					Key_shortcut.main(select_code);
		   }
//		new_code.close();
   			}
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
    }
 // --------------------------------------------
}
