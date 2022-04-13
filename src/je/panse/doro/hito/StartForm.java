package je.panse.doro.hito;

import java.util.Scanner;		

import je.panse.doro.comm.*;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String[] string) throws Exception {
		File_cw_chart st3 = new File_cw_chart();
		Key_Iwbb st5 = new Key_Iwbb();
		Newcategory st2 = new Newcategory(); 
		Diseasecategory st4 = new Diseasecategory(); 
		try {	
			int select_code =1;
			while (true) {
				Scanner case_code = new Scanner(System.in);
				System.out.println(">>> Enter selected code number ...>>>   : ");
				select_code = case_code.nextInt();
				switch (select_code) {
					case 1 :
						Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu"); 
						st2.main(null);break;
					case 2 :
						Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu"); 
						st3.callchartlist("/knots/soap");
						st2.main(null);break;
					case 3 :
						Menu_list.main(Enter.wt + "/singlebeam/DisMenu"); 
						st4.main(null);break;  // Disease Category
					case 4 :
						Menu_list.main(Enter.wt + "/singlebeam/ItemMenu");
						Itemcategory itc = new Itemcategory();
						itc.main(null);break; // Items		
			   		case 999:
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