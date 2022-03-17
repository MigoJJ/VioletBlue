package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;

import je.panse.doro.comm.ManageFile;
import je.panse.doro.comm.ReadWriteToChartPlate;
import je.panse.doro.comm.item.CalcBP;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;

public class new6OBJ2 {
    public static void main(String[] Strings) throws IOException {
  	
		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
    	PlatePrepUpdate.main(null);
		new6OBJ.main(null);
    }
//--------------------------------------    
}
