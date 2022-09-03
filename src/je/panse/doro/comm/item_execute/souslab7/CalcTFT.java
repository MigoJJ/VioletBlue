package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;		
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item_subexecute.ResultEditAdd;
import je.panse.doro.fourgate.thyroid.prescription.ThyPrescription;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcTFT {
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	public void main(String skeys) throws Exception {
		double T3,free_T4, TSH;
		String  TFTresult;
		String retvalue1 ="-";
		String retvalue2 ="-";
		String retvalue3 ="-";
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("*****Input T3 : ");
			T3 = input.nextDouble();
			String retvalueT3 = ResultEditAdd.cr_result(0.9, 2.5,T3);

			System.out.print("*****Input free_T4 : ");
			free_T4 = input.nextDouble();
			String retvalueT4 = ResultEditAdd.cr_result(10.6, 19.4,free_T4);
			
			System.out.print("*****Input TSH  : ");
			TSH = input.nextDouble();
			String retvalueTSH ="";
			    if(TSH < 0.05) {
					retvalueTSH = ResultEditAdd.cr_result(TSH, " < ");
			     }
			    else {
			    	retvalueTSH = ResultEditAdd.cr_result(0.25,5.0,TSH);
			     }
			//      input.close();
	        String TFTheadline = ("T3 (ug/dL)  free T-4 (ug/dl)  TSH (mIU/ml)");
	        String TFTreferval = ("   0.9-2.5        10.6-19.4       0.25-5.0");
 	        String tftresult = (retvalueT3 +"\t\t" + retvalueT4 + "\t\t" + retvalueTSH);
	 			File_cdrw_proc fcp1 = new File_cdrw_proc();
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t" +TFTheadline);
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t" +TFTreferval);
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------------------");
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t" + tftresult + "\n");
				
			System.out.print("*****Input Auto antibodies ? [  y/n  ] : ");
			String AutoAb = input.next();
			if (AutoAb.equals("y")) {
				System.out.print("***Anti-TSH-R Ab   :");
				double TSH_R_Ab = input.nextDouble();
		       		if (TSH_R_Ab == 0.3) {
		       			retvalue1 = ResultEditAdd.cr_result(TSH_R_Ab, "< ");
		       		}
		       		else if(TSH_R_Ab > 1.75) {
		       			retvalue1 = ResultEditAdd.cr_result(TSH_R_Ab, "⮝ ");
		       		}
		       		else {
		    		retvalue1 = Double.toString(TSH_R_Ab);
		       		}
				System.out.print("***Anti-Thyrogobulin Ab  :");
			    double Tg_Ab = input.nextDouble();
		       	if (Tg_Ab > 175) {
		       		retvalue2 = ResultEditAdd.cr_result(Tg_Ab, "⮝ ");
		       		}
		       	else {
		       			retvalue2 = Double.toString(TSH_R_Ab);
		       		}
		       	System.out.print("***Anti-microsomal Ab   :");
		       	double micro_Ab = input.nextDouble();
		       	if (micro_Ab == 0.9) {
		       		retvalue3 = ResultEditAdd.cr_result(micro_Ab, "< ");
		       		}
		       	else if (micro_Ab > 34) {
	       			retvalue3 = ResultEditAdd.cr_result(micro_Ab,  "⮝ ");
	       			}
		       	else {
		    		retvalue3 = Double.toString(micro_Ab);
		       		}
					autoantibodies(retvalue1,retvalue2,retvalue3);
				}
				fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
				New7LAB nc1 = new New7LAB();
				nc1.main(null);
			}catch (NumberFormatException e) {
			e.printStackTrace();
			}
		}
	//---------------------------------------------------		
	void autoantibodies(String tshr, String tgr, String micr ) throws Exception {
        String tshrresult = ("\tAnti-TSH-R Ab       : [ " + tshr +  " ] IU/L < 1.75  ");
        String tgrresult = ("\tAnti-Thyrogobulin Ab: [ " + tgr +  " ] ng/mL < 115  ");
        String micrresult = ("\tAnti-microsomal Ab  : [ " + micr +  " ] IU/mL < 34  ");
        fcp1.writeliner(Enter.wts + "/7LAB", tshrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", tgrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", micrresult);
	}
//---------------------------------------------------		
}