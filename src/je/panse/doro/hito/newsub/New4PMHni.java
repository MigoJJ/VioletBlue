package je.panse.doro.hito.newsub;

import java.io.FileWriter;	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import je.panse.doro.main.Enter;

public class New4PMHni {
	public static void main(String[] args) {
		String printpmh="";
		System.out.println("PMHx>------------------------------");
		System.out.print("\t");
		ArrayList<String> pmh = new ArrayList<>(Arrays.asList(
			"diabetes mellitus","HTN","dyslipidemia\n",
			"Cancer","operation","thyroid disease\n",
			"asthma","tuberculosis","pneumonia\n",
			"chronic/acute hepatitis","GERD\n",
			"gout","arthritis", "hearing loss\n",
			"CVA","depression","cognitive disorder\n",
			"Allergy>\n","medication","injection/IV","food\n")
		);
		for (String pmhx : pmh) {
		    System.out.print(pmh.indexOf(pmhx)+" "+pmhx+"    ");
		}
		System.out.println("...have been suffered ⯀\n\t---------------------------");
		System.out.println("\t[ v ] No known allergy with any medication");
		try {
			ArrayList<String> returnedPmh = new ArrayList<>(Arrays.asList());
			returnedPmh = (ArrayList<String>) pmhinList(pmh);
			for (String pmhx : pmh) {
				int varpmhindex = pmh.indexOf(pmhx);	
				printpmh=("\t ☐ "+  pmhx);
				pmh.set(varpmhindex,printpmh);
				for (String pmhx1 : returnedPmh) {
					int intpmhx1 = Integer.parseInt(pmhx1);
					if (intpmhx1 == varpmhindex) {
						printpmh=("\t ⯀ "+  pmhx);
						pmh.set(varpmhindex,printpmh);
					} else {}
					}
				}
			System.out.print("\n"+pmh);		
			writeToFile(pmh);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static Object pmhinList(ArrayList<String> pmhin) {
		ArrayList<String> pmhchoice = new ArrayList<String>();
		try {
			String sccStr = "JJ";
			System.out.println("\n.......Past Medcal History Pickup...> ");
			while(!(sccStr).equals("")) {
				Scanner uaah = new Scanner(System.in);
					sccStr = uaah.nextLine().trim();
					pmhchoice.add(sccStr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int si=pmhchoice.size()-1;
		ArrayList<String> pmhchoice1 = new ArrayList<>(pmhchoice.subList(0, si));
		New4PMHni arrayPrint = new New4PMHni();
		return pmhchoice1;
	}
	
	static void writeToFile(ArrayList<String> pmhw) {
	    try {
    	FileWriter myWriter = new FileWriter(Enter.wt + "/samsara/4PMH");
	    	myWriter.write("PMHx>------------------------------\n");
			for (String pmhx : pmhw) {
				myWriter.write(pmhx);
			}
	    	myWriter.write("\t...have been suffered ⯀\n\t---------------------------\n");
	    	myWriter.write("\t[ v ] No known allergy with any medication");
	    	myWriter.close();
	    	System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
		    System.out.println("An error occurred.");
		    e.printStackTrace();
	    }
	}
		//----------------------------------
}
