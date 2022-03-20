package je.panse.doro.hito.newsub;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New4PMH {
	public static void main(String args) throws IOException { 
		String pmh;
		    try (Scanner s = new Scanner(System.in)) {
			    System.out.println("Enter PMH ...:");
		    	pmh = s.nextLine();
		    	
			File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writefiler(Enter.wts + "/4PMH", pmh);
			
			
   	    	File_cdrw_proc ari1 = new File_cdrw_proc();
	    	ari1.deletefiler(Enter.wts + "/ChartPlate");
	    	ari1.checkfiler(Enter.wts + "/ChartPlate");
	    	ari1.deletefiler(Enter.wts + "/Comment);");
	    	ari1.checkfiler(Enter.wts + "/Comment");
   			
   			File_cw_chart ari2 = new File_cw_chart();	 ari2.writechart();
			File_cw_chart nu3 = new File_cw_chart();   nu3.chartbackup();
			
			
			Newcategory np1 = new Newcategory();
			np1.main("");
			}
		}
	// ----------------------------------------------
}