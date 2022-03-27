package je.panse.doro.comm.item_exec;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcDitto {
	static int dittomo, labfu, dosead;
	static String dittomol, labful, doseadl; 
	public static void main(String args) throws Exception { 

		try (Scanner input = new Scanner(System.in)) {
	        System.out.print("Input ditto month : ");
	        dittomo = input.nextInt();
	        dittomol = ("\t...ditto & OPD F/U x [  " + dittomo +  "  ]-month later");
	        
	        System.out.print("Lab Follow-up will be needed ? :");
	        labfu = input.nextInt();
	        
	        if (labfu == 1) {
			    labful = ("\t...next Lab F/U plan (+)");
		    }
		    System.out.print("Dose Adjust ? : ");
		    dosead = input.nextInt();
	        
		    if (dosead == 1) {
		        doseadl = ("\t...medication change or dose-adjust");
	        }
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writefiler(Enter.wts + "/9PLAN", dittomol);
				fcp1.writefiler(Enter.wts + "/9PLAN", labful);
				fcp1.writefiler(Enter.wts + "/9PLAN", doseadl);
//			File_cw_chart fcw = new File_cw_chart();
			NineDeux.unnine();	
			Newcategory.main("");
	        //        input.close();
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}

	}
//---------------------------------------------------		
}