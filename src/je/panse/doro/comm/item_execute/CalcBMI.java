package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

class bmi{
	void BMIhw(String rh, String rw, String rB,String rwa) throws Exception {			
		File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/6OBJ", rh);
			fcp1.writeliner(Enter.wts + "/6OBJ", rw);
			fcp1.writeliner(Enter.wts + "/6OBJ", rB);
			fcp1.writeliner(Enter.wts + "/6OBJ", rwa);
		New6OBJ np2 = new New6OBJ();
			np2.main("");
	}
	void BMIhw(String rh, String rw, String rB) throws Exception {			
		File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/6OBJ", rh);
			fcp1.writeliner(Enter.wts + "/6OBJ", rw);
			fcp1.writeliner(Enter.wts + "/6OBJ", rB);
		New6OBJ np2 = new New6OBJ();
			np2.main("");
	}
}

public class CalcBMI {
	public void main(String[] Strings) throws Exception {
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
				bmi1.BMIhw(rheight,rweight,BMIresult);
			}else {
				bmi1.BMIhw(rheight,rweight,BMIresult,rwwaist);
			}
        }
    }
// ----------	
}	