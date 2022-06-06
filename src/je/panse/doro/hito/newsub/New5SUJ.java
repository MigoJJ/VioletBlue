package je.panse.doro.hito.newsub;

import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New5SUJ{
	public static void main(String args, Menu_list suj_insert) throws Exception {
		String st;
		try {
			Scanner suj_text = new Scanner(System.in);
			System.out.println("*****Enter Subjective Complains*****  ...   : ");
			do{
				st = (suj_text.nextLine().trim());
			   if(st.equals("quit")|st.equals("q")|st.equals("ㅂ")){
			    	System.out.println("Inserted code finished  !  ");
						Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
				    	File_cw_chart dn1 = new File_cw_chart();
				    	Newcategory si1= new Newcategory(); 
						dn1.deuxnine();
						si1.main(null); 	
			    	break;
			}
				if (st.startsWith(":")) {
					New5SUJ.insertDcode(st);
				}
				else {
					System.out.println("st = :  " + st + "\n");
					New5SUJ.suj_insert(st);
				}
			}while (st != "quit");
				System.out.println("Success");
				suj_text.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void suj_insert(String st) throws IOException {
    	String SUJresult = ("    " + st); 
		File_cdrw_proc suj1 = new File_cdrw_proc();
			suj1.writeliner(Enter.wts + "/5SUJ", SUJresult);
	}
	
	static void insertDcode(String ist) throws IOException {
			String aa = ist.substring(1, ist.length());
			DiseaseCode e = new DiseaseCode();  
			System.out.println(e.code_select(aa));
				ist = e.code_select(aa);
				System.out.println("st = :  " + ist + "\n");
			New5SUJ.suj_insert(ist);
			return;
		}
	// ---------- 
}

	