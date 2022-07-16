package je.panse.doro.comm.item_execute.soussymp12;

import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class SymptomEnter {
	public void main(String[] args) throws Exception {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
       ccs.main(null);
       
		String excelFilePath = ("/home/migowj/git/Violetblue/src/je/panse/doro/aeternum/dataxlsx/Sympt12List1.xlsx");

		R_rl_excel4 rre1 = new R_rl_excel4();
		rre1.main(0,0,excelFilePath);
		
		Integer submenuNo = 1;
			try {
				while(submenuNo != 9) {
					System.out.println(">>> insert code ...");
					Scanner sc = new Scanner(System.in);
						submenuNo = sc.nextInt();
						System.out.println("User input: " + submenuNo);	
						
						String ret = R_rl_excel_pick.R_rl_excel_point(submenuNo-1,0,0,excelFilePath);		
//						System.out.println(ret);		


				}
//
//						
//						
//						
//						R_rl_excel3 rre1 = new 	R_rl_excel3();
//						File_cdrw_proc fcp1 = new File_cdrw_proc();
//										fcp1.writeliner(Enter.wts + "/9PLAN", "");
//										rre1.R_rl_excel_point(submenuNo-1,0,0);
//				}  
//				File_cdrw_proc fcp1 = new File_cdrw_proc(); 
//				fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
//				Newcategory nc1 = new Newcategory();
//				nc1.main(null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
}