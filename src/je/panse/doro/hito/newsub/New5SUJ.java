package je.panse.doro.hito.newsub;

import java.util.Scanner;
import je.panse.doro.comm.Key_returnquit;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.comm.item_subexecute.Edcamain;

public class New5SUJ{
	public static void main(String args) throws Exception {
		String st="JJ";
		System.out.println("\n\n*****Enter Subjective complaint*****  ...   : ");

		do {
		try {
			Scanner suj_text = new Scanner(System.in);
			st = (suj_text.nextLine().trim());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Edcamain.main(st,"/5SUJ");
		} while (!(st == ""));
			Key_returnquit krq = new Key_returnquit();
			krq.mainquit(st);
		}
	// ---------- 
}
