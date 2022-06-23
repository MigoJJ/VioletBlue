package je.panse.doro.hito.newsub;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New4PMH {
	public static void main(String[] args) throws Exception { 
		String pmhlist = ("""
				☐ asthma     ☐ tuberculosis  ☐ hepatitis
				☐ operation  ☐ hearing loss  ☐ arthritis
				☐ CVA    ☐ Cognitive disorder 
				☐ DM     ☐ HTN    ☐ Dyslipidemia 
				☐ Cancer ☐ GERD   ☐ COPD
				FHx>  
				Allergy> ☐ food  ☐ injection/IV
				""");
		System.out.println(pmhlist);
			String	delims = "[☐]+";
			String[] tokens = pmhlist.split(delims);

			for (int i = 0; i < tokens.length; i++) {
//				System.out.println("[ " + i + " ]" + "\t" + tokens[i]);
			    Scanner pmhistory = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter Positive History");
			    String hist = pmhistory.nextLine();  // Read user input
				switch(hist) {
						case "as" : tokens[i]= "[v] asthma"; mergeSring(tokens[i]); break;
						case "tu" : tokens[i]= "[v] tuberculosis";mergeSring(tokens[i]); break;
						case "he" : tokens[i]= "[v] hepatitis";mergeSring(tokens[i]); break;
						case "op" : tokens[i]= "[v] operation";mergeSring(tokens[i]); break;
						case "hl" : tokens[i]= "[v] hearing loss";mergeSring(tokens[i]); break;
						case "ar" : tokens[i]= "[v] arthritis";mergeSring(tokens[i]); break;
						case "cv" : tokens[i]= "[v] CVA";mergeSring(tokens[i]); break;
						case "co" : tokens[i]= "[v] Cognitive disorder";mergeSring(tokens[i]); break;
						case "dm" : tokens[i]= "[v] DM";mergeSring(tokens[i]); break;
						case "ht" : tokens[i]= "[v] HTN";mergeSring(tokens[i]); break;
						case "dy" : tokens[i]= "[v] Dyslipidemia";mergeSring(tokens[i]); break;
						case "ca" : tokens[i]= "[v] Cancer";mergeSring(tokens[i]); break;
						case "ge" : tokens[i]= "[v] GERD";mergeSring(tokens[i]); break;
						case "cop" : tokens[i]= "[v] COPD";mergeSring(tokens[i]); break;
						case "fo" : tokens[i]= "[v] Food";mergeSring(tokens[i]); break;
						case "iv" : tokens[i]= "[v] injection/IV";mergeSring(tokens[i]); break;
						case "dr" : tokens[i]= "[v] Drug Allergy";mergeSring(tokens[i]); break;
						
						case "q" :
							Newcategory    cc1  = new Newcategory(); 
							File_cw_chart  dn1  = new File_cw_chart();
							dn1.deuxnine();
							Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
							cc1.main(null);
							    break;
		 		       default:
		 					System.out.println("[ " + i + " ]" + "\t" + "☐" + tokens[i] );
				}
			}
//	 			File_cdrw_proc fcp1 = new File_cdrw_proc();
//				fcp1.writeliner(Enter.wts + "/7LAB", "\n\t" + tokens[i]);
			try (Scanner s = new Scanner(System.in)) {
				System.out.println(">>> Enter PMH ...>>>:");
				String pmh = s.nextLine();
				
				File_cdrw_proc fcp1 = new File_cdrw_proc();
				File_cw_chart  dn1  = new File_cw_chart();
				Newcategory    cc1  = new Newcategory(); 
				fcp1.writeliner(Enter.wts + "/4PMH", "\n\t" + pmh);
				dn1.deuxnine();
				Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
				cc1.main(null);
			}catch (IOException e) {
			e.printStackTrace();
			}
	}
		String readfiler(String readf) {
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
		static void mergeSring(String reads) throws IOException {
//			String finalString="";
//			System.out.println("\t" + readf);
//			finalString = readf;
//			System.out.println("\t" + finalString);
 			File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/4PMH", "\t" + reads);			
	    }		
//------------------------------------
	}
