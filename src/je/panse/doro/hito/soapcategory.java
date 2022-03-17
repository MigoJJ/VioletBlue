package je.panse.doro.hito;

import java.io.IOException;		
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.HistoryTake.*;
import je.panse.doro.hito.newsub.new3CC;
import je.panse.doro.hito.newsub.new4PMH;
import je.panse.doro.hito.newsub.new6OBJ;
import je.panse.doro.hito.newsub.new8ACC;
import je.panse.doro.main.Enter;

public class soapcategory {
// --------------------------------------------	
	public static void main(String n_code) throws IOException {
    	File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/ChartInputMenu1");
try (Scanner c_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String cn_code = c_code.nextLine();  // Read user input
				
				switch (cn_code) {
						  case "1" : new3CC.main(null);  	break;
						  case "2" : new4PMH.main(null);  	break;
//						  case "3" : Input5SUJ.main(null);  	break;
						  case "4" : new6OBJ.main(null);  	break;
//						  case "5" : Input7LAB.main(null);  	break;
						  case "6" : new8ACC.main(null);  	break;
//						  case "7" : Input9PLAN.main(null);  	break;
//						  
//						  case "c" : InputCom.main(null);  	break;
						  case "q" : InputButton.quitButton(null);  	break;
//						  case "qq" : InputQuitSave.main(null);  	break;
					}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				  }
			}
// --------------------------------------------
}