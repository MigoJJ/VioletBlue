package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;


public class new6OBJ {
	public static int SBP, DBP, PR;
	public static String BPresult;
	
	public static void main(String args) throws IOException { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/SubMenu/6OBJ_List");

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("Input SBP   mmHg : ");
	        	SBP = input.nextInt();
	        System.out.print("Input DBP   mmHg : ");
	        	DBP = input.nextInt();
	        System.out.print("Input pulse rate / minute : ");
	        	PR = input.nextInt();
//        input.close();

	        	BPresult = ("   BP : [ " + SBP +  "  /  " + DBP + " ]mmHg" 
			+ "   PR [ " + PR + " ]/minute" + "  Regular Left-seated-Position ");

			System.out.print(BPresult);
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writefiler(Enter.wtf + "/6OBJ", BPresult);
			newcategory np1 = new newcategory();
				np1.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
// ----------------------------------------------
}
