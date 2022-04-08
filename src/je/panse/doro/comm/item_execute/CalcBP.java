package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBP {
	int SBP, DBP, PR;
	String BPresult;

	public static void main(String args) throws Exception {
		New6OBJ np2 = new New6OBJ();
		CalcBP bp1 = new CalcBP();
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    		ob2.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("***** Input SBP   mmHg : ");
	        	bp1.SBP = input.nextInt();
	        System.out.print("***** Input DBP   mmHg : ");
	        	bp1.DBP = input.nextInt();
	        System.out.print("***** Input pulse rate / minute : ");
	        	bp1.PR = input.nextInt();
//        input.close();
	        	bp1.BPresult = ("    BP    [ " + bp1.SBP +  " / " 
	        	+ bp1.DBP + " ]mmHg" 
	        	+ "   PR [ " + bp1.PR + " ]/minute" + "  Regular LSP");
			ob2.writeliner(Enter.wts + "/6OBJ", bp1.BPresult);
			np2.main("");
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}