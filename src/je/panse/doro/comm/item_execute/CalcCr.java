package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
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
			Key_Iwbb bb1 = new Key_Iwbb();
			bb1.returnkeylist(skeys);
			
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
//---------------------------------------------------		
}