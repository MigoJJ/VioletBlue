package je.panse.doro.fourgate.thyroid.prescription;

import java.io.IOException;									
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;  

public class sel_px {
	static String a, b, c, f;
	File_cdrw_proc 	fcp = new File_cdrw_proc();
	File_cw_chart 	dn1 = new File_cw_chart();
	Newcategory 	cc1 = new Newcategory(); 
	
	public void main(String[] args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println(">>>>>> Enter medication name :>>>");  	
			System.out.println(">>>----- Enter [ mg | ug ] >>>");
			System.out.println(">>>----- Enter dosage [ tablet ] :>>>");
			System.out.println(">>>----- Enter p.o. qod qd bid tid others [ tablet ] :>>>");

			a = s.nextLine();
			b = s.nextLine();
			c = s.nextLine();
			f = s.nextLine().trim();
			
			if (f != null && !f.isEmpty()) {
	   			egfp(a,b,c,f);
	   		}
			else {
				
				
			}
			//			s.close();
			dn1.deuxnine();
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			cc1.main(null);
		}catch (IOException e) {
		e.printStackTrace();
		}
	}

	void egfp(String a, String b, String c, String f) throws IOException {
		String p1 = null,mgug = "mg", p4 = null;
		switch(a) {
			case "s": p1 = "Synthroid";	mgug = "ug"; break;
			case "ss":  p1 = "Synthyroxine"; mgug = "ug";break;
			case "m": p1 = "Methimazole";break;  
			case "a": p1 = "Antiroid";break;  
			case "c": p1 = "Camen";break;  
			case "i": p1 = "Indenol";break;  
			default :   p4 = " uncertain ... please check  !!";
		}
		switch(f) {
			case "0.5": p4 = "p.o q.o.d";break;
			case "1":  p4 = "p.o. q.d.";break;
			case "2": p4 = "p.o. b.i.d.";break;  
			case "3": p4 = "p.o. t.i.d.";break;  
			default :   p4 = " uncertain ... please check  !!";
		}
		String thyPresc = String.format("\n\t...%s  [ %s ] %s [ %s ] tab %s",p1,b,mgug,c,p4);
		fcp.writeliner(Enter.wts + "/9PLAN", thyPresc);
	}
//------------------------------------------------
}
