package je.panse.doro.comm.item_administratus.key;

import java.io.IOException;	

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.Run_another_jar;
import je.panse.doro.comm.item_administratus.file.File_DirAdmin;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_administratus.file.File_editor_proc;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Debut;
import je.panse.doro.main.Enter;
import je.panse.doro.main.SingleBeam;

public class Key_Iwbb {
	SingleBeam   	rk0 = new SingleBeam();
	Debut  rk1 =new Debut();      
	StartForm     rk2 = new StartForm();
	Newcategory   rk3 = new Newcategory();

	public void Key_Iwbb_Page(int select_code) throws IOException, Exception {
		File_DirAdmin   	rk13 = new File_DirAdmin();
		File_cw_chart 		rk11 = new File_cw_chart();
		File_editor_proc 	rk12 = new File_editor_proc();
		if (select_code == 9) { 
			rk11.deuxnine1();
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			returnkeylist("Newcategorykey");
		}
		else if(select_code == 99) { 
			rk11.deuxnine1();
			rk12.main(Enter.wt + "/samsara/ChartPlate");
			Menu_list.main(Enter.wt + "/singlebeam/StartMenuList");
			returnkeylist("StartFormkey");
		  }
		 else if (select_code == 999){
			rk11.deuxnine1();
			rk12.main(Enter.wt + "/samsara/ChartPlate");
			returnkeylist("SingleBeamkey");
		}
		 else if (select_code == 71){
			 CalcDitto ob4 = new CalcDitto();ob4.main(null);
			 Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			 returnkeylist("Newcategorykey");
		 }
		 else {
		 }
    }
	
	public void returnkeylist(String selectkey) throws IOException, Exception {
		if (selectkey!=null) {
			switch (selectkey) {
				case "SingleBeamkey" : rk0.main(null);	  	break;
			   	case "Debutkey" 	 : rk1.main(null);	  	break;
			   	case "StartFormkey"  : rk2.main(null);	  	break;
			   	case "Newcategorykey": rk3.main(null);	  	break;
			   	default :
			   		System.out.println(" uncertain ... please check  !!");
			}
		}
		else {
			rk3.main(null);
		}
	}
// ----------
}