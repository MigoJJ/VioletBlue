package je.panse.doro.fourgate.thyroid.pregnancy;

import java.util.ArrayList;
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.fourgate.thyroid.ThyroidEnter;
import je.panse.doro.main.Enter;

public class Pregnancymain {
	public static void main(String[] args) throws Exception {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
		ccs.main(null);

		ArrayList<String> thypreg = new ArrayList<String>();
		try {
			String sccStr = "JJ";
			while(!(sccStr).equals("")) {
				System.out.println("\n.... Pregnancy #   weeks   due date   Dx  GY .......");
				Scanner uaah = new Scanner(System.in);
					sccStr = uaah.nextLine().trim();
					thypreg.add(sccStr);
			    System.out.println(thypreg);
			}
			int si=thypreg.size()-1;
			ArrayList<String> thypreg1 = new ArrayList<>(thypreg.subList(0, si));
			System.out.println("thypreg1.size() = " + si);
			System.out.println("thypreg1 = " + thypreg1);
			
			String p0 = thypreg1.get(0);
			String p1 = thypreg1.get(1);
			String p2 = thypreg1.get(2);
			String p3 = thypreg1.get(3);
			String p4 = thypreg1.get(4);
			
			String pp3="";
			switch(p3){
			case "o": pp3 = "Hypothyroidism Dx";break;
			case "e": pp3 = "Hyperthyroidism";break;
			default:	System.out.println("unkonwn");
			}
			
			String pp4="";
			switch(p4){
			case "c": pp4 = "청담마리 산부인과";break;
			case "d": pp4 = "도곡함춘 산부인과";break;
			case "o": pp4 = "기타 산부인과";break;
			default:	System.out.println("존재하지 않는 산부인과 입니다.");
			}
			System.out.printf("# %s preganacy  %s weeks  Due-date %s at %s", p0,p1,p2,pp3);
			String tpr =  String.format("# [ %s ]preganacy  [ %s ]weeks\tDue-date [%s]\n\t\t%s at %s", p0,p1,p2,pp3,pp4);
			File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/3CC", tpr);

		} catch (Exception e) {
			e.printStackTrace();
		}
		File_cw_chart dn1 = new File_cw_chart();
		ThyroidEnter 	cc1 = new ThyroidEnter(); 
    		dn1.deuxnine();
    		cc1.main(null);

		
	}
}