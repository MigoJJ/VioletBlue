package je.panse.doro.exec.input.la;

import java.io.IOException;	
import java.util.Scanner;

import je.panse.doro.comm.ManageFile;

public class PastMedicalHistory {
// --------------------------------------------	
	public static void pmhScan() throws IOException {
	String PMHx = "\n\nPMH :  tuberculosis(-) asthma(-) hepatitis(-) operation(-)\n"
			+ "         DM (-)   HTN (-)   Chol (-)\n"
			+ "FHx :  \n"
			+ "Allergy : food(-) drug(-) injection(-) antibiotics(-) vaccine(-)";
	System.out.println(PMHx);
	ManageFile.copyfiler();
	ManageFile.wrfCharting(PMHx);
	}
// --------------------------------------------	
}