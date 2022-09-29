package je.panse.doro.comm.item_subexecute;

import java.io.IOException;	
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class Edcaproc {
	public static void main(String st, String ipath) {
		try {
				if (st.startsWith(":")) {
					String s = Edcaproc.insertDcode(st + "/");
					Edcaproc.suj_insert(s, ipath);
				}
				else if (st.startsWith("]")) {
					st = st.substring(1, st.length());
					Edcaproc.suj_insert(st, "/4PMH");
				}
				else if (st.startsWith(">")) {
						Edcaproc.suj_insert(st, "/5SUJ");
				}
				else if (st.startsWith("#")) {
					Edcaproc.suj_insert(st, "/8ASS");
				}
				else if (st.startsWith("...")) {
					Edcaproc.suj_insert(st, "/9PLAN");
				}
				else {
					Edcaproc.suj_insert(st, ipath);
				}	

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void suj_insert(String st, String ilocation) throws IOException {
    	String SUJresult = ("\n\t" + st); 
		File_cdrw_proc suj1 = new File_cdrw_proc();
		suj1.writeliner(Enter.wts + ilocation, SUJresult);
	}

	public static String insertDcode(String ist) throws IOException {
		String re ="";
		try {
			String[] subOfSuj = ist.split("/", 2);
			subOfSuj[0] = subOfSuj[0].trim(); 
			String sunst0 = subOfSuj[0].substring(1, subOfSuj[0].length());
			String sunst1 = subOfSuj[1].substring(0, subOfSuj[1].length());

			if (subOfSuj[1].length()>0) {
				sunst1 = subOfSuj[1].substring(0, subOfSuj[1].length()-1);
			}
			DiseaseCode e = new DiseaseCode();
			System.out.println(":>>> " + e.code_select(sunst0) + sunst1);
			re = (e.code_select(sunst0) + sunst1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re;
	}

}
