package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.CurrentDateAdd_date;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcHbA1c {
	public void main(String args) throws Exception{ 
		int Glucose;
		double Fbspp2;
		double HbA1c;
    	String FP = "FBS";
	    File_cdrw_proc fcp1 = new File_cdrw_proc();
 
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input \n\t[FBS/PP2]\n\t[Glucose]\n\t[HBA1c(%)]   : ");
	        Fbspp2 = input.nextDouble();
	        Glucose = input.nextInt();
	        HbA1c = input.nextDouble();
	        //      input.close();
	        if (Fbspp2 == 0) {FP = "FBS";}
	        else {FP = ("PP"+ Fbspp2);}
	        
	        if (HbA1c == 0) {
				String Gluresult = ("\t" + FP + "  [ " + Glucose +  " ] mg/dl");
				fcp1.writeliner(Enter.wts + "/7LAB", Gluresult);
			}
    		else {
				double IFCC = ((HbA1c-2.152)/0.09148);
				String s = String.format("%.0f", IFCC);
				System.out.println("\t\tHbA1c-IFCC : [ " + s + " ] mmol/mol");
				double eAGg = ((28.7*HbA1c)-46.7);
				String sg = String.format("%.0f", eAGg);
				System.out.println("\t\tHbA1c-eAG : [ " + sg + " ] mg/dl");
				double eAGm = (0.0555*eAGg);
				String sm = String.format("%.1f", eAGm);
				
				String Gluresult = ("\t" + FP + "  [ " + Glucose +  " ] mg/dl" + "\tHbA1c [ " + HbA1c + " ] %");
    		    fcp1.writeliner(Enter.wts + "/7LAB", Gluresult);
				System.out.println("\t\tHbA1c-eAG : [ " + sm + " ] mmol/l");
		    	fcp1.writeliner(Enter.wts + "/7LAB", "\t\tHbA1c-IFCC : [ " + s + " ] mmol/mol");
		    	fcp1.writeliner(Enter.wts + "/7LAB", "\t\tHbA1c-eAG  : [ " + sg + " / " 
		    	             + sm + " ]...mg/dl...mmol/l");
    		}
			fcp1.writeliner(Enter.wts + "/6OBJ","\t"+ CurrentDateAdd_date.main("h") +"\n");
			fcp1.readfiler(Enter.wtss + "/7LAB_List");
			New7LAB nc1 = new New7LAB();
			nc1.main(null);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
//---------------------------------------------------		
}