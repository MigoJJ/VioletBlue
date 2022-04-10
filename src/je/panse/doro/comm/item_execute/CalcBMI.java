package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBMI {
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	public void main(String skeys) throws Exception {
		if (skeys == "Itemcategorykey") {
			fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
		}else {
			fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		}
		
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("*****Input weight in kilogram: ");
			double weight = input.nextDouble();
			System.out.print("*****Input height in centimeter: ");
			double height = input.nextDouble();
			System.out.print("*****Input waist in centimeter: ");
			int waist = input.nextInt();
			double BMI = weight / (height* height/10000);
			String result2 = String.format("%.1f", BMI);
//	        input.close();
			String rheight   = (".   height   [  " + height + " ] cm");
			String rweight   = (".   weight   [  " + weight + "  ] kg");
			String BMIresult = (".   BMI      [  " + result2 +  "  ] kg/m^2"); 
			String rwwaist   = (".   waist    [  " + waist + "  ] cm");
			
			bmi bmi1 = new bmi();
			if (waist == 0) {
				bmi1.BMIhw(rheight,rweight,BMIresult,skeys);
			}else {
				bmi1.BMIhw(rheight,rweight,BMIresult,rwwaist,skeys);
			}
        }
    }
	class bmi{
		void BMIhw(String rh, String rw, String rB,String rwa, String skeys) throws Exception {			
				fcp1.writeliner(Enter.wts + "/6OBJ", rh);
				fcp1.writeliner(Enter.wts + "/6OBJ", rw);
				fcp1.writeliner(Enter.wts + "/6OBJ", rB);
				fcp1.writeliner(Enter.wts + "/6OBJ", rwa);
					Key_Iwbb bb1 = new Key_Iwbb();
					bb1.returnkeylist(skeys);
		}
		void BMIhw(String rh, String rw, String rB, String skeys) throws Exception {			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/6OBJ", rh);
				fcp1.writeliner(Enter.wts + "/6OBJ", rw);
				fcp1.writeliner(Enter.wts + "/6OBJ", rB);
					Key_Iwbb bb1 = new Key_Iwbb();
					bb1.returnkeylist(skeys);
		}
	}
// ----------	
}