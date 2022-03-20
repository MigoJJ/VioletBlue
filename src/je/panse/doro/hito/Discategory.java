package je.panse.doro.hito;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New3CC;
import je.panse.doro.hito.newsub.New4PMH;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New8ACC;
import je.panse.doro.main.Enter;
import je.panse.doro.text.shiloah.InputButton;

public class Discategory {
// --------------------------------------------	
	public static void main(String[] n_code) throws IOException {
    	File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/ChartInputMenu1");
try (Scanner c_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String cn_code = c_code.nextLine();  // Read user input
				
				switch (cn_code) {
						  case "1" : New3CC.main(null);  	break;
						  case "2" : New4PMH.main(null);  	break;
//						  case "3" : Input5SUJ.main(null);  	break;
						  case "4" : New6OBJ.main(null);  	break;
//						  case "5" : Input7LAB.main(null);  	break;
						  case "6" : New8ACC.main(null);  	break;
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