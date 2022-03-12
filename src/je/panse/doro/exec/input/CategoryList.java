package je.panse.doro.exec.input;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;

public class CategoryList {
	// --------------------------------------------	
	public static void main(String ndsi) throws IOException {
		System.out.println("System.out.println(ndsi);" + ndsi);
		ManageFile.readfiler(ndsi);
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