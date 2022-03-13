package je.panse.doro.comm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcBP {
		public static String BPresult;
		public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input SBP   mmHg : ");
	        int SBP = input.nextInt();
	        
	        System.out.print("Input DBP   mmHg : ");
	        int DBP = input.nextInt();

	        System.out.print("Input pulse rate / minute : ");
	        int PR = input.nextInt();

	        
//	        DecimalFormat df = new DecimalFormat("##.#");
//	        System.out.print("BP : [ " + SBP +  "  /  " + DBP + " ] mmHg" 
//	        			+ " PR [ " + PR + " ] /minute");
//	        System.out.println("  Regular Left-seated-Position ");
	        
	        
	        BPresult = ("\n\nBP : [ " + SBP +  "  /  " + DBP + " ] mmHg" 
			+ " PR [ " + PR + " ] /minute" + "  Regular Left-seated-Position ");
	    }
	}