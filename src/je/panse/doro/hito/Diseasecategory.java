package je.panse.doro.hito;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.fourgate.thyroid.ThyroidEnter;
import je.panse.doro.main.Enter;

public class Diseasecategory {
	File_cw_chart  ob3 = new File_cw_chart();
	public void main(String agrs) throws Exception {
		try {	
			System.out.println(System.lineSeparator().repeat(10));
			ob3.cleanChartPlate();
			switching();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}	

	void switching() throws Exception {
		int scode =2;	
	   	switch (scode) {
	   		case 2 : 
//		   		Menu_list.main(Enter.wd + "/fourgate/thyroid/dataxlsxfile/ThyroidStart");
	   			ThyroidEnter ob4 = new ThyroidEnter();
	    		ob4.main(null);
	    		break;
			default :
				System.out.println(" uncertain ... please check  !!");
				Key_shortcut.main(scode);
	   	}
//			input.close();
	}
// ----------
}