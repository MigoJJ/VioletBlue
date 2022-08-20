package je.panse.doro.hito.newsub;

import java.util.Scanner;
import je.panse.doro.comm.Key_returnquit;
import je.panse.doro.comm.item_subexecute.Edcamain;

public class New4PMH {

	public static void main(String[] args) throws Exception {
		New4PMHni.main(null);
		String st="JJ";
		System.out.println("*****Enter Past Medical Hostory*****  ...   : ");

		do {
		try {
			Scanner suj_text = new Scanner(System.in);
			st = (suj_text.nextLine().trim());
			Edcamain.main(st,"/5PMH");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} while (!(st == ""));
			Key_returnquit krq = new Key_returnquit();
			krq.mainquit(st);
		}

// ---------- 
}

	