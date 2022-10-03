package je.panse.doro.hito.newsub;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_administratus.Key_shortcut;
import je.panse.doro.comm.item_execute.CalcASS;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class New8ASS {
	public static void main(String args) throws Exception { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/subnewmenu/8ASS_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : 
						CalcASS ob3 = new CalcASS();	 ob3.main(null);break;

					default :
						System.out.println(" uncertain ... please check  !!");
						Key_shortcut.main(select_code);
				}
				StartForm.main(null);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}
