package je.panse.doro.hito.newsub;

import java.io.IOException;					
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;  

public class New3CC {
	static String a, b, c, f;
	File_cw_chart dn1 = new File_cw_chart();
	Newcategory cc1 = new Newcategory(); 
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	
	public void main(String[] args) throws Exception {

	    try (Scanner s = new Scanner(System.in)) {
	    	System.out.println("Enter chief complain :");  	a = s.nextLine();
		    System.out.println("Enter duration:");	    	b = s.nextLine();

			Integer bint = Integer.valueOf(b);
			if (bint == 99 | bint >= 1990) {
				simplecc(bint);
				dn1.deuxnine();
				cc1.main(null); 	
			}
			System.out.println("Enter year/month/day:");    	c = s.nextLine();
			System.out.println("\nEnter... state of health E/G/F/P...");
		    														f = s.nextLine();
			yymmdd(c);
	    	egfp(f);
//			s.close();
			dn1.deuxnine();
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			cc1.main(null);
		}catch (IOException e) {
		e.printStackTrace();
		}
	}
	//------------------------------------------------
	void yymmdd(String ymd) throws IOException {
		String chartline;
		switch(ymd) {
			case "y":   c = " year-ago";			    break;
			case "m":   c = " month-ago";			    break;
			case "w":   c = " week-ago";			    break; 
			case "d":   c = " day-ago";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
		chartline = "\n    " + a + " (onset " + b + c + ")\n";
		fcp1.writeliner(Enter.wts + "/3CC", chartline);
						  
		}
	//------------------------------------------------
	void egfp(String state) throws IOException {
		String chartline1;
		switch(state) {
			case "e":   f = "-- Excellent";		    break;
			case "g":   f = "-- Good";			    break;
			case "f":   f = "-- Fair";			    break;  
			case "p":   f = "-- Poor";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
		chartline1 = "\tGeneral state :  " + f + "  (no any significant state change)";
		fcp1.writeliner(Enter.wts + "/3CC", chartline1);
	}
	//------------------------------------------------
	void simplecc(int bint) throws IOException {
		if (bint == 99) {
			String chartline4 = ("\t" + a) ;
			fcp1.writeliner(Enter.wts + "/3CC", chartline4);
		}
		else if (bint >= 1900) {
			String chartline3 = ( "\t" + a + "  " + bint + " year-diagnosed");
			fcp1.writeliner(Enter.wts + "/3CC", chartline3);
		}
	}
//------------------------------------------------
}