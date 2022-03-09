package je.panse.doro.exec.input.hana;

import java.io.IOException;		
import je.panse.doro.comm.ManageFile;

public class B_PastMedicalHistory {
// --------------------------------------------	
	public static void pmhScan() throws IOException {
	String PMHx = "\n\nPMH :  tuberculosis(-) asthma(-) hepatitis(-) operation(-)\n"
			+ "         DM (-)   HTN (-)   Chol (-)\n"
			+ "FHx :  \n"
			+ "Allergy : food(-) drug(-) injection(-) antibiotics(-) vaccine(-)\n";
	System.out.println(PMHx);
	ManageFile.writefiler(PMHx);
	}
// --------------------------------------------	
}