package je.panse.doro.exec.input;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.HistoryTake.Input1CC;
import je.panse.doro.main.Enter;

public class NewPatientInput {
// --------------------------------------------	
	public static void main(String n_code) throws IOException {
		ManageFile.readfiler(Enter.wt + "/ChartInputMenu1");
				
		    try (Scanner c_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String cn_code = c_code.nextLine();  // Read user input
				
				switch (cn_code) {
						  case "1" : Input1CC.main(n_code);  	break;
//						  case "2" : SOAPInput.main(n_code);  	break;
//						  case "3" : SOAPInput.main(n_code);  	break;
//						  case "4" : SOAPInput.main(n_code);  	break;
					}
				}
			}
// --------------------------------------------
}