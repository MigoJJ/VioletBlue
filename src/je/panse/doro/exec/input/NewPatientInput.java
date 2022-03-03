package je.panse.doro.exec.input;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.la.ChiefComplain;
import je.panse.doro.exec.input.la.PastMedicalHistory;
import je.panse.doro.exec.input.la.WriteToFile;

public class NewPatientInput {
// --------------------------------------------	
	public static void main(String new1) throws IOException {
		ChiefComplain.ccScan();
	    PastMedicalHistory.pmhScan();
	    WriteToFile.main(null);
	}
// --------------------------------------------
}