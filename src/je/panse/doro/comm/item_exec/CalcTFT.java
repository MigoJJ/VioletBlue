package je.panse.doro.comm.item_exec;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcTFT {
	public static double free_T4;
	public static double TSH;
	public static String  TFTresult;
	
	public static void main(String args) throws Exception { 
    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input free_T4 : ");
	        free_T4 = input.nextDouble();
	        
	        System.out.print("========= Input TSH  : ");
	        TSH = input.nextDouble();
//      input.close();

	        TFTresult = ("    free-T4 : [  " + free_T4 +  "  ] ug/dL" 
	        			+ "    TSH [  " + TSH + "  ] mIU/mL\n");

			System.out.print(TFTresult);
			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writefiler(Enter.wts + "/7LAB", TFTresult);
			New7LAB.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}