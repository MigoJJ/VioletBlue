package je.panse.doro.exec;

import java.io.IOException;		
import java.util.Scanner;

import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.NewPatientInput;

public class StartForm {
	public static void main(String wf) throws IOException {
   				
    try (Scanner diease_code = new Scanner(System.in)) {
		System.out.println("Enter selected code number ...   : ");
		String n_disease = diease_code.nextLine();  // Read user input
		System.out.println("disease code ... is: " + n_disease);  // Output user input
		
		switch (n_disease) {
				  case "1" : NewPatientInput.main(n_disease);  	break;
		
//				  case "1" : abs_code ="DM without complications\n";				ManageFile.writefiler();  	break;
//				  case "11": abs_code ="DM with retinopathy \n";				   ManageFile.writefiler();  	break;
//				  case "12": abs_code ="DM with nephropathy \n";			    	ManageFile.writefiler();  	break;
//				  case "13": abs_code ="DM with peripheral neuropathy \n";		ManageFile.writefiler();  	break;
//				  case "21": abs_code ="Graves' disease : Hyperthyroidism\n";	ManageFile.writefiler();  	break;
//				  case "22": abs_code ="Hashimoto's thyroiditis:Hypothyroidism\n"; ManageFile.writefiler();  	break;
//				  case "23": abs_code ="Subacute Thyroiditis \n";			   ManageFile.writefiler();  	break;
//				  case "10d" : abs_code ="    ( onset 10 days ago )";			ManageFile.writefiler();  	break;

			}
		}
	}
// -----------------------------------------------
}
