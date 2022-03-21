package je.panse.doro.comm.item;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcBMI {
	    public static void main(String[] Strings) throws IOException {

	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Input weight in kilogram: ");
				double weight = input.nextDouble();

				System.out.print("Input height in meter: ");
				double inches = input.nextDouble();

				System.out.print("Input waist in centimeter: ");
				double waist = input.nextDouble();
				
				double BMI = weight / (inches* inches);
				String result2 = String.format("%.1f", BMI);
				
//	        input.close();
			
				String BMIresult = (" BMI : [ " + result2 +  " ] kg/m2"); 
				System.out.print(BMIresult);
		
				File_cdrw_proc fcp1 = new File_cdrw_proc();
					fcp1.writefiler(Enter.wts + "/6OBJ", BMIresult);
				New6OBJ np2 = new New6OBJ();
					np2.main("");
	        }
	    }
	}