package je.panse.doro.hito;

import java.util.Scanner;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.fourgate.thyroid.ThyPrescription;
import je.panse.doro.fourgate.thyroid.ThyroidEnter;
import je.panse.doro.main.Enter;

public class Diseasecategory {
	File_cw_chart  ob3 = new File_cw_chart();
// --------------------------------------------	
	public void main(String agrs) throws Exception {
		try {	
//	    	System.out.println(System.lineSeparator().repeat(10));
	    	ob3.cleanChartPlate();
	    	switching();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}	
// --------------------------------------------    	
    void switching() throws Exception {
   			int scode =2;	
//	       Scanner input = new Scanner(System.in);
//					System.out.print(">>> Input code ....>>> : ");
//					scode = input.nextInt();
			   	switch (scode) {
			   		case 2 : 
			   			Menu_list.main(Enter.wd + "/fourgate/thyroid/ThyroidStart");
			   			ThyroidEnter ob4 = new ThyroidEnter();
			    		ob4.main(null);
			    		break;
	//		   						
			   		case 9 : case 99: case 999 :	
			   			Key_Iwbb st999 = new Key_Iwbb(); 
			   			st999.Key_Iwbb_Page(scode); break;
					default :System.out.println(" uncertain ... please check  !!");
			   	}
//			input.close();
	}
// ----------
}