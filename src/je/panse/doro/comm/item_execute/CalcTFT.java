package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcTFT {
	File_cdrw_proc fcp1 = new File_cdrw_proc();

	public void main(String skeys) throws Exception {
		double free_T4, TSH;
		String  TFTresult;
    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("*****Input free_T4 : ");
	        free_T4 = input.nextDouble();
	        System.out.print("*****Input TSH  : ");
	        TSH = input.nextDouble();
//      input.close();
	        TFTresult = ("    free-T4   [  " + free_T4 +  "  ] ug/dL" 
	        			+ "    TSH [  " + TSH + "  ] mIU/mL");
	        fcp1.writeliner(Enter.wts + "/7LAB", TFTresult);
				
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
			Key_Iwbb bb1 = new Key_Iwbb();
			bb1.returnkeylist(skeys);
		} 
    	catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	//---------------------------------------------------		
	void autoantibodies(double tshr, double micr, double tgr) throws Exception {
        String tshrresult = ("    Anti-TSH-R Ab        : [  " + tshr +  "  ]\tIU/L\t    < 1.75  ");
        String tgrresult = ("    Anti-Thyrogobulin Ab : [  " + tgr +  "  ]\tng/mL\t    < 115  ");
        String micrresult = ("    Anti-microsomal Ab   : [  " + micr +  "  ]\tIU/mL\t    < 34  ");

        fcp1.writeliner(Enter.wts + "/7LAB", tshrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", tgrresult);
        fcp1.writeliner(Enter.wts + "/7LAB", micrresult);
	}
//---------------------------------------------------		
}