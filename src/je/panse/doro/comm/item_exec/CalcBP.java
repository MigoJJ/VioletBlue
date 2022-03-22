package je.panse.doro.comm.item_exec;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBP {
	public static int ditto;
	
	public static void main(String args) throws IOException { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/submenu/6OBJ_List");

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("Input SBP   mmHg : ");
	        	SBP = input.nextInt();
	        System.out.print("Input DBP   mmHg : ");
	        	DBP = input.nextInt();
	        System.out.print("Input pulse rate / minute : ");
	        	PR = input.nextInt();
//        input.close();

	        	BPresult = ("   BP : [ " + SBP +  " / " + DBP + " ]mmHg" 
			+ "   PR [ " + PR + " ]/minute" + "  Regular LSP");

			System.out.print(BPresult);
			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writefiler(Enter.wts + "/6OBJ", BPresult);
			New6OBJ np2 = new New6OBJ();
				np2.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}