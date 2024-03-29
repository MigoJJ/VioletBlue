package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;		

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_execute.souslab7.Proc_calc_date_8ass.ASS8_CKD_lab;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcCr {
	public void main(String skeys) throws Exception {
		System.out.print("========= Input Cr    eGFR    +A/C_ratio  : ");
    	try (Scanner input = new Scanner(System.in)) {
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
			}else {
			}
			
			if (eGFR >=90){
				ReGFR = "G1  : Normal GFR";
			}
			else if (eGFR < 89 && eGFR >=60) {
				ReGFR = "G2  : Mildly decreased GFR";
			}
			else if (eGFR < 60 && eGFR >=45) {
				ReGFR = "G3a : Mildly to moderately decreased GFR";
			}
			else if (eGFR < 45 && eGFR >=30) {
				ReGFR = "G3b : Moderate to severely decreased GFR";
			}
			else if (eGFR < 30 && eGFR >=15) {
				ReGFR = "G4  : Severely decreased GFR";
			}
			else if (eGFR < 15) {
				ReGFR = "G5  : Kidney failure";
			}else {
			}
//input.close();
       String Crresultheadline = ("\tCreatinine (mg/dl) \teGFR (ml/min) \tA/C ratio");
       Crresult = ("\t" + Cr +"\t\t" + eGFR + "\t\t" + ACratio);
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Crresultheadline);
				fcp1.writeliner(Enter.wts + "/7LAB", "\t--------------------------------ⒸⓇ");
				fcp1.writeliner(Enter.wts + "/7LAB", "\t" + Crresult + "\n\t" + RACratio + "\n\t" + ReGFR  + "\n");

				ASS8_CKD_lab.main(RACratio, ReGFR);
						fcp1.readfiler(Enter.wtss + "/7LAB_List");
						New7LAB nc1 = new New7LAB();
						nc1.main(null);
	
		
	} catch (NumberFormatException e) {
	e.printStackTrace();
	}

	}
	
//---------------------------------------------------		
}