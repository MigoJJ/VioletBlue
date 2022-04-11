package je.panse.doro.hito;


import java.util.NoSuchElementException;
import java.util.Scanner;

import je.panse.doro.aeternum.supportdiagnosis.DisSupp;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.ImageCall;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.CalcACC;
import je.panse.doro.comm.item_execute.CalcBP;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_execute.CalcHbA1c;
import je.panse.doro.hito.newsub.*;
import je.panse.doro.main.Enter;

public class Diseasecategory {
	File_cdrw_proc ob2 = new File_cdrw_proc(); 
	File_cw_chart  ob3 = new File_cw_chart();
// --------------------------------------------	
	public void main(String agrs) throws Exception {
		try {	
	    	System.out.println(System.lineSeparator().repeat(10));
			
	    		ob2.readfiler(Enter.wt + "/singlebeam/DisMenu");
	    		ob3.cleanChartPlate();
	    	switching();
	    	
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}	
// --------------------------------------------    	
    void switching() throws Exception {
   			int scode =1;	
	       Scanner input = new Scanner(System.in);
					System.out.print("*****Input code : ");
					scode = input.nextInt();
			   	switch (scode) {
			   		case 0 : 
			    		ob2.readfiler(Enter.wds + "/DxSuppList");
			    		DisSupp ob4 = new DisSupp();
			    		ob4.main(null);
			    		
			    		break;
	//		   						
			   		case 9 : case 99: case 999 :	
			   			Key_Iwbb st999 = new Key_Iwbb(); 
			   			st999.Key_Iwbb_Page(scode); break;
					default :System.out.println(" uncertain ... please check  !!");
			   	}
			input.close();
	}
// ----------
}