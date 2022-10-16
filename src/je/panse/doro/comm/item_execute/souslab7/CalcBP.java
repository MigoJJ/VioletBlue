package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_execute.souslab7.CalcBMI.bmi;
import je.panse.doro.fourgate.thyroid.prescription.ThyPrescription;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBP {
	int SBP, DBP, PR;
	String BPresult;
	public static void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		Key_Iwbb bb1 = new Key_Iwbb();
		CalcBP bp1 = new CalcBP();
		if (skeys == "Itemcategorykey") {
		}
		else {
			fcp1.readfiler(Enter.wtss + "/6OBJ_List");
		}
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("\r***** Input  [SBP ] [ DBP ]  [pulse rate / minute ] : ");
			bp1.SBP = input.nextInt();
			bp1.DBP = input.nextInt();
			bp1.PR = input.nextInt();
			//        input.close();
			
			if (bp1.PR == 0) {
				   bp1.BPresult = String.format("\tBP [ %d / %d ]mmHg", bp1.SBP,bp1.DBP);
			}else if (bp1.PR==1) {
				   bp1.BPresult = String.format("at Home\n\tBP [ %d / %d ]mmHg   PR [ %d ]/min", bp1.SBP,bp1.DBP);
			}else {
				   bp1.BPresult = String.format("at GDS clinic\n\tBP [ %d / %d ]mmHg   PR [ %d ]/min  Regular LSP", bp1.SBP,bp1.DBP,bp1.PR);
			}
		   fcp1.writeliner(Enter.wts + "/6OBJ", bp1.BPresult  + "\n");

		   if (skeys == "Itemcategorykey") {
			   fcp1.readfiler(Enter.wtss + "/Menu2ndLine/ItemMenu");
				Itemcategory.main(null);
			}
			else if (skeys == "diseasecategorythyroid") {
				fcp1.readfiler(Enter.wd + "/fourgate/thyroid/ThyroidStart");
				ThyPrescription tp1 = new ThyPrescription();
				tp1.main(null);
			}
			else {
				fcp1.readfiler(Enter.wtss + "/6OBJ_List");
					New6OBJ.main(null);
				}
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
//---------------------------------------------------		
}