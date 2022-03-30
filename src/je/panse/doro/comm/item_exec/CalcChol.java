package je.panse.doro.comm.item_exec;

import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcChol {
	public static void main(String args) throws Exception { 

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input TC : ");
	        int TC = input.nextInt();
	        
	        System.out.print("========= Input HDL  : ");
	        int HDL = input.nextInt();
	        
	        System.out.print("========= Input TG : ");
	        int TG = input.nextInt();
	        
	        System.out.print("========= Input LDL  : ");
	        int LDL = input.nextInt();
//   
//      input.close();

	        String Cholresult = ("    TC-HDL-TG LDL :   [  " 
	        + TC + " - " + HDL + " - " + TG + " - " + LDL +  "  ] mg/dl" );


			System.out.print(Cholresult);
			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Cholresult);
			New7LAB.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
	}