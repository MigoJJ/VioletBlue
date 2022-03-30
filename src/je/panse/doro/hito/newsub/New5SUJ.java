package je.panse.doro.hito.newsub;

import java.io.FileWriter;		
import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New5SUJ{
	public static void main(String args[]) throws Exception {
		String path = (Enter.wts + "/5SUJ");      
    	String st;
		try (FileWriter fileWriter = new FileWriter(path,true)) {
			Scanner suj_text = new Scanner(System.in);
			System.out.println("Enter Subjective Complains  ...   : ");

			do{
				st = (suj_text.nextLine().trim());
			   if(st.equals("quit")){
		        	System.out.println("Inserted code finished  !  ");
		        	File_cw_chart dn1 = new File_cw_chart();
					dn1.deuxnine();
		        	Newcategory si1= new Newcategory(); 
					si1.main(null); 	
		    	break;
			   }
				System.out.println("st = :  " + st + "\n");
				fileWriter.append(st + "\n");
			  suj_insert(st);

			}while (st != "quit");
			System.out.println("Success");

			suj_text.close();
		}

	}

	private static void suj_insert(String st) throws IOException {
    	String SUJresult = ("   " + st); 
		File_cdrw_proc suj1 = new File_cdrw_proc();
		suj1.writeliner(Enter.wts + "/5SUJ", SUJresult);
	}
    // ---------- 
}

	