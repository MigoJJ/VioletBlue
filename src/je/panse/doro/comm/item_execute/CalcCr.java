package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcCr {
	public void main(String skeys) throws Exception { 
		double Cr;
		double eGFR;
		double ACratio;
		String Crresult;
 
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input Cr    eGFR    +A/C_ratio  : ");
				Cr = input.nextDouble();
				eGFR = input.nextDouble();
				ACratio = input.nextDouble();
//      input.close();
		       Crresult = ("\tCreatinine [ " + Cr +  " ] mg/dl"	+ "\n\teGFR [ " + eGFR + " ] ml/min"
		    		   + "\t+A/C ratio [ " + ACratio + " ]");
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Crresult);

			       if (skeys == "Itemcategorykey") {
						fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
						Itemcategory.main(null);
					}
					else {
						fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
						New7LAB nc1 = new New7LAB();
						nc1.main(null);
					}
			
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
//---------------------------------------------------		
}