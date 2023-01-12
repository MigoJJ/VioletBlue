package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;	

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcLpa {
	public void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		if (skeys == "Itemcategorykey") {
		}
		else {
			fcp1.readfiler(Enter.wtss + "/7LAB_List");
		}
    	try (Scanner input = new Scanner(System.in)) {
	       System.out.print(">>>>>>> Input Lp(a) >>>>>>> : \n");
	       System.out.print(">>>>>>> Input Apob >>>>>>> : ");
    		double Lpa  = input.nextDouble();
	       double Apob = input.nextDouble();
	//      input.close();
	        String Lpar = String.format("\tLiporpotein(a)   [ %3.1f ]  ≤ 30.0 mg/dL ", Lpa); 
	        String Apobr= String.format("\tApoLiporpotein(B)[ %3.1f ]"
	        		+ "  M:46-174   F:46-142 mg/dL", Apob); 
	        String lar = (Lpar + "\n" + Apobr);

	                
	        System.out.println(lar);
				fcp1.writeliner(Enter.wts + "/7LAB", lar + "\n");
					fcp1.readfiler(Enter.wtss +  "/7LAB_List");
					New7LAB nc1 = new New7LAB();
					nc1.main(null);
    	} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
}