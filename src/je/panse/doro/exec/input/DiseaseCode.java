package je.panse.doro.exec.input;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.ReadWriteToFile;

public class DiseaseCode {
	static String DMMpath = ("/home/migoey/DoRoHome/git/"
			+ "VioletBlue/src/je/panse/doro/text/DiseaseCategoryMenuList");
	
	static String DMMpath_cc = ("/home/migoey/DoRoHome/git/"
	        + "VioletBlue/src/je/panse/doro/text/form/DMM/1DMM_A_Basic");

// --------------------------------------------	
	public static void main(String new1) throws IOException {
//		ChiefComplain.ccScan();
	    ReadWriteToFile.readWTF_DMM(DMMpath);
	    
	    select_main();
	    
//	    ReadWriteToFile.readWTF_DMM(Enter.wpmh);
//	    ReadWriteToFile.readWTF_DMM(Enter.whab);
//	    ReadWriteToFile.readWTF_DMM(Enter.wbmi);
//	    ReadWriteToFile.readWTF_DMM(Enter.wbp);
//	    ReadWriteToFile.readWTF_DMM(Enter.wlab);
//	    ReadWriteToFile.readWTF_DMM(Enter.wacc);
//	    ReadWriteToFile.readWTF_DMM(Enter.wplan);
	    
	}
		
	public static void select_main() throws IOException {
			
	    try (Scanner diease_code = new Scanner(System.in)) {
			System.out.println("Enter selected code number ...   : ");
			String n_DMM = diease_code.nextLine();  // Read user input
			System.out.println("disease code ... is: " + n_DMM);  // Output user input
			
			switch (n_DMM) {
					  case "1" : 	    ReadWriteToFile.readWTF_DMM(DMMpath_cc);;  	break;

//					  case "10d" : abs_code ="    ( onset 10 days ago )";			ManageFile.writefiler();  	break;

				}
			}
		}
// --------------------------------------------
}