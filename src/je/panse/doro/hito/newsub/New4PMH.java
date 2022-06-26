package je.panse.doro.hito.newsub;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.fourgate.thyroid.thycomm.LmDeux;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New4PMH {
	public static void main(String[] args) throws Exception { 
 		try {
			File_cdrw_proc fcp1 = new File_cdrw_proc();

			String pmhlist = ("""
					\t..............................
					\t☐ asthma     ☐ tuberculosis  ☐ hepatitis
					\t☐ operation  ☐ hearing loss  ☐ arthritis
					\t☐ CVA    ☐ Cognitive disorder 
					\t☐ DM     ☐ HTN    ☐ Dyslipidemia 
					\t☐ Cancer ☐ GERD   ☐ COPD
					\tFHx>  
					\tAllergy> ☐ food  ☐ injection/IV
					\t..............................\n
					""");
			System.out.println(pmhlist);
			System.out.println("Negativet symbol : \u221A"); //√
			System.out.println("Positive Symbol : \u2611"); //☑
			System.out.println("Positive Symbol : \u2BC0"); //

			String dcode ="";
			while (true) {
			    if(dcode.equals("9")|dcode.equals("q")| dcode.equals("ㅂ")) {

					File_cw_chart  dn1  = new File_cw_chart();
					Newcategory    cc1  = new Newcategory(); 
					dn1.deuxnine();
					cc1.main(null);
			        }
			    else {
				Scanner pmhistory = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter Positive History >>>");
					DiseaseCode e =new DiseaseCode(); 
				    dcode = pmhistory.nextLine().trim();  // Read user input
				    System.out.println(e.code_select(dcode)); 

						String	delims = "[#]+";
						String[] tokens = e.code_select(dcode).split(delims);
					    System.out.println("tokens[0] = [ \u221A ] " + tokens[0]); 
					    System.out.println("tokens[1] = [ \u221A ] " + tokens[1]); 
	    			    
					fcp1.writeliner(Enter.wts + "/4PMH", "\r\t[ \u221A ] " + tokens[1]);
					fcp1.writeliner(Enter.wts + "/8ASS", "\t" + e.code_select(dcode));
				}
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

    public static String readfiler(String readf) {
		String finalString="";
		try{
				File textDirName = new File(readf); 
					Scanner myReader = new Scanner(textDirName);
					StringBuilder stringBuilder = new StringBuilder();
					while (myReader.hasNextLine()) {
							String data = myReader.nextLine().trim();
							stringBuilder.append(data);
					}
					finalString = stringBuilder.toString();
					System.out.println(finalString);
		       myReader.close();
			}catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		return finalString;
    }
//------------------------------------
}