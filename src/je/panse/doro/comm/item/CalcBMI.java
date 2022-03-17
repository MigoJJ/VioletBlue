package je.panse.doro.comm.item;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcBMI {
	    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input weight in kilogram: ");
	        double weight = input.nextDouble();

	        System.out.print("Input height in meter: ");
	        double inches = input.nextDouble();

	        System.out.print("Input waist in centimeter: ");
	        double waist = input.nextDouble();
	        
//	        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        double BMI = weight / (inches* inches);
	        input.close();
	        
	        DecimalFormat df = new DecimalFormat("##.#");
//	        System.out.println("Original input value: " + BMI);
	        System.out.println("Using DecimalForamt: Body Mass Index is " + df.format(BMI));
	        System.out.println("Waist : " + waist + "cm");
	        

	    }
	}