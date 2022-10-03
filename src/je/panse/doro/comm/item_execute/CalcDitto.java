package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.item_execute.sousditto9.Ditto3main;
import je.panse.doro.comm.item_subexecute.Edcamain;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcDitto {
	double dittomo, labfu, dosead;
	String dittomol, labful, doseadl; 
	static File_cdrw_proc fcp1 = new File_cdrw_proc(); 
	public void main(String skeys) throws Exception {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print(".....>>>>> Input ditto month : ");
			dittomo = input.nextDouble();
			if (dittomo !=0) {
				dittomol = ("\t...Follow-up in the clinic in [ " + dittomo +  " ]-month");
				fcp1.writeliner(Enter.wts + "/9PLAN", dittomol);
				System.out.println(dittomol);
			}
			System.out.print(".....>>>>> Dose Adjust ? : \n");
			System.out.println(
					"-------------------------\n"
					+ "\t0...Observation & Follow-up without medication\n"
					+ "\t1...With conservative treatment\n"
					+ "\t7...More Insertion ?\n"
					+ "\t3...Skip\n"
					+ "--------------------------");
			doseadl="";
			dosead = input.nextInt();
			
			if (dosead == 3 | dosead ==9 ) { CalcDitto.wos_exit(doseadl);}
				else if (dosead == 5) { doseadl = ("\t...starting new medicine:");}
				else if (dosead == 55) { doseadl = ("\t...Medication discontinuation :");}
				else if (dosead == 6) { doseadl = ("\t...now [ well ] treated with current medication\n"
						+ "\t   continue with current dosages of meds");}
				else if (dosead == 2) { doseadl = ("\t...a reduction in drug dosage : ");}
				else if (dosead == 8) { doseadl = ("\t...an increase in drug dosage : ");}
				else if (dosead == 4) { doseadl = ("\t...Return to previous Px");}
				else if (dosead == 0) { doseadl = ("\t...Observation & Follow-up without medication");}
				else if (dosead == 1) { doseadl = ("\t...With conservative treatment");}
				else if (dosead == 7) { CalcDitto.more_insert(doseadl);}
				else {	}
			CalcDitto.save_exit(dosead,doseadl);
			CalcDitto.more_insert(doseadl);
	        //        input.close();
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
	static void more_insert(String args) throws Exception {
		String st="JJ";
		while (!(st == "")) {
			System.out.println("Insert description for 9PLAN ...");
			Scanner suj_text = new Scanner(System.in);
			st = (suj_text.nextLine().trim());
			Edcamain.main(st,"/9PLAN");}
		CalcDitto.wos_exit(st);
		}

	static void save_exit(double dosead, String doseadl) throws Exception {
		fcp1.writeliner(Enter.wts + "/9PLAN", doseadl);
		System.out.println(doseadl);
//		Ditto3main.main(null);
	}
	
	static void wos_exit(String doseadl) throws Exception {
		fcp1.writeliner(Enter.wts + "/9PLAN", doseadl);
		File_cw_chart dn1 = new File_cw_chart();
			dn1.deuxnine();	
			fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
		Newcategory nc1 = new Newcategory();
			nc1.main("");
	}
//---------------------------------------------------		
}