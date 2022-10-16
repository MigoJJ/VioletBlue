package je.panse.doro.hito.newsub;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcCBC;
import je.panse.doro.comm.item_execute.souslab7.CalcChol;
import je.panse.doro.comm.item_execute.souslab7.CalcCr;
import je.panse.doro.comm.item_execute.souslab7.CalcGOT;
import je.panse.doro.comm.item_execute.souslab7.CalcHbA1c;
import je.panse.doro.comm.item_execute.souslab7.CalcLpa;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT2;
import je.panse.doro.comm.item_execute.souslab7.CalcVitD;

public class New7LAB {
	public static void main(String args) throws Exception { 
    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
				switch (select_code) {
			  	case 1 : CalcHbA1c	nl2 = new CalcHbA1c(); 	nl2.main(null);break;
				case 2 : CalcTFT   	nl3 = new CalcTFT(); 	nl3.main(null);break;
					case 22 : CalcTFT2  	nl33 = new CalcTFT2(); 	nl33.main(null);break;
				case 3 : CalcChol 	nl4 = new CalcChol();	nl4.main(null);break;
				case 4 : CalcCr	 	nl5 = new CalcCr();		nl5.main(null);break;
				case 5 : CalcVitD  	nl6 = new CalcVitD();	nl6.main(null);break;
				case 6 : CalcCBC  	nl7 = new CalcCBC();		nl7.main(null);break;
				case 7 : CalcLpa  	nl8 = new CalcLpa();		nl8.main(null);break;
				case 8 : CalcGOT  	nl9 = new CalcGOT();		nl9.main(null);break;

				default :
					System.out.println(" uncertain ... please check  !!");
					Key_shortcut.main(select_code);
				}
			}
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
// ----------
}
