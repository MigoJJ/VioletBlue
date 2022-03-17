package je.panse.doro.comm.item;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;

public class CalcBP {
		public static String BPresult;
		public static void main(String[] Strings) throws IOException {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input SBP   mmHg : ");
	        int SBP = input.nextInt();
	        System.out.print("Input DBP   mmHg : ");
	        int DBP = input.nextInt();
	        System.out.print("Input pulse rate / minute : ");
	        int PR = input.nextInt();
	        
	        input.close();

	        BPresult = ("\n    BP : [ " + SBP +  "  /  " + DBP + " ]mmHg" 
			+ "   PR [ " + PR + " ]/minute" + "  Regular Left-seated-Position ");
	        
			File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writefiler(Enter.wtf + "/6OBJ", BPresult);

	    }
//---------------------------------------------------		
}