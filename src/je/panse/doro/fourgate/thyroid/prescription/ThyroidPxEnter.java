package je.panse.doro.fourgate.thyroid.prescription;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class ThyroidPxEnter {

    public static void main(String rowsData) throws IOException {
	    System.out.println("Entered Data: " + rowsData+"\n");
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		fcp1.writeliner(Enter.wts + "/9PLAN", "\t..."+rowsData);
	    
	    
}
}