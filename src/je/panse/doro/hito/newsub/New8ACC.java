package je.panse.doro.hito.newsub;

import java.io.IOException;		
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.item.CalcACC;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New8ACC {
	public static void main(String args) throws IOException { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/submenu/8ACC_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;

			while (true) {
			if (select_code == 99) { break; }
		 	
			System.out.println("Enter selected code number ...   : ");
			select_code = Integer.valueOf(new_code.nextLine().trim());

			switch (select_code) {
				case 1 : CalcACC ob3 = new CalcACC(); 
						 ob3.main(null); 				
						 break;
//				case 2 : new3CC.main(null);	  	break;
				
//			    case 2 : new4PMH.main(null);  	break;
//					  case "3" : new5SUJ.main(null);  	break;

//					  case "5" : new7LAB.main(null);  	break;
//					  case "6" : new8ACC.main(null);  	break;
//					  case "7" : new9PLAN.main(null);  	break;
//					  case "c" : Com.main(null);  	break;
//					  case "q" : InputButton.quitButton(null);  	break;
//					  case "qq" : InputQuitSave.main(null);  	break;
			  case 9 :
		   	    	File_cdrw_proc ari1 = new File_cdrw_proc();
			    	ari1.deletefiler(Enter.wts + "/ChartPlate");
			    	ari1.checkfiler(Enter.wts + "/ChartPlate");
			    	ari1.deletefiler(Enter.wts + "/Comment);");
			    	ari1.checkfiler(Enter.wts + "/Comment");
		   			
		   			File_cw_chart ari2 = new File_cw_chart();	 
		   			ari2.writechart();
					
		   			File_cw_chart nu3 = new File_cw_chart();   
					nu3.chartbackup();
				  
					Newcategory ari4 = new Newcategory();      		 
					ari4.main(null);
			  		break;								
				}
			}
			} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}
