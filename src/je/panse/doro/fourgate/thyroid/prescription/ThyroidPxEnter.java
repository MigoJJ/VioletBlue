package je.panse.doro.fourgate.thyroid.prescription;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class ThyroidPxEnter {

    public static void main(String rowsData) throws IOException {
	    System.out.println("Entered Data: " + rowsData+"\n");
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		fcp1.writeliner(Enter.wts + "/9PLAN", "\t..."+rowsData);
		
		try {
			if (rowsData.startsWith("  .")) {
				fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
				New6OBJ.main(null);
			}
			else {
				ThyroidJTableInput.main(null);

				}
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	    
	    
}
}