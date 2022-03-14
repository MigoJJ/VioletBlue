package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.CalcBP;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.comm.ReadWriteToChartPlate;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;

public class Input6OBJ {
    public static void main(String[] Strings) throws IOException {
    	ManageFile.readfiler("/home/migowj/GDS/git/violetBlue0306/src/je/panse/doro/text/MenuList/SubMenu/6OBJ_List");
    	OBJmenu();
    	Input6OBJ2.main(null);
  	
//		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
//		ManageFile.deletefiler(Enter.wtf + "/Comment");
//		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
//		ManageFile.checkfiler(Enter.wtf + "/Comment");
//    	PlatePrepUpdate.main(null);
//		NewPatientInput.main(null);
    }
    static void OBJmenu() throws IOException {
    	try (Scanner sel_code = new Scanner(System.in)) {
			System.out.println("Enter selected number ...   : ");
			String ncode = sel_code.nextLine();  // Read user input
			
		switch (ncode) {
//				  case "1" : NewPatientInput.main(n_code);  	break;
					  case "2" :     	CalcBP.main(null);
				    	System.out.println(CalcBP.BPresult);
				    	ReadWriteToChartPlate.writeFile("/home/migowj/GDS/git/violetBlue0306/src/je/panse/doro/text/form/6OBJ", CalcBP.BPresult);
						    	;  	break;
//				  case "3" : SOAPInput.main(n_code);  	break;
//				  case "4" : SOAPInput.main(n_code);  	break;
			}
		}

    }
//--------------------------------------    
}
