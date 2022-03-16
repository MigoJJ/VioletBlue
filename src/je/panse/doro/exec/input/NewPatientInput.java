package je.panse.doro.exec.input;

import java.io.IOException;		
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.HistoryTake.*;
import je.panse.doro.main.Enter;

public class NewPatientInput {
// --------------------------------------------	
	public static void main(String n_code) throws IOException {
		ManageFile.readfiler(Enter.wt + "/MenuList/ChartInputMenu1");
		    try (Scanner c_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String cn_code = c_code.nextLine();  // Read user input
				
				switch (cn_code) {
						  case "1" : Input3CC.main(null);  	break;
						  case "2" : Input4PMH.main(null);  	break;
//						  case "3" : Input5SUJ.main(null);  	break;
						  case "4" : Input6OBJ.main(null);  	break;
//						  case "5" : Input7LAB.main(null);  	break;
						  case "6" : Input8ACC.main(null);  	break;
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