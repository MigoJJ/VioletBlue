package je.panse.doro.comm;

import java.io.IOException;
import je.panse.doro.comm.item_administratus.DirectoryAdmin;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.hito.Itemcategory;
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
	Itemcategory  rk4 = new Itemcategory();

	public void Key_Iwbb_Page(int select_code) throws IOException, Exception {
		DirectoryAdmin   	rk13 = new DirectoryAdmin();
		File_cw_chart 	rk11 = new File_cw_chart();
		File_editor_proc 	rk12 = new File_editor_proc();
		if (select_code == 9) { 
			rk11.deuxnine1();
//			rk12.main(Enter.wt + "/tripikata/ChartPlate");
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
			rk13.clear_Directory(Enter.wts);
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
		//	   	case "Discategorykey": rk5.main(null);	  	break;
			   	case "Itemcategorykey": 
			   		Menu_list.main(Enter.wt + "/singlebeam/ItemMenu");
			   							  rk4.main(selectkey);break;
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