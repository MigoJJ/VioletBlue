package je.panse.doro.comm.item_execute.souslab7;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP.Bpmain;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;
public class CalcBP {
	  public static void main(String[] args) throws Exception {
		Bpmain.main(null);
		File_cdrw_proc cpa1 = new File_cdrw_proc(); 
		cpa1.readfiler(Enter.wtss + "/6OBJ_List");
		New6OBJ.main(null);
	  }
}
