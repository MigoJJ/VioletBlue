package je.panse.doro.hito;

import java.util.Scanner;					
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_execute.*;

public class Itemcategory {
	public static void main(String selectkey) throws Exception {
		try (Scanner new_code = new Scanner(System.in)) {
					System.out.println("Enter selected code number ...   : ");
					int select_code = new_code.nextInt();
		
					switch (select_code) {
						case 1 : CalcBMI  lab1 = new CalcBMI(); lab1.main("Itemcategorykey");break;
						case 2 : CalcBP   lab2 = new CalcBP();  lab2.main("Itemcategorykey");break;
//						case 3 : CalcGFS  lab3 = new CalcGFS(); lab3.main("Itemcategorykey");break;					
						case 4 : CalcCPA  lab4 = new CalcCPA(); lab4.main("Itemcategorykey");break;					
						case 5 : CalcEKG  lab5 = new CalcEKG(); lab5.main("Itemcategorykey");break;
						case 7 : CalcDEXA lab7 = new CalcDEXA();lab7.main("Itemcategorykey");break;
						
					  	case 11 : CalcHbA1c	nl2 = new CalcHbA1c();nl2.main("Itemcategorykey");break;
						case 12 : CalcTFT  	nl3 = new CalcTFT(); 	nl3.main("Itemcategorykey");break;
						case 13 : CalcChol	nl4 = new CalcChol();	nl4.main("Itemcategorykey");break;
						case 14 : CalcCr  	nl5 = new CalcCr();		nl5.main("Itemcategorykey");break;
						case 15 : CalcVitD  	nl6 = new CalcVitD();	nl6.main("Itemcategorykey");break;
						case 16 : CalcCBC  	nl7 = new CalcCBC();		nl7.main(Itemcategorykey);break;


						case 9 : case 99 : case 999 :
					   			Key_Iwbb st999 = new Key_Iwbb();
					   			st999.Key_Iwbb_Page(select_code); break;
						default :System.out.println(" uncertain ... please check  !!");
						}
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
		// ----------------------------------------------
}