package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcHbA1c2 {
	public void main(String skeys) throws Exception { 
		int Glucose;
		double Fbspp2;
		double HbA1c;
    	String FP = "FBS";
		String Gluresult;
 
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input FBS/PP2   Glucose  HBA1c(%)   : ");
		        Fbspp2 = input.nextDouble();
		        Glucose = input.nextInt();
		        HbA1c = input.nextDouble();
//      input.close();
		        if (Fbspp2 == 0) {FP = "FBS";}
		        else {FP = ("PP"+ Fbspp2);}
		        
		    Gluresult = ("    " + FP + "  [ " + Glucose +  " ] mg/dl" + "     HbA1c [ " + HbA1c + " ] %");
		    File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Gluresult  + "\n");

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