package je.panse.doro.exec.input;

import java.io.IOException;			
import je.panse.doro.comm.ReadWriteToFile;
import je.panse.doro.exec.input.hana.A_ChiefComplain;
import je.panse.doro.main.Enter;

public class NewPatientInput {
// --------------------------------------------	
	public static void main(String new1) throws IOException {
		A_ChiefComplain.ccScan();
//	    ReadWriteToFile.readWTF(Enter.wcc);
	    ReadWriteToFile.readWTF(Enter.wpmh);
//	    ReadWriteToFile.readWTF(Enter.whab);
	    ReadWriteToFile.readWTF(Enter.wbmi);
	    ReadWriteToFile.readWTF(Enter.wbp);
	    ReadWriteToFile.readWTF(Enter.wlab);
	    ReadWriteToFile.readWTF(Enter.wacc);
	    ReadWriteToFile.readWTF(Enter.wplan);
	}
// --------------------------------------------
}