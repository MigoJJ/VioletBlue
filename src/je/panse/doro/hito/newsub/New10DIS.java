package je.panse.doro.hito.newsub;

import java.io.IOException;		
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcHbA1c;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New10DIS {
	File_cdrw_proc  ob2 = new File_cdrw_proc();
	Newcategory 	  cc1 = new Newcategory(); 
	File_cw_chart   dn1 = new File_cw_chart();

	public void main(String args) throws Exception {
	    Menu_list.main(Enter.wtss + "/Menu2ndLine/DisMenu");
	    try (Scanner new_code = new Scanner(System.in)) {
	        int select_code = 0;
	        while (true) {
	            System.out.println(">>>-----Enter selected code number ...   : ");
	            select_code = Integer.valueOf(new_code.nextLine().trim());
	            String tarfile = (Enter.wt + "/knots/dise");
	            switch (select_code) {
	                case 1:
	                    insert_dis("Diabetes Mellitus F/U", tarfile + "/diabetes");
	                    CalcHbA1c chba1c = new CalcHbA1c();
	                    chba1c.main(null);
	                    break;
	                case 2:
	                    insert_dis("Hypertension F/U", tarfile + "/hypertension");
	                    CalcBP cbp = new CalcBP();
	                    cbp.main(null);
	                    break;
	                case 3:
	                    insert_dis("Hypercholestarolemia F/U", tarfile + "/hyperchol");
	                    break;
	                case 41:
	                    insert_dis("Hyperthyroidism F/U", tarfile + "/thyhyper");
	                    break;
	                case 42:
	                    insert_dis("Hypothyroidiam F/U", tarfile + "/thyhypo");
	                    break;
	                case 5:
	                    insert_dis("Osteoporosis F/U", tarfile + "/osteoporosis");
	                    break;
	                default:
	                    Key_shortcut.main(select_code);
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
}
