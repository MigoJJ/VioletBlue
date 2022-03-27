package je.panse.doro.comm.item_exec;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcHbA1c {
	public static int Glucose;
	public static double HbA1c;
	public static String  Gluresult;
	
	public static void main(String args) throws Exception { 

    	try (Scanner input = new Scanner(System.in)) {
	        System.out.print("========= Input Glucose : ");
	        Glucose = input.nextInt();
	        
	        System.out.print("========= Input HbA1c  : ");
	        HbA1c = input.nextDouble();
//      input.close();

	        Gluresult = ("    FBS     : [ " + Glucose +  " ] mg/dl" 
	        			+ "     HbA1c [ " + HbA1c + " ] %\n");

			System.out.print(Gluresult);
			
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writefiler(Enter.wts + "/7LAB", Gluresult);
			New7LAB.main("");
			
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
//---------------------------------------------------		
}