package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcVitD {
	public void main(String skeys) throws Exception { 
		double vitamin_D;
		String  VitDresult;

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input 25-OH-Vitamin-D : ");
	        vitamin_D = input.nextDouble();
	        //      input.close();

	        VitDresult = ("    25-OH-Vitamin-D    [ " + vitamin_D +  " ] ng/mL" );

			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", VitDresult);
			Key_Iwbb bb1 = new Key_Iwbb();
			bb1.returnkeylist(skeys);
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}