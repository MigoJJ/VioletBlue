package je.panse.doro.comm.item_execute;

import java.io.FileWriter;	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcSymptom {
	public static void main(String[] args) throws Exception {
		System.out.println(
		"""
		-------------------------
		1. URI
		2. Hyperthyroidism
		3. Abdominal pain
		
		
		4. Atypical chest pain
		5. Hypothyroidism
		6. DM
		-------------------------
				""");
		
		System.out.println("*****Enter key *****  ...   : ");
		Scanner uaah = new Scanner(System.in);
	   	int scc = Integer.valueOf(uaah.nextLine().trim());
	   		
		String[] a = list_select(scc);         //obtain the array  
		for (int i = 0; i < a.length; i++) {//for loop to print the array  
//			System.out.println( a[i]+ "  ");
			}
		
		ArrayList<String> sympt = new ArrayList<>(Arrays.asList(a));
		//		System.out.println(sympt.toString());
		System.out.println("\n>>>>>>>>> inset the number >>>>>>>>>> ");

		for (int i = 0; i < sympt.size(); i++) {
			int ii=i+1;
			System.out.print( "\n\t"+ii+" ☐ " + sympt.get(i)+"\n");
			}
		String inputNo;
		//		while(sc.hasNextLine() && !(input = sc.nextLine()).equals("")) {
		try(Scanner sc = new Scanner(System.in)) {
			while(!(inputNo = sc.nextLine()).equals("")) {
				System.out.println("\n........... inset the number ...> ");
				int number = (Integer.parseInt(inputNo)-1);
				if (number < sympt.size()) {
					String s = sympt.get(number);
					sympt.set(number,s);	
					for (int i = 0; i < sympt.size(); i++) {
						 if (i!=number) {
//						 System.out.print( "\t☐ " + sympt.get(i)+"\n");
						 }else {
							 if (inputNo.startsWith("0")) {
								 System.out.print( "\t☐ " + sympt.get(i)+"\n");
								 String slschoice = ("☐ " + sympt.get(i));
								 writelinera("/home/migowj/git/Violetblue/src/je/panse/doro/text/samsara/3CC",slschoice);
							 }
							 else {
								 System.out.print( " " + "√  " + sympt.get(i)+"\n");
								 String slschoice = ("√ " + sympt.get(i));
								 writelinera("/home/migowj/git/Violetblue/src/je/panse/doro/text/samsara/3CC",slschoice);
							 }
						}
					}
				}//-----if
			}
			File_cdrw_proc fcp1 = new File_cdrw_proc(); 
			fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
			Newcategory nc1 = new Newcategory();
			nc1.main(null);	
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	private static Object Arrays(ArrayList<String> als) {
		// TODO Auto-generated method stub
		return null;
	}

	static void writelinera(String writef, String fts) throws IOException {
	    try {
	      FileWriter myWriter = new FileWriter(writef, true);
//	      myWriter.write("\t"+fts+"\r");
	      myWriter.write("\t"+fts);

	      myWriter.close();
//		  System.out.println("   ...Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}


	static String[] list_select(int dlist) throws IOException {
		switch (dlist) {
			case 1 : String[] arr={"Febrile sense", "Myalgia","cough", "sputum", "sneezing", "sore throat"};
					return arr;  
			case 2 : String[] arr1={"anxiety & depression", 
					 "irritability & nervousness",
					 "Insomnia", 
					 "Losing weight",
					 "muscle weakness & tremors",
					 "irregular menstrual periods or stop",
					 "sensitive to heat", 
					 "vision problems or eye irritation"};
			return arr1;  
			case 3 : String[] arr2={
					"• Anorexia",
					"• Weight loss (e.g. malabsorption, malignancy)",
					"• Nausea",
					"• Fatigue",
					"• Fever (e.g. intrabdominal infection)",
					"• Pruritis (e.g. cholestasis)",
					"•Confusion (e.g. hepatic encephalopathy)",
					"• Weight loss (e.g. malabsorption, malignancy)"
						};
			return arr2;  
		}
		return null;
	}
	//---------------------------------------------------------	 
}
