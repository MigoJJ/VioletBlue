package je.panse.doro.hito;

import java.util.Scanner;					

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String[] string) throws Exception {
		File_cw_chart 	st1	= new File_cw_chart();
		Newcategory 		st2 = new Newcategory(); 
		Diseasecategory 	st3 = new Diseasecategory(); 
		Key_Iwbb 			st5 = new Key_Iwbb();
		try {
		    int select_code = 1;
		    Scanner case_code = new Scanner(System.in);
		    while (true) {
		        System.out.println(">>> Enter selected code number ...>>>   : ");
		        select_code = case_code.nextInt();

		        switch (select_code) {
		            case 1:
		                Menu_list.main(Enter.wtsi + "/ChartPopUpMenu");
		                st1.callchartlist("/knots/hana");
		                st2.main(null);
		                break;
		            case 2:
		                Menu_list.main(Enter.wtsi + "/ChartPopUpMenu");
		                st1.callchartlist("/knots/soap");
		                st2.main(null);
		                break;
		            case 3:
		                Menu_list.main(Enter.wd + "/fourgate/FourgateMenu");
		                st3.main(null);
		                break;
		            default:
		                Key_shortcut.main(select_code);
		        }
		    }
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
   	}
}