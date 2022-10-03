package je.panse.doro.comm.item_administratus;

import je.panse.doro.comm.Key_Iwbb;	
import je.panse.doro.comm.item_execute.CalcASS;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_execute.souslab7.CalcBMI;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcHbA1c;
import je.panse.doro.fourgate.description.Get_ExceltoJtable02;
import je.panse.doro.hito.newsub.New10DIS;
import je.panse.doro.hito.newsub.New9PLAN;

public class Key_shortcut {
	public static void main(int select_code) throws Exception {
	   	switch (select_code) {
		case 10 : New10DIS nd1 = new New10DIS(); 	nd1.main(null);break;
		case 41 : CalcBMI ob0 = new CalcBMI();	 	ob0.main(null);break;
		case 42 : CalcBP ob1 = new CalcBP();	 	ob1.main(null);break;
		case 51 : CalcHbA1c ob2 = new CalcHbA1c();ob2.main(null);break;
		case 61 : CalcASS ob3 = new CalcASS();	 	ob3.main(null);break;
		case 71 : CalcDitto ob4 = new CalcDitto();ob4.main(null);break;
		case 72 : Get_ExceltoJtable02 ob5 = new Get_ExceltoJtable02();ob5.main(null);break;
		case 73 : New9PLAN ob6 = new New9PLAN(); ob6.more_description(null);break;
		
   		case 9 : case 99: case 999 :	
   			Key_Iwbb st999 = new Key_Iwbb(); 
   			st999.Key_Iwbb_Page(select_code); break;
		default :
			System.out.println(" uncertain ... please check  !!");
	   	}
	}

}
