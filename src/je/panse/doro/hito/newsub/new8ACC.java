package je.panse.doro.hito.newsub;

import java.io.IOException;

import je.panse.doro.comm.*;
import je.panse.doro.comm.item.CalcAccess;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;

public class new8ACC {
    public static void main(String[] Strings) throws IOException {
    	CalcAccess.main(null);
//    	System.out.println(CalcBP.BPresult);
    	ReadWriteToChartPlate.writeFile(Enter.wtf + "/8ACC", CalcAccess.diaease_description);
		
		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
    	PlatePrepUpdate.main(null);
		newcategory.main(null);
    }
}