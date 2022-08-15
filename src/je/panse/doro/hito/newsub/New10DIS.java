package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New10DIS {
	File_cdrw_proc  ob2 = new File_cdrw_proc();
	public void main(String args) throws Exception { 
		Newcategory 	cc1 = new Newcategory(); 
		Menu_list.main(Enter.wt + "/singlebeam/subnewmenu/Menu2ndLine/DisMenu"); 
		File_cw_chart 	dn1 = new File_cw_chart();
		
    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println(">>>-----Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
				String tarfile = (Enter.wt+"/knots/dise");
				switch (select_code) {
					case 1 : insert_dis("Diabetes Mellitus F/U", tarfile + "/diabetes" );break;
					case 2 : insert_dis("Hypertension F/U", tarfile + "/hypertension" );break;
					case 3 : insert_dis("Hypercholestarolemia F/U", tarfile + "/hyperchol" );break;
					case 41 : insert_dis("Hyperthyroidiam F/U", tarfile + "/thyhyper" );break;
					case 42 : insert_dis("Hypothyroidiam F/U", tarfile + "/thyhypo" );break;

					case 5 : insert_dis("Osteoporosis F/U", tarfile + "/osteoporosis" );break;

					default :
						System.out.println(" uncertain ... please check  !!");
					}
				dn1.deuxnine();
				Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
				cc1.main(null);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
	
	void insert_dis(String st, String fread) throws IOException {
    	String ccresult = ("\t" + st); 
		ob2.writeliner(Enter.wts + "/3CC", ccresult);
		ob2.rwfiler(fread, Enter.wts + "/9PLAN");
	}
		
// ----------------------------------------------
}