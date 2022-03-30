package je.panse.doro.comm;

import java.io.File;
import java.io.IOException;

import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class Key_Iwbb {
	public void Key_Iwbb_Page(int select_code) throws IOException, Exception {
		 if (select_code == 9) { 
			 System.out.println("gugu  =9 :");
		 }
		 else if (select_code == 99) {
			 System.out.println("gugu  =99 :");
			 NineDeux.deuxnine();
			 StartForm st3 = new StartForm();
			 st3.main(null);
		  }
		  else if (select_code == 999){
			 File_cw_chart st4 = new File_cw_chart();
			 st4.chartbackup();
			 File_editor_proc st5 = new File_editor_proc();
			 st5.main(null);
		
			 System.out.println("gugu  =999 :");
			 File fin = new File(Enter.wts);
			 File[] finlist = fin.listFiles();       
			 	for (int n = 0; n < finlist.length; n++) {
		            if (finlist[n].isFile()) {
		            System.gc();
		            Thread.sleep(10);
		                finlist[n].delete();
		         	SingleBeam st2 = new SingleBeam();
		         	st2.main(null);
		            }
		        }
		  }
		  else {
		  }
	}
// ----------
}