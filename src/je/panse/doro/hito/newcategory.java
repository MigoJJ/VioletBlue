package je.panse.doro.hito;

import java.io.IOException;				
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class newcategory {
// --------------------------------------------	
	public static void main(String args) throws IOException {
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/ChartInputMenu1");
	
    	switching();
	}	
// --------------------------------------------    	
    static void switching() throws IOException {

   		Scanner new_code = new Scanner(System.in);
   			int select_code = 0;

   			while (true) {
   		    	if (select_code == 99) { break; }
   		 	
   		    	System.out.println("Enter selected code number ...   : ");
   		    	select_code = Integer.valueOf(new_code.nextLine().trim());

			switch (select_code) {
				  case 1 : new3CC.main(null);	  	break;
				  case 2 : new4PMH.main(null);  	break;
//						  case "3" : new5SUJ.main(null);  	break;
				  case 4 : new6OBJ.main(null);  	break;
//						  case "5" : new7LAB.main(null);  	break;
//						  case "6" : new8ACC.main(null);  	break;
//						  case "7" : new9PLAN.main(null);  	break;
//						  case "c" : Com.main(null);  	break;
//						  case "q" : InputButton.quitButton(null);  	break;
//						  case "qq" : InputQuitSave.main(null);  	break;
			}
//			new_code.close();
   		}
 // --------------------------------------------
   	}
}