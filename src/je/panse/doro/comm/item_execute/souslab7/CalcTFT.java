package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;		
import je.panse.doro.comm.File_cdrw_proc;
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
    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("*****Input T3 : ");
	        T3 = input.nextDouble();
	        System.out.print("*****Input free_T4 : ");
	        free_T4 = input.nextDouble();
	        System.out.print("*****Input TSH  : ");
	        TSH = input.nextDouble();
//      input.close();
	        
	        String TFTheadline = ("T3 (ug/dL)  free T-4 (ug/dl)  TSH (mIU/ml)");
	        String tftresult = (T3 +"\t\t" + free_T4 + "\t\t" + TSH);
	 			File_cdrw_proc fcp1 = new File_cdrw_proc();
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t" +TFTheadline);
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------------------");
	 				fcp1.writeliner(Enter.wts + "/7LAB", "\t" + tftresult + "\n");
				
			System.out.print("*****Input Auto antibodies ? [  y/n  ] : ");
	       String AutoAb = input.next();
			if (AutoAb.equals("y")) {
				System.out.print("***Anti-TSH-R Ab   :");
		       double TSH_R_Ab = input.nextDouble();
				System.out.print("***Anti-Thyrogobulin Ab  :");
			    double Tg_Ab = input.nextDouble();
		       System.out.print("***Anti-microsomal Ab   :");
		       double micro_Ab = input.nextDouble();
				autoantibodies(TSH_R_Ab,micro_Ab,Tg_Ab);
			}
		       if (skeys == "Itemcategorykey") {
					fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/Menu2ndLine/ItemMenu");
					Itemcategory.main(null);
		       }
				else if (skeys == "diseasecategorythyroid") {
						fcp1.readfiler(Enter.wd + "/fourgate/thyroid/ThyroidStart");
			   			ThyPrescription tp1 = new ThyPrescription();
			    		tp1.main(null);
				}
				else {
					fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
					New7LAB nc1 = new New7LAB();
					nc1.main(null);
				}
			}catch (NumberFormatException e) {
			e.printStackTrace();
			}
		}
	//---------------------------------------------------		
	void autoantibodies(double tshr, double micr, double tgr) throws Exception {
        String tshrresult = ("\tAnti-TSH-R Ab       : [  " + tshr +  "  ] IU/L < 1.75  ");
        String tgrresult = ("\tAnti-Thyrogobulin Ab : [  " + tgr +  "  ] ng/mL < 115  ");
        String micrresult = ("\tAnti-microsomal Ab  : [  " + micr +  "  ] IU/mL < 34  ");

        fcp1.writeliner(Enter.wts + "/7LAB", tshrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", tgrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", micrresult);
	}
//---------------------------------------------------		
}