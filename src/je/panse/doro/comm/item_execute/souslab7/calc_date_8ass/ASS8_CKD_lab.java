package je.panse.doro.comm.item_execute.souslab7.calc_date_8ass;

import je.panse.doro.comm.item_administratus.loop.CurrentDateAdd_date;
import je.panse.doro.comm.item_subexecute.Edcamain;

public class ASS8_CKD_lab {
	public static void main(String A1, String G1) {
		String rRACreatio[] = A1.split(":");
		String rReGFR[] = G1.split(":");
		rRACreatio[0] = rRACreatio[0].trim();
		rReGFR[0] = rReGFR[0].trim();
		
		String RCKD =  ("# DM nephropathy evlaution "
				+ "[ CKD "+rRACreatio[0]+" "+ rReGFR[0]+" : "+ CurrentDateAdd_date.main("m")+" ]");
		System.out.printf("[ CKD %s %s : %s ]",rRACreatio[0], rReGFR[0], CurrentDateAdd_date.main("m"));
		Edcamain.main(RCKD,"/8ASS");
	}
}