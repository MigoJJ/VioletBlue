package je.panse.doro.exec;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.SOAPInput;
import je.panse.doro.exec.input.NewPatientInput;

public class StartForm {
	public static void main(String wf) throws IOException {
   				
    try (Scanner diease_code = new Scanner(System.in)) {
		System.out.println("Enter selected code number ...   : ");
		String n_disease = diease_code.nextLine();  // Read user input
		System.out.println("disease code ... is: " + n_disease);  // Output user input
		
		switch (n_disease) {
				  case "1" : NewPatientInput.main(n_disease);  	break;
				  case "2" : SOAPInput.main(n_disease);  	break;
				  case "3" : SOAPInput.main(n_disease);  	break;
				  case "4" : SOAPInput.main(n_disease);  	break;
			}
		}
	}
// -----------------------------------------------
}
