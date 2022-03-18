package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;


public class new6OBJ {
	public static void main(String args) throws IOException { 

		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/MenuList/SubMenu/6OBJ_List");

    	try (Scanner input = new Scanner(System.in)) {

//        input.close();
    		
			} catch (NumberFormatException e) {
			e.printStackTrace();
			}
	}
// ----------------------------------------------
}
