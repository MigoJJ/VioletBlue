package je.panse.doro.comm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcGlucose {
	    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input FBS   mg/dL : ");
	        int FBS = input.nextInt();
	        
	        System.out.print("Input PP2   mg/dL : ");
	        int PP2 = input.nextInt();

	        System.out.print("Input HbA1c  %  : ");
	        double HbA1c = input.nextDouble();

	        
	        DecimalFormat df = new DecimalFormat("##.#");
	        System.out.print("FBS  /  PP2  value: [ " + FBS +  "  /  " + PP2 + " ]mg/dL");
	        System.out.println("      HbA1c is [ " + df.format(HbA1c) + " ]%");
	    }
	}