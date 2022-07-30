package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_returnquit;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.main.Enter;

public class New3PI{
	public static void main(String args) throws Exception {
		String st;
		New3PI.suj_insert("P.I. >", "/3CC");
		try {
			System.out.println("*****Enter Present illness*****  ...   : ");
			Scanner suj_text = new Scanner(System.in);
			do{
				st = (suj_text.nextLine().trim());
				if(st.equals("quit")|st.equals("q")|st.equals("ㅂ")){
					Key_returnquit krq = new Key_returnquit();
						krq.mainquit(st);
					break;
				}
//				else if (st.startsWith(">")) {
//					New3PI.insertDcode(st + "/");
//				}
				else if (st.startsWith(":")) {
					New3PI.insertDcode(st + "/");
				}
				else if (st.startsWith("]")) {
					st = st.substring(1, st.length());
					New3PI.suj_insert(st, "/4PMH");
				}
				else if (st.startsWith("#")) {
					New3PI.suj_insert(st, "/8ASS");
				}
				else if (st.startsWith("...")) {
					New3PI.suj_insert(st, "/9PLAN");
				}
				else {
					System.out.println("st = :  " + st + "\n");
					New3PI.suj_insert(st, "/3CC");
				}
			}while (st != "quit");
					System.out.println("Success");
					suj_text.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void suj_insert(String st, String ilocation) throws IOException {
    	String SUJresult = ("\t" + st); 
		File_cdrw_proc suj1 = new File_cdrw_proc();
			suj1.writeliner(Enter.wts + ilocation, SUJresult);
	}

	static void insertDcode(String ist) throws IOException {
		try {
			String[] subOfSuj = ist.split("/", 2);
					 subOfSuj[0] = subOfSuj[0].trim(); 
			String sunst0 = subOfSuj[0].substring(1, subOfSuj[0].length());
					System.out.println(subOfSuj[0].length());
					System.out.println(subOfSuj[1].length());
			DiseaseCode e = new DiseaseCode();
					New3PI.suj_insert("PMHx>", "/8ASS");
					New3PI.suj_insert(e.code_select(sunst0) + subOfSuj[1], "/8ASS");
					System.out.println(":>>> " + e.code_select(sunst0) + subOfSuj[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	// ---------- 
}

	