package je.panse.doro.comm;

import java.io.IOException;

import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class Key_returnquit {

	public void mainquit(String st) {
	    	System.out.println("Inserted code finished  ^^!!!  ");
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
	    	try {
				File_cw_chart dn1 = new File_cw_chart();
				Newcategory si1= new Newcategory(); 
					dn1.deuxnine();
					si1.main(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	
	}
//------------------
}