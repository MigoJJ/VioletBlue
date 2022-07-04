package je.panse.doro.comm.item_execute;

import java.io.FileWriter;	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.comm.item_administratus.ClearConsoleScreen;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcSymptom {
	public static void main(String[] args) throws Exception {
		ClearConsoleScreen ccs = new ClearConsoleScreen();
		ccs.main(null);
		System.out.println(
		"""
		-------------------------
		\t1. URI
		\t2. Hypothyroidism
		\t3. Hyperthyroidism
		
		\t4. Abdominal pain
		\t5. Atypical chest pain
		
		\t6. DM
		-------------------------
				""");
		
		System.out.println("*****Enter key *****  ...   : ");
		Scanner uaah = new Scanner(System.in);
	   	int scc = Integer.valueOf(uaah.nextLine().trim());
	   	
	   	if(scc==0 | scc >= 6) {
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			Newcategory nc1 = new Newcategory();
			nc1.main(null);
	   	}
	   		   		
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
								 writelinera(Enter.wts + "/5SUJ", slschoice);
							 }
							 else {
								 System.out.print( " " + "√  " + sympt.get(i)+"\n");
								 String slschoice = ("√ " + sympt.get(i));
								 writelinera(Enter.wts + "/5SUJ", slschoice);
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

	static void writelinera(String writef, String fts) throws IOException {
	    try {
	      FileWriter myWriter = new FileWriter(writef, true);
//	      myWriter.write("\t"+fts+"\r");
	      myWriter.write("\t"+fts);
	      myWriter.close();
		  System.out.println("   ...Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}

	static String[] list_select(int dlist) throws Exception {
		switch (dlist) {
			case 1 : String[] arr={"Febrile sense", "Myalgia","cough", "sputum", "sneezing", "sore throat"};
					return arr;  
			case 2 : String[] arr1={
					"Losing weight",
					"muscle weakness & tremors",
					"anxiety & depression", 
					"irritability & nervousness",
					"Insomnia", 
					"irregular menstrual periods or stop",
					"sensitive to heat", 
					"vision problems or eye irritation"
					};
					return arr1;  
			case 3 : String[] arr2= {		
					"tiredness","being sensitive to cold","weight gain","constipation",
					"depression","slow movements and thoughts","muscle aches and weakness",
					"muscle cramps","dry and scaly skin","brittle hair and nails",
					"loss of libido (sex drive)",
					"pain, numbness and a tingling sensation in the hand and fingers "
					+ "(carpal tunnel syndrome) irregular periods or heavy periods"
					};
					return arr2;  
					
			case 4 : String[] arr3={
					" Anorexia",
					" Nausea",
					" Fatigue",
					" Fever", 
					" Pruritis (cholestasis)",
					" Confusion", 
					" Weight loss"," Weight gain" 
					 };
					return arr3;  
			case 5 : String[] arr4={
					"Shortness of breath","Nausea, vomiting, or belching",
					"Sweating","Cold, clammy skin","Irregular or rapid heart rate",
					"Palpitations","Fatigue","Dizziness","Fainting",
					"Indigestion, vomiting","Vague abdominal discomfort",
					"Tingling sensation in either arm (more often the left) or shoulder"
					};
					return arr4;
			case 6 : String[] arr5={
					"Urinate (pee) a lot, often at night",
					"Are very thirsty",
					"Lose weight without trying",
					"Are very hungry",
					"Have blurry vision",
					"Have numb or tingling hands or feet",
					"Feel very tired",
					"Have very dry skin",
					"Have sores that heal slowly",
					"Have more infections than usual"
					};
					return arr5;  
	   		
	   		case 9 : case 99: case 999 :	
	   			Key_Iwbb st999 = new Key_Iwbb(); 
	   			st999.Key_Iwbb_Page(dlist); break;
			default :
				System.out.println(" uncertain ... please check  !!");
		}
		return null;
	}
	//---------------------------------------------------------	 
}
