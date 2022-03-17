package je.panse.doro.hito;

import java.io.IOException;						
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String args []) throws IOException {
    	File_cdrw_proc ob2 = new File_cdrw_proc(); 
        	ob2.readfiler(Enter.wt + "/MenuList/StartMenuList");

   			try (Scanner d_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String n_code = d_code.nextLine();  // Read user input
				
			switch (n_code) {
						  case "1" : newcategory.main(n_code);  	break;
		//				  case "2" : SOAPInput.main(n_code);  	break;
		//				  case "3" : SOAPInput.main(n_code);  	break;
		//				  case "4" : SOAPInput.main(n_code);  	break;
					}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
// --------------------------------------------------------
    }
}