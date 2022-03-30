package je.panse.doro.comm.item_exec;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcHbA1c {
	public static void main(String args) throws Exception { 
		int Glucose;
		double HbA1c;
		String  Gluresult;

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input Glucose : ");
	        Glucose = input.nextInt();
	        
	        System.out.print("========= Input HbA1c  : ");
	        HbA1c = input.nextDouble();
//      input.close();

	        Gluresult = ("    FBS       [ " + Glucose +  " ] mg/dl" 
	        			+ "     HbA1c [ " + HbA1c + " ] %");

			System.out.print(Gluresult);
			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Gluresult);
			New7LAB.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}