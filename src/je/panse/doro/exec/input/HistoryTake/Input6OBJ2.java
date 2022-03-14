package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.CalcBP;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.comm.ReadWriteToChartPlate;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;

public class Input6OBJ2 {
    public static void main(String[] Strings) throws IOException {
  	
		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
    	PlatePrepUpdate.main(null);
//		Enter.main(null);
    }
//--------------------------------------    
}
