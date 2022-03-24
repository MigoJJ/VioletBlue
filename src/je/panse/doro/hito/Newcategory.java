package je.panse.doro.hito;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class Newcategory {
// --------------------------------------------	
	public static void main(String agrs) throws IOException {
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
	
    	switching();
	}	
// --------------------------------------------    	
    static void switching() throws IOException {
   		Scanner new_code = new Scanner(System.in);
   		int select_code = 0;

   		while (true) {
//		   	if (select_code == 99) { break; }
		 	
		   	System.out.println("Enter selected code number ...   : ");
		   	select_code = Integer.valueOf(new_code.nextLine().trim());
	
		   	switch (select_code) {
		   		case 1 : New3CC.main(null);	  	break;
		   		case 2 : New4PMH.main(null);  	break;
				case 3 : New5SUJ.main(null);  	break;
		   		case 4 : New6OBJ.main(null);  	break;
				case 5 : New7LAB.main(null);  	break;
				case 6 : New8ACC.main(null);  	break;
				case 7 : New9PLAN.main(null);  	break;
//						  case "c" : Com.main(null);  		break;
		   		case 9 : NineDeux.unnine(); 
		   					StartForm.main(null); break;
		   		case 99 :NineDeux.deuxnine();  	
		   					Enter.main(null); break;
				default :System.out.println(" uncertain ... please check  !!");

		   	}
		new_code.close();
   		}  //while
    }
 // --------------------------------------------
}