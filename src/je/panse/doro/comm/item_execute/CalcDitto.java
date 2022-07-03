package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcDitto {

	int dittomo, labfu, dosead;
	String dittomol, labful, doseadl; 
	public void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		try (Scanner input = new Scanner(System.in)) {
			System.out.print(".....>>>>> Input ditto month : ");
			dittomo = input.nextInt();
			dittomol = ("\t...OPD F/U x [  " + dittomo +  "  ]-month later");
		
			System.out.print(".....>>>>> Dose Follow-up plan ? : ");
			System.out.println ("\n 0   :  ...Observation and Follow-up\n");
			System.out.println (" 10   : ...Follow-up without medication\n");
			System.out.println (" 1   :  ...next Lab F/U...\n");
			System.out.println (" 2   :  ...next 공단검진 F/U...\n");
			System.out.println (" 3   :  ...next 지디스 검진 F/U...\n");
			labfu = input.nextInt();
	        
			if (labfu == 0) {   labful = ("\t...Observation and Follow-up"); }
			if (labfu == 10) {   labful = ("\t...Follow-up without medication\n"); }
			else if (labfu == 1) {   labful = ("\t...next Lab F/U... "); }
			else if (labfu == 2) {   labful = ("\t...next 공단검진..."); }
			else if (labfu == 3) {   labful = ("\t...next 지디스검진..."); }
			else {
			}
			System.out.print(".....>>>>> Dose Adjust ? : ");
			dosead = input.nextInt();

			if (dosead == 0) { doseadl = ("\t...no medication change or dose-adjust");}
			else if (dosead == 5) { doseadl = ("\t...New Starting Medication :");}
			else if (dosead == 55) { doseadl = ("\t...Discontinue Medication :");}
			else if (dosead == 6) { doseadl = ("\t...Continue Medication");}
			else if (dosead == 2) { doseadl = ("\t...dose-down : ");}
			else if (dosead == 8) { doseadl = ("\t...dose-up : ");}
			else if (dosead == 4) { doseadl = ("\t...예전 약으로");}
			else {
		    }
			fcp1.writeliner(Enter.wts + "/9PLAN", dittomol);
			fcp1.writeliner(Enter.wts + "/9PLAN", labful);
			fcp1.writeliner(Enter.wts + "/9PLAN", doseadl);
			File_cw_chart dn1 = new File_cw_chart();
				dn1.deuxnine();	
				if (skeys == "Itemcategorykey") {
					fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
					Itemcategory.main(null);
				}
				else {
					fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
					Newcategory nc1 = new Newcategory();
					nc1.main(null);
				}
	        //        input.close();
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}

	}
//---------------------------------------------------		
}