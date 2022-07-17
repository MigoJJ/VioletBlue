package je.panse.doro.comm.item_execute.soussymp12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.main.Enter;

public class SymptomEnter {
	R_rl_excel4 rre1 = new R_rl_excel4();
	String excelFilePath = (Enter.wd + "/aeternum/dataxlsx/Sympt12List1.xlsx");

	public void main(String[] args) throws Exception {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
		ccs.main(null);
		eppu(null);
	}
		
	private void eppu(String[] eppuNo) throws Exception {
		Integer submenuNo = 1;
		try {
				while(submenuNo != 9) {
					rre1.main(0,0,excelFilePath);
					System.out.println(">>> insert code ...");
					Scanner sc = new Scanner(System.in);
						submenuNo = sc.nextInt();
						String ret = R_rl_excel_pick.R_rl_excel_point(submenuNo-1,0,0,excelFilePath);
						int colNo=1;
						if (ret.trim().startsWith("DM")) {	colNo=0;}
						else if (ret.trim().startsWith("Thy")) {	colNo=1;}
						else if (ret.trim().startsWith("URI")) {	colNo=2;}
						else if (ret.trim().startsWith("Abo")) {	colNo=3;}
						else if (ret.trim().startsWith("Aty")) {	colNo=4;}
						else {
						}
						rre1.main(1,colNo,excelFilePath);
						eppu_cell(colNo);
						File_cw_chart rre1 = new File_cw_chart();
						rre1.writechart(); 
				}
		//		nc1.main(null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private void eppu_cell(int eppuCellNo) throws Exception {
		try {
			int sousNoi = 0;
			while(sousNoi != 9) {			
			System.out.println(">>> insert code ...");
			Scanner sc = new Scanner(System.in);
			String sousNo =sc.nextLine();	
			sousNoi = Integer.parseInt(sousNo);
					String pret = R_rl_excel_pick.R_rl_excel_point(sousNoi-1,eppuCellNo,1,excelFilePath);
					if(sousNoi !=9) {
					 if (sousNo.startsWith("0")) {
						 System.out.print( "\t☐" + pret+"\n");
						 String slschoice = ("☐ " + pret.trim());
						 writelinera(Enter.wts + "/5SUJ", slschoice + "\n");
					 }
					 else {
						 System.out.print( "\t√" + pret +"\n");
						 String slschoice = ("√ " + pret.trim());
						 writelinera(Enter.wts + "/5SUJ", slschoice + "\n");
					 }
				}
			}
		//		nc1.main(null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	private void writelinera(String writef, String fts) throws IOException {
	    try {
	      FileWriter myWriter = new FileWriter(writef, true);
//	      myWriter.write("\t"+fts+"\r");
	      myWriter.write("\t"+fts);
	      myWriter.close();
//		  System.out.println("   ...Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
//---------------------------
}