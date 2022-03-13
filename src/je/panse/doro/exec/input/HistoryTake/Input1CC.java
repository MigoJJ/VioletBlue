package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.comm.ReadWriteToChartPlate;
import je.panse.doro.main.Enter;
import je.panse.doro.main.PlatePrepUpdate;  

public class Input1CC {
	static String a;
	static String b;
	static String c;
	static String f;
	static String chartline;
	static String chartline1;
		 public static void main(String args[]) 
		 {
			    Scanner s = new Scanner(System.in);
			    System.out.print("Enter chief complain :");
			    	a = s.nextLine();
			    System.out.print("Enter duration:");
			    	b = s.nextLine();
			    System.out.print("Enter year/month/day:");
			    	c = s.nextLine();
				yymmdd(c);
				
			    Scanner d = new Scanner(System.in);
			    System.out.print("\nEnter... General state of health : Excellent/Good/Fair/Poor ...");
			    	f = d.nextLine();
		    	egfp(f);
		    	
		    	
				  try {
					ManageFile.deletefiler(Enter.wtf + "/3CC");
					ManageFile.checkfiler(Enter.wtf + "/3CC");
					ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
					ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
//					
					ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline);
					ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline1);
					
					PlatePrepUpdate.main(args);
					

				  } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				  }
		}
		//------------------------------------------------
		 static void yymmdd(String ymd) {
			 switch(ymd) {
					  case "y":   c = "  year-ago";			    break;
					  case "m":   c = "  month-ago";			    break;
					  case "w":   c = "  week-ago";			    break; 
					  case "d":   c = "  day-ago";			    break;  
//					  default:    c = "  uncertain ... please check  !!";
 					  default:    ;
					}
					  chartline = "C.C. " + a + " (onset " + b + c + ")";
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
			  		chartline1 = "General state of health:\n" + f + "  (no any significant state change since last visiting.)";
					System.out.println(chartline1);
	}
//------------------------------------------------
}