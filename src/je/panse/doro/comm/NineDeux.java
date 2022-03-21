package je.panse.doro.comm;

import java.io.IOException;

import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class NineDeux {
	// ----------
	public static void unnine() throws IOException {
    	File_cdrw_proc nc1 = new File_cdrw_proc();
	    	nc1.deletefiler(Enter.wts + "/ChartPlate");
	    	nc1.checkfiler(Enter.wts + "/ChartPlate");
	    	nc1.deletefiler(Enter.wts + "/Comment);");
	    	nc1.checkfiler(Enter.wts + "/Comment");
		
		File_cw_chart nc2 = new File_cw_chart();	 
			nc2.writechart();
		File_cw_chart nu3 = new File_cw_chart();   
			nu3.chartbackup();
//		StartForm.main(null); 
	}
	// ----------
	public static void deuxnine() throws IOException {
		File_cw_chart nc5 = new File_cw_chart();	 
		nc5.writechart();
	File_cw_chart nc6 = new File_cw_chart();   
		nc6.chartbackup();
//	Enter nc7 = new Enter(); 
//  		nc7.main(null);
	}
// ----------
}