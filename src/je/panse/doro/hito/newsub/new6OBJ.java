package je.panse.doro.hito.newsub;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item.CalcBP;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;


public class new6OBJ {
	public static void main(String args) throws IOException { 
		String obj;
		String BPresult;

		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/SubMenu/6OBJ_List");
		
        System.out.print("Input number : ");
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
		
		newcategory np7 = new newcategory();
		np7.main("");
		    	
		}
	}
	// ----------------------------------------------


