package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.loop.CurrentDateAdd_date;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBMI {
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	public void main(String skeys) throws Exception {
		 try (Scanner input = new Scanner(System.in)) {
			System.out.print("*****Input weight in kilogram: ");
			double weight = input.nextDouble();
			System.out.print("*****Input height in centimeter: ");
			double height = input.nextDouble();
			System.out.print("*****Input waist in centimeter: < (if inch   < 50)");
			double waist = input.nextDouble();
				String result3 = ""; 
				if (waist < 50) {waist = (waist*2.54);
					result3 = String.format("%.1f", waist);}
			double BMI = weight / (height* height/10000);
				String result2 = String.format("%.1f", BMI);
			//	        input.close();
			String rheight   =  String.valueOf(height);
			String rweight   =  String.valueOf(weight);
			String BMIresult =  String.valueOf(result2); 
			String rwwaist   =  String.valueOf(result3);
			
			bmi bmi1 = new bmi();
			//  Write to Assessment BMI result
			CalcBMI.BMItoAssessment(BMI);	
			
			if (waist == 0) {
				bmi1.BMIhw(rheight,rweight,BMIresult,skeys);
			}else {
				bmi1.BMIhw(rheight,rweight,BMIresult,rwwaist,skeys);
			}
    }

}
		static void BMItoAssessment(double bMI) {
			System.out.println(" BMI result   :   " + bMI);
		//	fcp1.writeliner(Enter.wts + "/8ASS", "\t# Obesity BMI : [ " + rB+"\t"+ CurrentDateAdd_date.main("m")+" ]");
		//	fcp1.writeliner(Enter.wts + "/8ASS", "\t# Obesity BMI : [ " + rB+"\t"+ CurrentDateAdd_date.main("m")+" ]");
				
		}
}

class bmi{
	void BMIhw(String rh, String rw, String rB,String rwa, String skeys) throws Exception {	
	   String BMIheadline = ("\tHeight(cm)	Weight(kg)	BMI	Waist(cm)");
	   String Bresult = ("\t" + rh +"\t\t" + rw + "\t\t" + rB + "\t" + rwa);
	   File_cdrw_proc fcp1 = new File_cdrw_proc();
		fcp1.writeliner(Enter.wts + "/7LAB", BMIheadline);
		fcp1.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------Ⓑ");
		fcp1.writeliner(Enter.wts + "/7LAB", Bresult + "\n");

			fcp1.readfiler(Enter.wtss + "/6OBJ_List");
			New6OBJ.main(null);
	}

	void BMIhw(String rh, String rw, String rB, String skeys) throws Exception {	
	   String dliner = "-".repeat(15);
       String BMIheadline = ("\tHeight(cm)	Weight(kg)	 BMI");
       String Bresult = ("\t" + rh +" \t\t" + rw + "\t\t" + rB);
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", BMIheadline);
				fcp1.writeliner(Enter.wts + "/7LAB", "\t"+ dliner);
				fcp1.writeliner(Enter.wts + "/7LAB", Bresult + "\n");

			fcp1.readfiler(Enter.wtss + "/6OBJ_List");
			New6OBJ.main(null);
		}
}