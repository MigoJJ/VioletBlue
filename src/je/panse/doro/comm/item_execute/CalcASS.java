package je.panse.doro.comm.item_execute;
	
import java.util.Scanner;

import je.panse.doro.comm.item_administratus.key.Key_returnquit;
import je.panse.doro.comm.item_subexecute.Edcamain;

public class CalcASS {
	public static void main(String skeys) throws Exception{
		String st="JJ";
		System.out.println("\n\n*****Enter Assessment*****  ...   : ");

		do {
		try {
			Scanner suj_text = new Scanner(System.in);
			st = (suj_text.nextLine().trim());
			Edcamain.main(st,"/8ASS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		} while (!(st == ""));
			Key_returnquit krq = new Key_returnquit();
			krq.mainquit(st);
		}
//------------------------------------------------
}
