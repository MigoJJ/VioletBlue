package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;

import je.panse.doro.comm.*;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;

public class Input8ACC {
    public static void main(String[] Strings) throws IOException {
    	CalcAccess.main(null);
//    	System.out.println(CalcBP.BPresult);
    	ReadWriteToChartPlate.writeFile("/home/migoey/git/violetBlue0306/src/je/panse/doro/text/form/8ACC", CalcAccess.diaease_description);
		
    	
		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
    	PlatePrepUpdate.main(null);
		NewPatientInput.main(null);
    }
}