package je.panse.doro.exec.input.la;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.*;
import je.panse.doro.main.Enter;

public class ChiefComplain {
// --------------------------------------------			
	public static void ccScan() throws IOException {
		System.out.println("Enter values:");
	    try (Scanner scan = new Scanner(System.in)) {
			String chiefcomplain = scan.nextLine();
			String onset = scan.nextLine();
			String duration = scan.nextLine();

			switch (duration) {
			  case "y" : duration = " year-ago";  	break;
			  case "m" : duration = " month-ago";  break;
			  case "d" : duration = " day-ago";  	break;
			  case "f" : System.out.println(" Good Job  Migo WJ ~~^^"); break;
			}
			ccPrint(chiefcomplain, onset, duration );
		}
}
// --------------------------------------------	
	public static void ccPrint(String chiefcomplain, String onset, String dutation) 
			throws IOException {

	    System.out.println("C.C   " + chiefcomplain + "  (onset " + onset + dutation + ")");
	    String chiefComplainC = ("C.C.   " + chiefcomplain + "  (onset " + onset + dutation + ")");
	    
	    ManageFile.writefiler(chiefComplainC);
	    ReadWriteToFile.readWTF(Enter.wcc);
	    }
// --------------------------------------------
}