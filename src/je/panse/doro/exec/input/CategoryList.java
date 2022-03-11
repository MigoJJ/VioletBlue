package je.panse.doro.exec.input;

import java.io.IOException;	
import java.util.Scanner;

import je.panse.doro.comm.ManageFile;
import je.panse.doro.main.Enter;

public class CategoryList {
	static String ndsi = (Enter.wtf + "/ChartPlate");
	// --------------------------------------------	
	public static void main(String args) throws IOException {
		ManageFile.readfiler(Enter.wt + "/StartMenuList");
		System.out.println(ndsi);
		select_main();
	}
		
	public static void select_main() throws IOException {
	
	    try (Scanner clist_code = new Scanner(System.in)) {
//			System.out.println("Enter selected code number ...   : ");
			String n_code = clist_code.nextLine();  // Read user input
			
			switch (n_code) {
					  case "1" : NewPatientInput.main(null);  	break;
//					  case "3" : D_AccessInput.main(null);  	break;
//					  case "a" : D_AccessInput.main(null);  	break;
					  //					  case "3" : SOAPInput.main(n_disease);  	break;
//					  case "4" : SOAPInput.main(n_disease);  	break;
			}
	    }
	}
// --------------------------------------------
}