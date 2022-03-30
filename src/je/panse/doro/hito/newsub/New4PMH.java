package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New4PMH {
	public static void main(String[] args) throws Exception { 
	    try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter PMH ...:");
			String pmh = s.nextLine();
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/4PMH", "\n\t" + pmh);
			File_cw_chart dn1 = new File_cw_chart();
				dn1.deuxnine();
	   		Newcategory.main(null);
		}
	}
	// ----------------------------------------------
}