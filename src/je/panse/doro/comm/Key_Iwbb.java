package je.panse.doro.comm;

import java.io.IOException;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.comm.item_execute.CalcACC;
import je.panse.doro.comm.item_execute.CalcBP;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_execute.CalcHbA1c;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.hito.newsub.New3CC;
import je.panse.doro.hito.newsub.New4PMH;
import je.panse.doro.hito.newsub.New5SUJ;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.hito.newsub.New8ACC;
import je.panse.doro.hito.newsub.New9PLAN;
import je.panse.doro.main.Debut;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class Key_Iwbb {
	SingleBeam   	rk0 = new SingleBeam();
	Debut   		rk1 = new Debut();
	StartForm     rk2 = new StartForm();
	Newcategory   rk3 = new Newcategory();
	Itemcategory  rk4 = new Itemcategory();
//	Discategory   rk5 = new Discategory();
	File_cdrw_proc rk14 = new File_cdrw_proc();

	public void Key_Iwbb_Page(int select_code) throws IOException, Exception {
		File_cw_chart 	rk11 = new File_cw_chart();
		File_editor_proc 	rk12 = new File_editor_proc();
		DirectoryAdmin   	rk13 = new DirectoryAdmin();

		if (select_code == 9) { 
			rk11.deuxnine();
			returnkeylist("Newcategorykey");
		 }
<<<<<<< HEAD
		 else if (select_code == 99) {			rk11.deuxnine();
=======
		 else if (select_code == 99) {			
			rk11.deuxnine();
>>>>>>> refs/remotes/origin/0407_up
			returnkeylist("StartFormkey");
		  }
		 else if (select_code == 999){
			rk11.deuxnine();
			rk12.main(Enter.wt + "/tripikata/ChartPlate");
			rk13.clear_Directory(Enter.wts);
			returnkeylist("SingleBeamkey");
		            }
		 else {
		  }
	}
	
	public void returnkeylist(String selectkey) throws IOException, Exception {
		if (selectkey!=null) {
			switch (selectkey) {
			   	case "Debutkey" : rk0.main(null);	  	break;
			   	case "StartFormkey" : rk2.main(null);	  	break;
			   	case "Newcategorykey" : rk3.main(null);	  	break;
		//	   	case "Discategorykey" : rk5.main(null);	  	break;
			   	case "Itemcategorykey" : 
			   		rk14.readfiler(Enter.wt + "/singlebeam/ItemMenu");
			   		rk4.main(selectkey);	  	break;
			   	default :System.out.println(" uncertain ... please check  !!");
			}
		}
		else {
			rk3.main(null);
		}
	}
// ----------
}