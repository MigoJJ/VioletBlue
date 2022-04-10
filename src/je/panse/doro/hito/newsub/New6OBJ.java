package je.panse.doro.hito.newsub;

import java.util.Scanner;			
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.*;
import je.panse.doro.main.Enter;

public class New6OBJ {
	public static void main(String skeys) throws Exception {
		skeys=null;
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    		ob2.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : CalcBMI  lab1 = new CalcBMI();	lab1.main(null);break;
					case 2 : CalcBP   lab2 = new CalcBP(); 	lab2.main(null);break;
					case 4 : CalcCPA  lab4 = new CalcCPA(); 	lab4.main(null);break;					
					case 5 : CalcEKG  lab5 = new CalcEKG(); 	lab5.main(null);break;
					case 7 : CalcDEXA lab7 = new CalcDEXA(); 	lab7.main(null);break;

					case 9 : case 99 : case 999 :
			   			Key_Iwbb st999 = new Key_Iwbb();
			   			st999.Key_Iwbb_Page(select_code); break;
					default :System.out.println(" uncertain ... please check  !!");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}
