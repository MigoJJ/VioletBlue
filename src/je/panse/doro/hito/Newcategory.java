package je.panse.doro.hito;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class Newcategory {
// --------------------------------------------	
	public void main(String args) throws IOException {
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
	
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
		   		case 1 : New3CC.main(null);	  				break;
		   		case 2 : New4PMH.main(null);  				break;
//						  case "3" : new5SUJ.main(null);  	break;
		   		case 4 : New6OBJ.main(null);  				break;
//						  case "5" : new7LAB.main(null);  	break;
//						  case "6" : new8ACC.main(null);  	break;
//						  case "7" : new9PLAN.main(null);  	break;
//						  case "c" : Com.main(null);  		break;
		   		case 9 : 
				    File_cw_chart ari2 = new File_cw_chart();	 
		  				ari2.writechart();
		   			File_cw_chart nu3 = new File_cw_chart();
	    				nu3.chartbackup();

			  		StartForm fe1 = new StartForm();
		  				fe1.main("");  				; 		break;
		   	}
		new_code.close();
   		}
    }
 // --------------------------------------------
}