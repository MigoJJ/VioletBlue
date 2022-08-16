package je.panse.doro.comm.item_execute.souslab7;

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
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input Cr    eGFR    +A/C_ratio  : ");
		double Cr = input.nextDouble();
		double eGFR = input.nextDouble();
		double ACratio = input.nextDouble();
		String Crresult;
		String ReGFR="";
		String RACratio="";
		
			if (ACratio <30){
				RACratio = "A1  : Normal to mildly increased A/C_ratio";
			}
			else if (ACratio >=30 && ACratio <=300) {
				RACratio = "A2  : Moderately increased A/C_ratio";
			}
			else if (ACratio >300) {
				RACratio = "A3  : Severely increased A/C_ratio";
			}
			
		
			if (eGFR >=90){
				ReGFR = "G1  : Normal GFR";
			}
			else if (eGFR < 89 && eGFR >=60) {
				ReGFR = "G2  : Mildly decreased GFR";
			}
			else if (eGFR < 59 && eGFR >=45) {
				ReGFR = "G3a : Mildly to moderately decreased GFR";
			}
			else if (eGFR < 44 && eGFR >=30) {
				ReGFR = "G3b : Moderate to severely decreased GFR";
			}
			else if (eGFR < 29 && eGFR >=15) {
				ReGFR = "G4  : Severely decreased GFR";
			}
			else if (eGFR < 15) {
				ReGFR = "G5  : Kidney failure";
			}
	
//input.close();
       String Crresultheadline = ("\tCreatinine (mg/dl) \teGFR (ml/min) \tA/C ratio");
       Crresult = ("\t" + Cr +"\t\t" + eGFR + "\t\t" + ACratio);
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Crresultheadline);
				fcp1.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------------------");
				fcp1.writeliner(Enter.wts + "/7LAB", "\t" + Crresult + "\n\t" + RACratio + "\n\t" + ReGFR  + "\n");
				
			       if (skeys == "Itemcategorykey") {
						fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/Menu2ndLine/ItemMenu");
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