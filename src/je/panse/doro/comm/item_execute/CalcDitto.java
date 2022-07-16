package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.item_execute.sousditto9.Ditto3main;
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
			
			if (dittomo !=0) {
			dittomol = ("\t...OPD F/U x [  " + dittomo +  "  ]-month later");
			fcp1.writeliner(Enter.wts + "/9PLAN", dittomol);
			}
			System.out.print(".....>>>>> Dose Adjust ? : ");
			dosead = input.nextInt();
			if(dosead !=3) {
			if (dosead == 0) { doseadl = ("\t...no medication change or dose-adjust");}
				else if (dosead == 5) { doseadl = ("\t...New Starting Medication :");}
				else if (dosead == 55) { doseadl = ("\t...Discontinue Medication :");}
				else if (dosead == 6) { doseadl = ("\t...Continue Medication");}
				else if (dosead == 2) { doseadl = ("\t...dose-down : ");}
				else if (dosead == 8) { doseadl = ("\t...dose-up : ");}
				else if (dosead == 4) { doseadl = ("\t...previous Px");}
			
			fcp1.writeliner(Enter.wts + "/9PLAN", doseadl);
			
			}else {
		    }
			
//			fcp1.writeliner(Enter.wts + "/9PLAN", labful);
			Ditto3main.main(null);
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