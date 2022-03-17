package je.panse.doro.hito.newsub;

import java.io.IOException;		
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newcategory;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;  

public class new3CC {
	public static String a, b, c, f, chartline, chartline1;
	
	public static void main(String args[]) throws IOException { 
		    try (Scanner s = new Scanner(System.in)) {
			    System.out.println("Enter chief complain :");
			    	a = s.nextLine();
			    System.out.println("Enter duration:");
			    	b = s.nextLine();
			    System.out.println("Enter year/month/day:");
			    	c = s.nextLine();
			    System.out.println("\nEnter... General state of health : Excellent/Good/Fair/Poor ...");
			    	f = s.nextLine();
			yymmdd(c);
	    	egfp(f);
			s.close();
// ("Public methods must be called by creating objects");
//			Enter.main(null);
			newcategory np1 = new newcategory();
			np1.main("");
			
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		//------------------------------------------------
	static void yymmdd(String ymd) {
		 switch(ymd) {
				  case "y":   c = " year-ago";			    break;
				  case "m":   c = " month-ago";			    break;
				  case "w":   c = " week-ago";			    break; 
				  case "d":   c = " day-ago";			    break;  
				  default :   c = " uncertain ... please check  !!";
				}
				  chartline = "C.C. " + a + " (onset " + b + c + ")\n";
				  System.out.println(chartline);
		}
		//------------------------------------------------
	static void egfp(String state) {
			  switch(state) {
					  case "e":   f = "-- Excellent";			    break;
					  case "g":   f = "-- Good";			    break;
					  case "f":   f = "-- Fair";			    break;  
					  case "p":   f = "-- Poor";			    break;  
					  default:    f = "   uncertain ... please check  !!";
					}
			  		chartline1 = "General state of health:\n" + f + "  (no any significant state change since last visiting.)\n";
					System.out.println(chartline1);
	}
//------------------------------------------------
}