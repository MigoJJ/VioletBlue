package je.panse.doro.hito.newsub;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcBMI;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcCPA;
import je.panse.doro.comm.item_execute.souslab7.CalcDEXA;
import je.panse.doro.comm.item_execute.souslab7.CalcEKG;

public class New6OBJ {
	public static void main(String skeys) throws Exception {
    	try (Scanner new_code = new Scanner(System.in)) {
			while (true) {
				int select_code = 0;
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : CalcBMI  lab1 = new CalcBMI();	lab1.main(null);break;
					case 2 : CalcBP   lab2 = new CalcBP(); 	lab2.main(null);break;
					case 4 : CalcCPA  lab4 = new CalcCPA(); lab4.main(null);break;					
					case 5 : CalcEKG  lab5 = new CalcEKG(); lab5.main(null);break;
					case 7 : CalcDEXA lab7 = new CalcDEXA();lab7.main(null);break;

					default :
						System.out.println(" uncertain ... please check  !!");
						Key_shortcut.main(select_code);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}