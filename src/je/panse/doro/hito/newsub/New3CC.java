package je.panse.doro.hito.newsub;

import java.io.IOException;				
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;  

public class New3CC {
	public static String a, b, c, f;
	public static void main(String[] args) throws Exception { 
	    try (Scanner s = new Scanner(System.in)) {
	    	System.out.println("Enter chief complain :");  	a = s.nextLine();
		    System.out.println("Enter duration:");	    	b = s.nextLine();
		    System.out.println("Enter year/month/day:");    	c = s.nextLine();
		    System.out.println("\nEnter... General state of health : Excellent/Good/Fair/Poor ...");
			yymmdd(c);
	    	egfp(f);
//			s.close();
	    	File_cw_chart dn1 = new File_cw_chart();
			dn1.deuxnine();
			Newcategory.main(null);
		}catch (IOException e) {
		e.printStackTrace();
		}
	}
	//------------------------------------------------
	static void yymmdd(String ymd) throws IOException {
		String chartline;
		switch(ymd) {
			case "y":   c = " year-ago";			    break;
			case "m":   c = " month-ago";			    break;
			case "w":   c = " week-ago";			    break; 
			case "d":   c = " day-ago";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
		chartline = "\n    " + a + " (onset " + b + c + ")\n";
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		fcp1.writeliner(Enter.wts + "/3CC", chartline);
						  
		}
	//------------------------------------------------
	static void egfp(String state) throws IOException {
		String chartline1;
		switch(state) {
			case "e":   f = "-- Excellent";			    break;
			case "g":   f = "-- Good";			    break;
			case "f":   f = "-- Fair";			    break;  
			case "p":   f = "-- Poor";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
		chartline1 = "General state of health:\n" + f + "  (no any significant state change since last visiting.)";
		File_cdrw_proc fcp2 = new File_cdrw_proc();
		fcp2.writeliner(Enter.wts + "/3CC", chartline1);
	}
//------------------------------------------------
}