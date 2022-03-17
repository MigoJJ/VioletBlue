package je.panse.doro.hito;

import java.io.IOException;				
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class newcategory {
// --------------------------------------------	
	public void main(String a_code) throws IOException {
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/ChartInputMenu1");
	
    	switching();
	}	
    	
    void switching() throws IOException {

   		Scanner c = new Scanner(System.in); 
   			String a_code = c.nextLine();

			switch (a_code) {
			
			
				  case "1" : new3CC.main(null);
					  	break;
				  case "2" : new4PMH.main(null);  	break;
//						  case "3" : new5SUJ.main(null);  	break;
				  case "4" : new6OBJ.main(null);  	break;
//						  case "5" : new7LAB.main(null);  	break;
//						  case "6" : new8ACC.main(null);  	break;
//						  case "7" : new9PLAN.main(null);  	break;
//						  case "c" : Com.main(null);  	break;
//						  case "q" : InputButton.quitButton(null);  	break;
//						  case "qq" : InputQuitSave.main(null);  	break;
				
				}
		c.close();
// --------------------------------------------
   			}
   		}
