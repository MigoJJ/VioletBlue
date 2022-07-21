package je.panse.doro.hito;

import java.util.Scanner;			

import je.panse.doro.comm.*;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String[] string) throws Exception {
		File_cw_chart 		st1	= new File_cw_chart();
		Newcategory 		st2 = new Newcategory(); 
		Diseasecategory 	st3 = new Diseasecategory(); 
		Itemcategory 		st4 = new Itemcategory();
		Key_Iwbb 			st5 = new Key_Iwbb();

		try {	
			int select_code =1;
			while (true) {
				Scanner case_code = new Scanner(System.in);
				System.out.println(">>> Enter selected code number ...>>>   : ");
				select_code = case_code.nextInt();
				switch (select_code) {
					case 1 :
						Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu"); 
						st1.callchartlist("/knots/hana");
						st2.main(null);break;
					case 2 :
						Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu"); 
						st1.callchartlist("/knots/soap");
						st2.main(null);break;
					case 3 :
						Menu_list.main(Enter.wd + "/fourgate/FourgateMenu"); 
						st3.main(null);break;  // Disease Category
					case 4 :
						Menu_list.main(Enter.wt + "/singlebeam/ItemMenu");
						st4.main(null);break; // Items		

					case 9 : case 99: case 999:
			   			st5.Key_Iwbb_Page(select_code);	break;
					default :
						System.out.println(" uncertain ... please check  !!");
				}
			}			
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
   	}
// ----------
}