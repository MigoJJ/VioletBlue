package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;

import je.panse.doro.comm.CalcBP;
import je.panse.doro.comm.ReadWriteToChartPlate;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.PlatePrepUpdate;

public class Input6OBJ {
    public static void main(String[] Strings) throws IOException {
    	CalcBP.main(null);
    	System.out.println(CalcBP.BPresult);
    	ReadWriteToChartPlate.writeFile("/home/migoey/git/violetBlue0306/src/je/panse/doro/text/form/6OBJ", CalcBP.BPresult);
		
    	PlatePrepUpdate.main(null);
		NewPatientInput.main(null);
    }
    
}
