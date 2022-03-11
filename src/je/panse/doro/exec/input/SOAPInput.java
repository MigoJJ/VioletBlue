package je.panse.doro.exec.input;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.hana.D_AccessInput;
import je.panse.doro.main.Enter;

public class SOAPInput {
	static String SOAP_c = (Enter.wd + "/text/form/SOAP/chart_A_Basic");
	// --------------------------------------------	
	public static void main(String args) throws IOException {
		System.out.println(SOAP_c);
		select_main();
	}
		
	public static void select_main() throws IOException {
		ManageFile.readfiler(SOAP_c);
		
	    try (Scanner SOAP_code = new Scanner(System.in)) {
			System.out.println("Enter selected code number ...   : ");
			String n_SOAP = SOAP_code.nextLine();  // Read user input
			System.out.println("disease code ... is: " + n_SOAP);  // Output user input
			
			switch (n_SOAP) {
//					  case "1" : NewPatientInput.main(n_disease);  	break;
					  case "3" : D_AccessInput.main(null);  	break;
//					  case "a" : D_AccessInput.main(null);  	break;
					  //					  case "3" : SOAPInput.main(n_disease);  	break;
//					  case "4" : SOAPInput.main(n_disease);  	break;
			}
	    }
	}
// --------------------------------------------
}