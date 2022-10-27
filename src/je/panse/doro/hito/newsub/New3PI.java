package je.panse.doro.hito.newsub;

import java.util.Scanner;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_returnquit;
import je.panse.doro.comm.item_subexecute.Edcamain;
import je.panse.doro.main.Enter;

public class New3PI{
	public static void main(String args) throws Exception {
		File_cdrw_proc 	fcp = new File_cdrw_proc();
		fcp.writeliner(Enter.wts + "/3CC","P.I. >");
		String st="JJ";
		System.out.println("*****Enter Present illness*****  ...   : ");

		do {
			try {
				Scanner suj_text = new Scanner(System.in);
				st = (suj_text.nextLine().trim());
			} catch (Exception e) {
				e.printStackTrace();
			}
				Edcamain.main(st,"/3CC");
		} while (!(st.equals("")));
			Key_returnquit krq = new Key_returnquit();
			krq.mainquit(st);
	}
}