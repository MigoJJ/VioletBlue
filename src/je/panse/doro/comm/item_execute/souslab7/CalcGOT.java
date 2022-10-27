package je.panse.doro.comm.item_execute.souslab7;

import java.util.ArrayList;
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcGOT {

	public static void main(String string) {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
		ccs.main(null);

		ArrayList<String> gotgpt = new ArrayList<String>();

		try {
			String sccStr = "JJ";
			while(!(sccStr).equals("")) {
				System.out.println("\n........ inset GOT GPT GGT Bil Alb ...> ");
				Scanner uaah = new Scanner(System.in);
					sccStr = uaah.nextLine().trim();
					//	   	int scc = Integer.valueOf(uaah.nextLine().trim());
			    gotgpt.add(sccStr);
			    System.out.println(gotgpt);
			}
			gptgptpr(gotgpt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void gptgptpr(ArrayList<String> gotgpt) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		
		ArrayList<String> gotgpt1 = new ArrayList<String>();
		gotgpt1.add("GOT");
				gotgpt1.add("GPT");
						gotgpt1.add("GGT");
								gotgpt1.add("Bil");
										gotgpt1.add("Alb");
									
		int si=gotgpt.size()-1;
		ArrayList<String> gotgpt2 = new ArrayList<>(gotgpt1.subList(0, si));
		System.out.println("gotgpt.size() = " + si);
		System.out.println("gotgpt2 = " + gotgpt2);
		
		try {int ii=0;
			for(String i : gotgpt2) {
				System.out.print(" > " + i);
				System.out.println("... " + gotgpt.get(ii));
				fcp1.writelinera(Enter.wts + "/7LAB", "\t" + i + "... " + gotgpt.get(ii));

				if(i=="GGT") {
					fcp1.writelinera(Enter.wts + "/7LAB", "\n");
				}
				ii++;	
			}
			fcp1.writeliner(Enter.wts + "/7LAB", "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fcp1.readfiler(Enter.wtss + "/7LAB_List");
		New7LAB nc1 = new New7LAB();
		nc1.main(null);
	}
//----------------------------------	
}
