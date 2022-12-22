package je.panse.doro.hito;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.key.Key_ClearConsoleScreen;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.*;
import je.panse.doro.comm.item_execute.souslab7.CalcBMI;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcCBC;
import je.panse.doro.comm.item_execute.souslab7.CalcCPA;
import je.panse.doro.comm.item_execute.souslab7.CalcCr;
import je.panse.doro.comm.item_execute.souslab7.CalcDEXA;
import je.panse.doro.comm.item_execute.souslab7.CalcEKG3;
import je.panse.doro.comm.item_execute.souslab7.CalcGOT;
import je.panse.doro.comm.item_execute.souslab7.CalcHbA1c;
import je.panse.doro.comm.item_execute.souslab7.CalcLpa;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT;
import je.panse.doro.comm.item_execute.souslab7.CalcVitD;

public class Itemcategory {
	public static void main(String selectkey) throws Exception {
		try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());

			switch (select_code) {
				case 1 : CalcBMI  lab1 = new CalcBMI(); lab1.main("Itemcategorykey");break;
				case 2 : CalcBP   lab2 = new CalcBP();  lab2.main("Itemcategorykey");break;
//				case 3 : CalcGFS  lab3 = new CalcGFS(); lab3.main("Itemcategorykey");break;					
				case 4 : CalcCPA  lab4 = new CalcCPA(); lab4.main("Itemcategorykey");break;					
				case 5 : CalcEKG3  lab5 = new CalcEKG3(); lab5.main("Itemcategorykey");break;
				case 7 : CalcDEXA lab7 = new CalcDEXA();lab7.main("Itemcategorykey");break;
				
			  	case 11 : CalcHbA1c	nl2 = new CalcHbA1c();nl2.main("Itemcategorykey");break;
				case 12 : CalcTFT  	nl3 = new CalcTFT(); 	nl3.main("Itemcategorykey");break;
				case 13 : CalcLpa	nl4 = new CalcLpa();	nl4.main("Itemcategorykey");break;
				case 14 : CalcCr  	nl5 = new CalcCr();		nl5.main("Itemcategorykey");break;
				case 15 : CalcVitD  	nl6 = new CalcVitD();	nl6.main("Itemcategorykey");break;
				case 16 : CalcCBC  	nl7 = new CalcCBC();		nl7.main("Itemcategorykey");break;
				case 17 : CalcLpa  	nl8 = new CalcLpa();		nl8.main("Itemcategorykey");break;
				case 18 : CalcGOT  	nl9 = new CalcGOT();		nl9.main("Itemcategorykey");break;
				default :
					Key_shortcut.main(select_code);
				}
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
		// ----------------------------------------------
}