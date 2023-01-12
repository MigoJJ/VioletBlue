package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;	

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.loop.CurrentDateAdd_date;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcChol {
	public void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		if (skeys == "Itemcategorykey") {
		}
		else {
			fcp1.readfiler(Enter.wtss + "/6OBJ_List");
		}
    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input TC : ");
	        System.out.print("\n========= Input HDL  : ");
	        System.out.print("\n========= Input TG : ");
	        System.out.print("\n========= Input LDL  : ");
	        int TC = input.nextInt();
	        int HDL = input.nextInt();
	        int TG = input.nextInt();
	        int LDL = input.nextInt();
  		
	//      input.close();
	        String Cresult = "\t[ "+ + TC +  "-" + HDL + " -" + TG +  "-" + LDL +" ]";
	        String Cholresult = ("\tTC-HDL-TG-LDL : " +Cresult + " mg/dL\n" );
	                
	        System.out.println(Cholresult);
				fcp1.writeliner(Enter.wts + "/7LAB", Cholresult  + "\n");
				fcp1.writeliner(Enter.wts + "/8ASS", "\t#  Lipid battery : "+ Cresult +""+ CurrentDateAdd_date.main("m"));

					fcp1.readfiler(Enter.wtss + "/7LAB_List");
					New7LAB nc1 = new New7LAB();
					nc1.main(null);

    	} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
}